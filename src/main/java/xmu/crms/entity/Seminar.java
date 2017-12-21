package xmu.crms.entity;

import java.math.BigInteger;
import java.util.Date;

public class Seminar {
	private BigInteger id;
	private String name;
	private String description;
	private BigInteger courseid;
	private Boolean fixed;
	private Date startTime;
	private Date endTime;

	public BigInteger getId() {
		return id;
	}

	public void setId(BigInteger id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigInteger getCourseid() {
		return courseid;
	}

	public void setCourseid(BigInteger courseid) {
		this.courseid = courseid;
	}

	public Boolean getFixed() {
		return fixed;
	}

	public void setFixed(Boolean fixed) {
		this.fixed = fixed;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
}
