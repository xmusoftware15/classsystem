package xmu.crms.entity;

import java.math.BigInteger;

public class Location {
	private BigInteger id;
	private BigInteger classId;
	private BigInteger seminarId;
	private Double longitude;
	private Double latitude;
	private Integer status;
	
	public BigInteger getId() {
		return id;
	}
	public void setId(BigInteger id) {
		this.id = id;
	}

	public BigInteger getClassId() {
		return classId;
	}

	public void setClassId(BigInteger classId) {
		this.classId = classId;
	}

	public BigInteger getSeminarId() {
		return seminarId;
	}

	public void setSeminarId(BigInteger seminarId) {
		this.seminarId = seminarId;
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
