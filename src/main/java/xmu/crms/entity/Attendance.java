package xmu.crms.entity;

import java.math.BigInteger;

public class Attendance {
	private BigInteger id;
	private User student;
	private ClassInfo classInfo;
	private BigInteger seminarid;
	private Integer attendanceStatus;
	
	public BigInteger getId() {
		return id;
	}
	public void setId(BigInteger id) {
		this.id = id;
	}
	public User getStudent() {
		return student;
	}
	public void setStudent(User student) {
		this.student = student;
	}
	public ClassInfo getClassInfo() {
		return classInfo;
	}
	public void setClassInfo(ClassInfo classInfo) {
		this.classInfo = classInfo;
	}
	public BigInteger getSeminarid() {
		return seminarid;
	}
	public void setSeminarid(BigInteger seminarid) {
		this.seminarid = seminarid;
	}
	public Integer getAttendanceStatus() {
		return attendanceStatus;
	}
	public void setAttendanceStatus(Integer attendanceStatus) {
		this.attendanceStatus = attendanceStatus;
	}
	
}
