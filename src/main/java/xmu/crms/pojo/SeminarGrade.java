package xmu.crms.pojo;

import java.util.ArrayList;

public class SeminarGrade {
private ArrayList<PresentGrade> presentationGrade;
private int reportGrade;
private int grade;

public int getReportGrade() {
	return reportGrade;
}
public void setReportGrade(int reportGrade) {
	this.reportGrade = reportGrade;
}
public int getGrade() {
	return grade;
}
public void setGrade(int grade) {
	this.grade = grade;
}
public ArrayList<PresentGrade> getPresentationGrade() {
	return presentationGrade;
}
public void setPresentationGrade(ArrayList<PresentGrade> presentationGrade) {
	this.presentationGrade = presentationGrade;
}

}
