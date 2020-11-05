package com.ahndongjin.ahndongjin.service;

import java.util.List;

import com.ahndongjin.ahndongjin.domain.Avatar;
import com.ahndongjin.ahndongjin.domain.Quest;
import com.ahndongjin.ahndongjin.domain.Subject;

public interface TeamService {
	public List<Subject> getSubjectList(int team_id);
	public List<Integer> getMemberId(int team_id);
	public List<Avatar> getMemberAvatar(int team_id);
	public Quest getQuest(int quest_id);
}
