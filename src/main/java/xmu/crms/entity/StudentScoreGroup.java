package xmu.crms.entity;

import java.math.BigInteger;

public class StudentScoreGroup {
	private BigInteger id;
	private BigInteger studentId;
	private BigInteger seminarGroupTopicId;
	private Integer grade;
	
	public BigInteger getId() {
		return id;
	}
	public void setId(BigInteger id) {
		this.id = id;
	}

	public BigInteger getStudentId() {
		return studentId;
	}

	public void setStudentId(BigInteger studentId) {
		this.studentId = studentId;
	}

	public BigInteger getSeminarGroupTopicId() {
		return seminarGroupTopicId;
	}

	public void setSeminarGroupTopicId(BigInteger seminarGroupTopicId) {
		this.seminarGroupTopicId = seminarGroupTopicId;
	}

	public Integer getGrade() {
		return grade;
	}
	public void setGrade(Integer grade) {
		this.grade = grade;
	}
	
}
