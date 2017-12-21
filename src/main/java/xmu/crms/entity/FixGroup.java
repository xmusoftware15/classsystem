package xmu.crms.entity;

import java.math.BigInteger;

public class FixGroup {
	private BigInteger id;
	private BigInteger classInfoid;
	private BigInteger leaderid;
	
	public BigInteger getId() {
		return id;
	}
	public void setId(BigInteger id) {
		this.id = id;
	}

	public BigInteger getClassInfoid() {
		return classInfoid;
	}

	public BigInteger getLeaderid() {
		return leaderid;
	}

	public void setLeaderid(BigInteger leaderid) {
		this.leaderid = leaderid;
	}

	public void setClassInfoid(BigInteger classInfoid) {
		this.classInfoid = classInfoid;
	}
}
