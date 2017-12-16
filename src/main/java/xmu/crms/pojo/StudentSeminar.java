package xmu.crms.pojo;

public class StudentSeminar {
	private int id;
	private String name;
	private String groupingMethod;
	private String courseName;
	private String startTime;
	private String endTime;
	private int classCalling;
	private boolean isLeader;
	private boolean areTopicsSelected;
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
	public String getGroupingMethod() {
		return groupingMethod;
	}
	public void setGroupingMethod(String groupingMethod) {
		this.groupingMethod = groupingMethod;
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
	public int getClassCalling() {
		return classCalling;
	}
	public void setClassCalling(int classCalling) {
		this.classCalling = classCalling;
	}
	public boolean isLeader() {
		return isLeader;
	}
	public void setLeader(boolean isLeader) {
		this.isLeader = isLeader;
	}
	public boolean isAreTopicsSelected() {
		return areTopicsSelected;
	}
	public void setAreTopicsSelected(boolean areTopicsSelected) {
		this.areTopicsSelected = areTopicsSelected;
	}
	
	

}
