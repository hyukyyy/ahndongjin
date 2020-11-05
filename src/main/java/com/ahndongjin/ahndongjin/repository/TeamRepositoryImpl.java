package com.ahndongjin.ahndongjin.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import com.ahndongjin.ahndongjin.domain.Avatar;
import com.ahndongjin.ahndongjin.domain.Quest;
import com.ahndongjin.ahndongjin.domain.Subject;

public class TeamRepositoryImpl implements TeamRepository{

	private static String namespace="com.ahndongjin.ahndongjin.mappers.TeamMapper";
	
	private SqlSession sqlSession;
	
	@Autowired
	public TeamRepositoryImpl(SqlSession sqlSession) {
		this.sqlSession=sqlSession;
	}
	@Override
	public List<Subject> getSubjectList(int team_id) {
		return this.sqlSession.selectList(namespace+".getSubjectList",team_id);
	}
	@Override
	public List<Integer> getMemberId(int team_id) {
		// TODO Auto-generated method stub
		return this.sqlSession.selectList(namespace+".getMemberId",team_id);
	}
	@Override
	public List<Avatar> getMemberAvatar(int team_id) {
		// TODO Auto-generated method stub
		return this.sqlSession.selectList(namespace+".getMemberAvatar",team_id);
	}
	@Override
	public Quest getQuest(int quest_id) {
		// TODO Auto-generated method stub
		return this.sqlSession.selectOne(namespace+".getQuest",quest_id);
	}

}
