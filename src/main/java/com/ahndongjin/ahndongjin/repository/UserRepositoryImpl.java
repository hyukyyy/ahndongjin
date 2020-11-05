package com.ahndongjin.ahndongjin.repository;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ahndongjin.ahndongjin.domain.Avatar;
import com.ahndongjin.ahndongjin.domain.Quest;
import com.ahndongjin.ahndongjin.domain.User;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Repository
public class UserRepositoryImpl implements UserRepository{
	
	private static String namespace="com.ahndongjin.ahndongjin.mappers.UserMapper";
	
	private SqlSession sqlSession;
	
	@Autowired
	public UserRepositoryImpl(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	@Override
	public User getUser(int user_id) {
		return sqlSession.selectOne(namespace+".getUser",user_id);
	};
	
	@Override
	public String getEmail(int user_id) {
		return sqlSession.selectOne(namespace+".getEmail",user_id);
		
	}

	@Override
	public List<Quest> getQuest(int user_id) {
		return sqlSession.selectList(namespace+".getQuest",user_id);
	}

	@Override
	public Avatar getAvatar(int user_id) {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(namespace+".getAvatar",user_id);
	};
	

}
