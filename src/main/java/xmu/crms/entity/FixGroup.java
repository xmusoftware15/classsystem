package xmu.crms.entity;

import java.math.BigInteger;

public class FixGroup {
	private BigInteger id;
	private BigInteger classInfoId;
	private BigInteger leaderId;
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

	public BigInteger getLeaderId() {
		return leaderId;
	}

	public void setLeaderId(BigInteger leaderId) {
		this.leaderId = leaderId;
	}
}
