package com.ahndongjin.ahndongjin.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import com.ahndongjin.ahndongjin.domain.Avatar;
import com.ahndongjin.ahndongjin.domain.Quest;
import com.ahndongjin.ahndongjin.domain.User;
import com.ahndongjin.ahndongjin.repository.UserRepository;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Service
public class UserServiceImpl implements UserService{
	
	private UserRepository userRepository;
	
	@Autowired
	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository=userRepository;
	}
	
	@Override
	public String getEmail(int user_id) {
		return this.userRepository.getEmail(user_id);
	}
	
	@Override
	public User getUser(int user_id) {
		return this.userRepository.getUser(user_id);
	}

	@Override
	public List<Quest> getQuest(int user_id) {
		return this.userRepository.getQuest(user_id);
	}

	@Override
	public Avatar getAvatar(int user_id) {
		return this.userRepository.getAvatar(user_id);
	}

	@Override
	public void delQuest(int quest_id) {
		// TODO Auto-generated method stub
		this.userRepository.delQuest(quest_id);
	}

	@Override
	public void setQuest(HashMap<String, Object> updateMap) {
		// TODO Auto-generated method stub
		this.userRepository.setQuest(updateMap);
	}
	

}
