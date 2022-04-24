
CREATE TABLE  Dollars (
  dollarId	int IDENTITY, 
  dollar_kind	varchar(5),
  dollar_name varchar(5),
  primary key(dollarId)
    
);
INSERT INTO Dollars (dollarId,dollar_kind,dollar_name) VALUES (1,'USD','美元');
INSERT INTO Dollars (dollarId,dollar_kind,dollar_name) VALUES (2,'GBP','英鎊');
INSERT INTO Dollars (dollarId,dollar_kind,dollar_name) VALUES (3,'EUR','歐元');