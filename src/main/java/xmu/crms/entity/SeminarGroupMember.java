package xmu.crms.entity;

import java.math.BigInteger;

public class SeminarGroupMember {
	private BigInteger id;
	private BigInteger seminarGroupId;
	private BigInteger studentId;
	
	public BigInteger getId() {
		return id;
	}
	public void setId(BigInteger id) {
		this.id = id;
	}

	public BigInteger getSeminarGroupId() {
		return seminarGroupId;
	}

	public void setSeminarGroupId(BigInteger seminarGroupId) {
		this.seminarGroupId = seminarGroupId;
	}

	public BigInteger getStudentId() {
		return studentId;
	}

	public void setStudentId(BigInteger studentId) {
		this.studentId = studentId;
	}
}
