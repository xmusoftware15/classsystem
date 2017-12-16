package xmu.crms.pojo;

public class Class {
	private int id;
	private String name;
	private int numStudent;
	private String time;
	private String site;
	private int calling;
	private String roster;
	private String courseTeacher;
	private Proportions proportions;
	private String courseName;

	public String getCourseTeacher() {
		return courseTeacher;
	}

	public void setCourseTeacher(String courseTeacher) {
		this.courseTeacher = courseTeacher;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumStudent() {
		return numStudent;
	}

	public void setNumStudent(int numStudent) {
		this.numStudent = numStudent;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getSite() {
		return site;
	}

	public void setSite(String site) {
		this.site = site;
	}

	public int getCalling() {
		return calling;
	}

	public void setCalling(int calling) {
		this.calling = calling;
	}

	public String getRoster() {
		return roster;
	}

	public void setRoster(String roster) {
		this.roster = roster;
	}

	public Proportions getProportions() {
		return proportions;
	}

	public void setProportions(Proportions proportions) {
		this.proportions = proportions;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

}
