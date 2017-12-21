package xmu.crms.entity;

import java.math.BigInteger;

public class SeminarGroup {
	private BigInteger id;
	private BigInteger seminarId;
	private BigInteger classId;
	private String report;
	private Integer reportGrade;
	private Integer presentationGrade;
	private Integer finalGrade;
	private BigInteger leaderId;

	public BigInteger getId() {
		return id;
	}

	public void setId(BigInteger id) {
		this.id = id;
	}

	public BigInteger getSeminarId() {
		return seminarId;
	}

	public void setSeminarId(BigInteger seminarId) {
		this.seminarId = seminarId;
	}

	public BigInteger getClassId() {
		return classId;
	}

	public void setClassId(BigInteger classId) {
		this.classId = classId;
	}

	public BigInteger getLeaderId() {
		return leaderId;
	}

	public void setLeaderId(BigInteger leaderId) {
		this.leaderId = leaderId;
	}

	public String getReport() {
		return report;
	}

	public void setReport(String report) {
		this.report = report;
	}

	public Integer getReportGrade() {
		return reportGrade;
	}

	public void setReportGrade(Integer reportGrade) {
		this.reportGrade = reportGrade;
	}

	public Integer getPresentationGrade() {
		return presentationGrade;
	}

	public void setPresentationGrade(Integer presentationGrade) {
		this.presentationGrade = presentationGrade;
	}

	public Integer getFinalGrade() {
		return finalGrade;
	}

	public void setFinalGrade(Integer finalGrade) {
		this.finalGrade = finalGrade;
	}


}
