package xmu.crms.entity;

import java.math.BigInteger;

public class SeminarGroupTopic {
	private BigInteger id;
	private BigInteger topicId;
	private BigInteger seminarGroupId;
	private Integer presentationGrade;
	
	public BigInteger getId() {
		return id;
	}
	public void setId(BigInteger id) {
		this.id = id;
	}

	public BigInteger getTopicId() {
		return topicId;
	}

	public void setTopicId(BigInteger topicId) {
		this.topicId = topicId;
	}

	public BigInteger getSeminarGroupId() {
		return seminarGroupId;
	}

	public void setSeminarGroupId(BigInteger seminarGroupId) {
		this.seminarGroupId = seminarGroupId;
	}

	public Integer getPresentationGrade() {
		return presentationGrade;
	}
	public void setPresentationGrade(Integer presentationGrade) {
		this.presentationGrade = presentationGrade;
	}

}
