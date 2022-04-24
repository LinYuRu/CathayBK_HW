$(function () {
    var configMap = {
        post_html: '<div class="post-container">' +
            '            <div class="title">' +
            '                <input class="line-input" type="text" placeholder="標題"/>' +
            '            </div>' +
            '            <div class="line-container">' +
            '            </div>' +
            '        </div>',
        line_html:
            '<div class="line">' +
            '   <input class="line-input" type="text" placeholder="記事"/>' +
            '</div>',
        lineAmount: 4
    };
    var $container = $("#container"),
        $addPostContainer = $("#add-post-container"),
        $viewPostContainer = $("#view-post-container");

    var getData = function ($postContainer) {
        var lines = [];
        $postContainer.find(".line").each(function () {
            var line = {}, $this = $(this);
            line.content = $this.find("input").val();
            var id = $this.data("id");
            if (id) {
                line.id = id;
            }
            lines.push(line);
        });
        var data = {
            name: $postContainer.find(".title input").val(),
            lines: lines
        };
        var postId = $postContainer.data("id");
        if (postId) {
            data.id = postId;
        }
        return data;
    };
    var insertPost = function () {
        var $postContainer = $(this).parents(".post-container");
        var data = getData($postContainer);
        $.ajax({
            url: "/post",
            type: "POST",
            contentType: "application/json",
            data: JSON.stringify(data)
        }).then(function (post) {
            addPost(post);
        })
    };
    var editPost = function () {
        var $postContainer = $(this).parents(".post-container");
        var data = getData($postContainer);
        $.ajax({
            url: '/post',
            type: 'PUT',
            contentType: "application/json",
            data: JSON.stringify(data)
        }).then(function (resp) {
            console.log(resp)
        });

    };
    var deletePost = function () {
        if (confirm("確定要刪除嗎？")) {
            var $postContainer = $(this).parents(".post-container");
            $.ajax({
                url: '/post/' + $postContainer.data("id"),
                type: 'DELETE'
            }).then(function () {
                $postContainer.remove();
            });
        }
    };

    var $insertBtn = $('<button class="insert-btn">新增</button>');
    var $okBtn = $('<button class="ok-btn">確認</button>')
    var $deleteBtn = $('<button class="delete-btn">刪除</button>')

    $container.on("click", ".insert-btn", insertPost);
    $container.on("click", ".ok-btn", editPost);
    $container.on("click", ".delete-btn", deletePost);


    var $postByInsert = $(configMap.post_html);
    $postByInsert.append($insertBtn.clone(true));
    $addPostContainer.append($postByInsert);
    var $lineContainer = $addPostContainer.find(".line-container");

    for (var i = 1; i <= configMap.lineAmount; i++) {
        $lineContainer.append(configMap.line_html)
    }

    $.get("/post").then(function (posts) {
        posts.forEach(function (post) {
            addPost(post);
        })
    })

    var addPost = function (post) {
        var $postContainer = $(configMap.post_html);
        $postContainer.data("id", post.id);
        $postContainer.append($okBtn.clone(true));
        $postContainer.append($deleteBtn.clone(true));
        var $lineContainer = $postContainer.find(".line-container");
        $postContainer.find(".title input").val(post.name);
        post.lines.forEach(function (line) {
            var $line = $(configMap.line_html);
            $line.data("id", line.id);
            $line.find("input").val(line.content);
            $lineContainer.append($line);
        });
        $viewPostContainer.append($postContainer);
    }
});