package xmu.crms.pojo;

import java.util.ArrayList;

public class Seminar {
private int id;
private String name;
private String description;
private String groupingMethod;
private String startTime;
private String endTime;
private Proportions proportions;
private ArrayList<Topic> topics = new ArrayList<Topic>();
public ArrayList<Topic> getTopics() {
	return topics;
}
public void setTopics(ArrayList<Topic> topics) {
	this.topics = topics;
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
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public String getGroupingMethod() {
	return groupingMethod;
}
public void setGroupingMethod(String groupingMethod) {
	this.groupingMethod = groupingMethod;
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
public Proportions getProportions() {
	return proportions;
}
public void setProportions(Proportions proportions) {
	this.proportions = proportions;
}

}
