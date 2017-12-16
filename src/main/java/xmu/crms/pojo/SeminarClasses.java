package xmu.crms.pojo;

import java.util.ArrayList;

public class SeminarClasses {

	private int id;
	private String name;
	private String courseName;
	private String groupingMethod;
	public String getGroupingMethod() {
		return groupingMethod;
	}
	public void setGroupingMethod(String groupingMethod) {
		this.groupingMethod = groupingMethod;
	}
	private String startTime;
	private String endTime;
	private ArrayList<Class> classes;
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
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
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
	public ArrayList<Class> getClasses() {
		return classes;
	}
	public void setClasses(ArrayList<Class> classes) {
		this.classes = classes;
	}
}
