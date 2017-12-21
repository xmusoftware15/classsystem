package xmu.crms.entity;

import java.math.BigInteger;

public class FixGroupMember {
	private BigInteger id;
	private BigInteger fixGroupid;
	private BigInteger studentid;
	
	public BigInteger getId() {
		return id;
	}
	public void setId(BigInteger id) {
		this.id = id;
	}

	public BigInteger getFixGroupid() {
		return fixGroupid;
	}

	public BigInteger getStudentid() {
		return studentid;
	}

	public void setStudentid(BigInteger studentid) {
		this.studentid = studentid;
	}

	public void setFixGroupid(BigInteger fixGroupid) {
		this.fixGroupid = fixGroupid;
	}
}
