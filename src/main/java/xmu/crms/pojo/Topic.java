package xmu.crms.pojo;

public class Topic {
	private int id;
	private String serial;
	private String name;
	private String description;
	private int groupMemberLimit;
	private int groupLimit;
	private int groupLeft;

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

	public int getGroupLimit() {
		return groupLimit;
	}

	public void setGroupLimit(int groupLimit) {
		this.groupLimit = groupLimit;
	}

	public int getGroupLeft() {
		return groupLeft;
	}

	public void setGroupLeft(int groupLeft) {
		this.groupLeft = groupLeft;
	}

	public String getSerial() {
		return serial;
	}

	public void setSerial(String serial) {
		this.serial = serial;
	}

	public int getGroupMemberLimit() {
		return groupMemberLimit;
	}

	public void setGroupMemberLimit(int groupMemberLimit) {
		this.groupMemberLimit = groupMemberLimit;
	}

}
