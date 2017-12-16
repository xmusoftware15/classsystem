package xmu.crms.pojo;

import java.util.ArrayList;

public class ClassGroup {
private User leader;
private ArrayList<User> members=new ArrayList<User>();
public User getLeader() {
	return leader;
}
public void setLeader(User leader) {
	this.leader = leader;
}
public ArrayList<User> getList() {
	return members;
}
public void setList(ArrayList<User> list) {
	this.members = members;
}

}
