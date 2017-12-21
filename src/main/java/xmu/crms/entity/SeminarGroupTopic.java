package xmu.crms.entity;

import java.math.BigInteger;

public class SeminarGroupTopic {
	private BigInteger id;
	private Topic topic;
	private BigInteger seminarGroupid;
	private Integer presentationGrade;
	
	public BigInteger getId() {
		return id;
	}
	public void setId(BigInteger id) {
		this.id = id;
	}
	public Topic getTopic() {
		return topic;
	}
	public void setTopic(Topic topic) {
		this.topic = topic;
	}

	public BigInteger getSeminarGroupid() {
		return seminarGroupid;
	}

	public void setSeminarGroupid(BigInteger seminarGroupid) {
		this.seminarGroupid = seminarGroupid;
	}

	public Integer getPresentationGrade() {
		return presentationGrade;
	}
	public void setPresentationGrade(Integer presentationGrade) {
		this.presentationGrade = presentationGrade;
	}

}
