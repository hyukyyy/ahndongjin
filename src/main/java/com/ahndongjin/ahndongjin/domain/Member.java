package com.ahndongjin.ahndongjin.domain;

import lombok.Data;

public class Member {
	private int id;
	private boolean teamLeader;
	private int team_id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public boolean isTeamLeader() {
		return teamLeader;
	}
	public void setTeamLeader(boolean teamLeader) {
		this.teamLeader = teamLeader;
	}
	public int getTeam_id() {
		return team_id;
	}
	public void setTeam_id(int team_id) {
		this.team_id = team_id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	private int user_id;
}
