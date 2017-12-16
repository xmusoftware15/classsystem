package xmu.crms.pojo;

import java.util.ArrayList;

public class Course {
	private int id;
	private User teacher;
	private String name;
	private int numClass;
	private int numStudent;
	private String startTime;
	private String endTime;
	private String description;
	private Proportions proportions;

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

	public int getNumClass() {
		return numClass;
	}

	public void setNumClass(int numClass) {
		this.numClass = numClass;
	}

	public int getNumStudent() {
		return numStudent;
	}

	public void setNumStudent(int numStudent) {
		this.numStudent = numStudent;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Proportions getProportions() {
		return proportions;
	}

	public void setProportions(Proportions proportions) {
		this.proportions = proportions;
	}

	public User getTeacher() {
		return teacher;
	}

	public void setTeacher(User teacher) {
		this.teacher = teacher;
	}

}
