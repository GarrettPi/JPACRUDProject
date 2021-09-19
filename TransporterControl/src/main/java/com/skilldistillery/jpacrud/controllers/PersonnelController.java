package com.skilldistillery.jpacrud.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.skilldistillery.jpacrud.data.TransporterDAO;
import com.skilldistillery.jpacrud.entities.Personnel;

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
	
	@RequestMapping(path="updateLog.do")
	public ModelAndView updateLog(@RequestParam("personnelId") int id) {
		ModelAndView mv = new ModelAndView();
		Personnel personnel = dao.findById(id);
		mv.setViewName("updatelog");
		mv.addObject("personnel", personnel);
		return mv;
	}
	
	@RequestMapping(path="logUpdated.do")
	public ModelAndView updated(Personnel personnel) {
		ModelAndView mv = new ModelAndView();
		Personnel updated = dao.updateRecord(personnel);
		mv.addObject("personnel", updated);
		mv.setViewName("logupdated");
		return mv;
	}
	
	@RequestMapping(path="createLog.do")
	public ModelAndView createLog() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("createlog");
		return mv;
	}
	
	@RequestMapping(path="logCreated.do", method=RequestMethod.POST)
	public ModelAndView created(Personnel personnel) {
		ModelAndView mv = new ModelAndView();
		dao.createRecord(personnel);
		mv.setViewName("logcreated");
		mv.addObject("personnel", personnel);
		return mv;
	}
	
	@RequestMapping(path="deleteLog.do")
	public ModelAndView deleteLog(@RequestParam("id") int id) {
	ModelAndView mv = new ModelAndView();
	Personnel personnel = dao.deleteRecord(id);
	mv.setViewName("logdeleted");
	mv.addObject("personnel", personnel);
	return mv;
	}
	
}
