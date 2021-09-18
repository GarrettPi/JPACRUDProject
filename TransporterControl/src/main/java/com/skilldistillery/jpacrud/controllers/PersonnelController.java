package com.skilldistillery.jpacrud.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.skilldistillery.jpacrud.data.TransporterDAO;

@Controller
public class PersonnelController {

	@Autowired
	private TransporterDAO dao;
	
	@RequestMapping(path= {"/", "home.do"})
	public ModelAndView home() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("home");
		return mv;
	}
	
	@RequestMapping(path="viewLogs.do")
	public ModelAndView viewLogs() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("viewlogs");
		mv.addObject("personnelList", dao.findAll());
		return mv;
	}
	
	
	
	
	
	
	
}
