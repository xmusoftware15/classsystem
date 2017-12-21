package xmu.crms.entity;

import java.math.BigInteger;

public class SeminarGroup {
	private BigInteger id;
	private BigInteger seminarid;
	private BigInteger classInfoid;
	private String report;
	private Integer reportGrade;
	private Integer presentationGrade;
	private Integer finalGrade;
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

	public BigInteger getSeminarid() {
		return seminarid;
	}

	public void setSeminarid(BigInteger seminarid) {
		this.seminarid = seminarid;
	}
}
