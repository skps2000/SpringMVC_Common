package com.spring.common;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spring.common.dao.MainDao;

@Controller
public class MainController {
	
	private static final Logger log = Logger.getLogger(MainController.class);
	
	@Autowired
	MainDao mDao;
	
	@RequestMapping(value="/generic", method=RequestMethod.GET)
	public String generic(HttpServletRequest req, HttpServletResponse res, ModelAndView mav){
		HashMap pMap = new HashMap<String, Object>();
		HashMap resultMap;
		
		resultMap = mDao.selOne(pMap);
		
		return "generic"; 
	}
	
	@RequestMapping(value="/tiles", method=RequestMethod.GET)
	public String tiles(HttpServletRequest req, HttpServletResponse res, ModelAndView mav){
		return "contents/content/tiles"; 
	}
	
	
	

}
