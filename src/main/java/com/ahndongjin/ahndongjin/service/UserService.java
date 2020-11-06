package com.ahndongjin.ahndongjin.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ahndongjin.ahndongjin.domain.Avatar;
import com.ahndongjin.ahndongjin.domain.Quest;
import com.ahndongjin.ahndongjin.domain.User;

public interface UserService {
	public String getEmail(int id);
	public User getUser(int id);
	public List<Quest> getQuest(int id);
	public Avatar getAvatar(int user_id);
	
	public void delQuest(int quest_id);
	public void setQuest(HashMap<String, Object> updateMap);
}
