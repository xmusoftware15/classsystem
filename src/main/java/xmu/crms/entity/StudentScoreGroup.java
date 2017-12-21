package xmu.crms.entity;

import java.math.BigInteger;

public class StudentScoreGroup {
	private BigInteger id;
	private BigInteger studentid;
	private BigInteger seminarGroupTopicid;
	private Integer grade;
	
	public BigInteger getId() {
		return id;
	}
	public void setId(BigInteger id) {
		this.id = id;
	}

	public BigInteger getStudentid() {
		return studentid;
	}

	public void setStudentid(BigInteger studentid) {
		this.studentid = studentid;
	}

	public Integer getGrade() {
		return grade;
	}
	public void setGrade(Integer grade) {
		this.grade = grade;
	}
	
}
