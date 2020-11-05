package com.ahndongjin.ahndongjin.repository;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ahndongjin.ahndongjin.domain.Avatar;
import com.ahndongjin.ahndongjin.domain.Quest;
import com.ahndongjin.ahndongjin.domain.User;

public interface UserRepository {
	public User getUser(int user_id);
	public String getEmail(int user_id);
	public List<Quest> getQuest(int user_id);
	public Avatar getAvatar(int user_id);
}
