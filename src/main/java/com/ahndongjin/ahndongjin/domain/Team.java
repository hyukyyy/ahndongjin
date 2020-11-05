package com.ahndongjin.ahndongjin.domain;

import java.sql.Timestamp;

import lombok.Data;
import lombok.Getter;

public class Team {
	private int id;
	private Timestamp startDate;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Timestamp getStartDate() {
		return startDate;
	}
	public void setStartDate(Timestamp startDate) {
		this.startDate = startDate;
	}
	public Timestamp getEndDate() {
		return endDate;
	}
	public void setEndDate(Timestamp endDate) {
		this.endDate = endDate;
	}
	public boolean isSearchable() {
		return searchable;
	}
	public void setSearchable(boolean searchable) {
		this.searchable = searchable;
	}
	public int getArchive_id() {
		return archive_id;
	}
	public void setArchive_id(int archive_id) {
		this.archive_id = archive_id;
	}
	public int getConversation_id() {
		return conversation_id;
	}
	public void setConversation_id(int conversation_id) {
		this.conversation_id = conversation_id;
	}
	private Timestamp endDate;
	private boolean searchable;
	private int archive_id;
	private int conversation_id;
}
