package com.ahndongjin.ahndongjin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

import org.apache.ibatis.annotations.Param;
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
	

	@RequestMapping(value="/teampage",method=RequestMethod.GET)
	public String teamPage(@RequestParam("id") int team_id,Locale locale, Model model) {
		
		List<Subject> subjectList = teamservice.getSubjectList(team_id);
		List<Integer> userIdList= teamservice.getMemberId(team_id);
		List<Avatar> avatarList = teamservice.getMemberAvatar(team_id);
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
	public String listPage(@RequestParam("id") int quest_id,Locale locale, Model model) {
		
		
		Quest quest=teamservice.getQuest(quest_id);
		User user=userservice.getUser(quest.getUser_id());
		
		model.addAttribute("quest",quest);
		model.addAttribute("user",user);
		
		return "listpage";
	}
	
	@RequestMapping(value="/delete")
	public String delQuest(@RequestParam("id") int quest_id,Locale locale, Model model) {
		
		System.out.println(quest_id);
		
		userservice.delQuest(quest_id);
		
		System.out.println("삭제 완료다 십덕아");
		
		return "redirect : /ahndongjin/teampage?id=1";
	}

	@RequestMapping(value="/update",method=RequestMethod.POST)
	public String updateQuest(@Param("quest_content") String quest_content,@RequestParam("id") int quest_id,Locale locale, Model model) {
		
		System.out.println(quest_content);
		
		HashMap<String,Object> updateMap=new HashMap<String,Object>();
		updateMap.put("quest_content",quest_content);
		updateMap.put("quest_id",quest_id);
		
		System.out.print(updateMap.get("quest_content"));
				
		userservice.setQuest(updateMap);
		
		return "redirect:/questpage?id=1";
	}

}

















