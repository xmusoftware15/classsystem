package xmu.crms.entity;

import java.math.BigInteger;

public class CourseSelection {
	private BigInteger id;
	private BigInteger classInfoId;
	private BigInteger studentId;
	
	public BigInteger getId() {
		return id;
	}
	public void setId(BigInteger id) {
		this.id = id;
	}

	public BigInteger getClassInfoId() {
		return classInfoId;
	}

	public void setClassInfoId(BigInteger classInfoId) {
		this.classInfoId = classInfoId;
	}

	public BigInteger getStudentId() {
		return studentId;
	}

	public void setStudentId(BigInteger studentId) {
		this.studentId = studentId;
	}
}
