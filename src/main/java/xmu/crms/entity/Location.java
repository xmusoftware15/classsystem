package xmu.crms.entity;

import java.math.BigInteger;

public class Location {
	private BigInteger id;
	private BigInteger classInfoid;
	private BigInteger seminarid;
	private Double longitude;
	private Double latitude;
	private Integer status;
	
	public BigInteger getId() {
		return id;
	}
	public void setId(BigInteger id) {
		this.id = id;
	}

	public BigInteger getClassInfoid() {
		return classInfoid;
	}

	public BigInteger getSeminarid() {
		return seminarid;
	}

	public void setSeminarid(BigInteger seminarid) {
		this.seminarid = seminarid;
	}

	public void setClassInfoid(BigInteger classInfoid) {
		this.classInfoid = classInfoid;
	}

	public Double getLongitude() {
		return longitude;
	}
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}
	public Double getLatitude() {
		return latitude;
	}
	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}

}
