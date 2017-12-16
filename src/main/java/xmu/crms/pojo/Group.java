package xmu.crms.pojo;

import java.util.ArrayList;

public class Group {
	private int id;
	private String name;
	private User leader;
	private ArrayList<User> members;
	private ArrayList<Topic> topics;
	private String report;
	private SeminarGrade grade;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public User getLeader() {
		return leader;
	}

	public void setLeader(User leader) {
		this.leader = leader;
	}

	public ArrayList<User> getMembers() {
		return members;
	}

	public void setMembers(ArrayList<User> members) {
		this.members = members;
	}

	public ArrayList<Topic> getTopics() {
		return topics;
	}

	public void setTopics(ArrayList<Topic> topics) {
		this.topics = topics;
	}

	public String getReport() {
		return report;
	}

	public void setReport(String report) {
		this.report = report;
	}

	public SeminarGrade getGrade() {
		return grade;
	}

	public void setGrade(SeminarGrade grade) {
		this.grade = grade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
