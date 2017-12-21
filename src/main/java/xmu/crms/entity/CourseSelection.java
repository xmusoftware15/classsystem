package xmu.crms.entity;

import java.math.BigInteger;

public class CourseSelection {
	private BigInteger id;
	private BigInteger classInfoid;
	private BigInteger studentid;
	
	public BigInteger getId() {
		return id;
	}
	public void setId(BigInteger id) {
		this.id = id;
	}

	public BigInteger getClassInfoid() {
		return classInfoid;
	}

	public void setClassInfoid(BigInteger classInfoid) {
		this.classInfoid = classInfoid;
	}

	public BigInteger getStudentid() {
		return studentid;
	}

	public void setStudentid(BigInteger studentid) {
		this.studentid = studentid;
	}
}
