package xmu.crms.pojo;

import java.util.ArrayList;

public class Attendence {
private int numPresent;
private ArrayList<User> present;
private ArrayList<User> late;
private ArrayList<User> absent;
public int getNumPresent() {
	return numPresent;
}
public void setNumPresent(int numPresent) {
	this.numPresent = numPresent;
}
public ArrayList<User> getPresent() {
	return present;
}
public void setPresent(ArrayList<User> present) {
	this.present = present;
}
public ArrayList<User> getLate() {
	return late;
}
public void setLate(ArrayList<User> late) {
	this.late = late;
}
public ArrayList<User> getAbsent() {
	return absent;
}
public void setAbsent(ArrayList<User> absent) {
	this.absent = absent;
}

}
