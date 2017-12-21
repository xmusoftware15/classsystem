package xmu.crms.entity;

import java.math.BigInteger;

public class SeminarGroupMember {
	private BigInteger id;
	private BigInteger seminarGroupid;
	private BigInteger studentid;
	
	public BigInteger getId() {
		return id;
	}
	public void setId(BigInteger id) {
		this.id = id;
	}

	public BigInteger getSeminarGroupid() {
		return seminarGroupid;
	}

	public BigInteger getStudentid() {
		return studentid;
	}

	public void setStudentid(BigInteger studentid) {
		this.studentid = studentid;
	}

	public void setSeminarGroupid(BigInteger seminarGroupid) {
		this.seminarGroupid = seminarGroupid;
	}
}
