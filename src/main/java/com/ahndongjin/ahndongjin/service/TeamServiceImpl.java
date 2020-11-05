package com.ahndongjin.ahndongjin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ahndongjin.ahndongjin.domain.Avatar;
import com.ahndongjin.ahndongjin.domain.Quest;
import com.ahndongjin.ahndongjin.domain.Subject;
import com.ahndongjin.ahndongjin.repository.TeamRepository;

public class TeamServiceImpl implements TeamService{

	private TeamRepository teamRepository;
	
	@Autowired
	public TeamServiceImpl(TeamRepository teamRepository) {
		this.teamRepository=teamRepository;
	}
	
	@Override
	public List<Subject> getSubjectList(int team_id) {
		return this.teamRepository.getSubjectList(team_id);
	}

	@Override
	public List<Integer> getMemberId(int team_id) {
		// TODO Auto-generated method stub
		return this.teamRepository.getMemberId(team_id);
	}

	@Override
	public List<Avatar> getMemberAvatar(int team_id) {
		// TODO Auto-generated method stub
		return this.teamRepository.getMemberAvatar(team_id);
	}

	@Override
	public Quest getQuest(int quest_id) {
		// TODO Auto-generated method stub
		return this.teamRepository.getQuest(quest_id);
	}

}
