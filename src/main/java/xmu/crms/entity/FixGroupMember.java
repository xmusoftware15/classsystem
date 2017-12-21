package xmu.crms.entity;

import java.math.BigInteger;

public class FixGroupMember {
	private BigInteger id;
	private BigInteger fixGroupId;
	private BigInteger studentId;
	
	public BigInteger getId() {
		return id;
	}
	public void setId(BigInteger id) {
		this.id = id;
	}

	public BigInteger getFixGroupId() {
		return fixGroupId;
	}

	public void setFixGroupId(BigInteger fixGroupId) {
		this.fixGroupId = fixGroupId;
	}

	public BigInteger getStudentId() {
		return studentId;
	}

	public void setStudentId(BigInteger studentId) {
		this.studentId = studentId;
	}
}
