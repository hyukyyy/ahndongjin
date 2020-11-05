package com.ahndongjin.ahndongjin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ahndongjin.ahndongjin.domain.Quest;
import com.ahndongjin.ahndongjin.domain.Subject;
import com.ahndongjin.ahndongjin.domain.User;
import com.ahndongjin.ahndongjin.service.TeamServiceImpl;
import com.ahndongjin.ahndongjin.service.UserService;
import com.ahndongjin.ahndongjin.service.UserServiceImpl;

@Controller
public class WelcomeController {
	
	@Autowired
	@Qualifier("userService")
	private UserServiceImpl userservice;	
	
	@Autowired
	@Qualifier("teamService")
	private TeamServiceImpl teamservice;
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String main(Model model) throws Exception{
		String userEmail=userservice.getEmail(1);
		User user=userservice.getUser(1);
		List<Quest> questList=userservice.getQuest(1);
		List<Subject> subjectList=teamservice.getSubjectList(1);
		
		model.addAttribute("user", user);
		model.addAttribute("userEmail", userEmail);
		model.addAttribute("subjectList",subjectList);
		model.addAttribute("questList",questList);
				
		return "home";
	}
}
