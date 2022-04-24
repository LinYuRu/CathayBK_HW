package com.m3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ViewController {
    @GetMapping(value = {"/home"})
    public String home() {
        return "home";
    }
    
	@RequestMapping(value="/start", method = RequestMethod.GET)
	public ModelAndView startMessage() {
		System.out.println("in controller");

		ModelAndView mv = new ModelAndView("start");

		return mv;
	}
}
