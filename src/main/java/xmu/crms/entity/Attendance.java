package xmu.crms.entity;

import java.math.BigInteger;

public class Attendance {
	private BigInteger id;
	private BigInteger studentId;
	private BigInteger classInfoId;
	private Seminar seminar;
	private Integer attendanceStatus;
	
	public BigInteger getId() {
		return id;
	}
	public void setId(BigInteger id) {
		this.id = id;
	}

	public BigInteger getStudentId() {
		return studentId;
	}

	public void setStudentId(BigInteger studentId) {
		this.studentId = studentId;
	}

	public BigInteger getClassInfoId() {
		return classInfoId;
	}

	public void setClassInfoId(BigInteger classInfoId) {
		this.classInfoId = classInfoId;
	}

	public Seminar getSeminar() {
		return seminar;
	}
	public void setSeminar(Seminar seminar) {
		this.seminar = seminar;
	}
	public Integer getAttendanceStatus() {
		return attendanceStatus;
	}
	public void setAttendanceStatus(Integer attendanceStatus) {
		this.attendanceStatus = attendanceStatus;
	}
	
}
