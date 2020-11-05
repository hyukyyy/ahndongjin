package com.ahndongjin.ahndongjin;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ahndongjin.ahndongjin.domain.Avatar;
import com.ahndongjin.ahndongjin.domain.Quest;
import com.ahndongjin.ahndongjin.domain.Subject;
import com.ahndongjin.ahndongjin.domain.User;
import com.ahndongjin.ahndongjin.service.TeamServiceImpl;
import com.ahndongjin.ahndongjin.service.UserServiceImpl;

@Controller
public class TeamController {
	
	@Autowired
	@Qualifier("userService")
	private UserServiceImpl userservice;	
	
	@Autowired
	@Qualifier("teamService")
	private TeamServiceImpl teamservice;
	

	@RequestMapping(value="/teampage/",method=RequestMethod.GET)
	public String teamPage(Locale locale, Model model) {
		
		List<Subject> subjectList = teamservice.getSubjectList(1);
		List<Integer> userIdList= teamservice.getMemberId(1);
		List<Avatar> avatarList = teamservice.getMemberAvatar(1);
		List<List<Quest>>questList=new ArrayList<List<Quest>>(userIdList.size());
		
		for(int user_id:userIdList) {
			questList.add(userservice.getQuest(user_id));
		}
		
		model.addAttribute("subjectList",subjectList);
		model.addAttribute("avatarList",avatarList);
		model.addAttribute("questList",questList);
		
		return "index1";
	}
	
	@RequestMapping(value="/questpage")
	public String listPage(@RequestParam("quest_id") int quest_id,Locale locale, Model model) {
		
		
		Quest quest=teamservice.getQuest(quest_id);
		User user=userservice.getUser(quest.getUser_id());
		
		model.addAttribute("quest",quest);
		model.addAttribute("user",user);
		
		return "listpage";
	}
}

















