package xmu.crms.controller;

import java.util.ArrayList;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import xmu.crms.pojo.ClassAttendance;
import xmu.crms.pojo.Group;
import xmu.crms.pojo.Location;
import xmu.crms.pojo.Seminar;
import xmu.crms.pojo.SeminarDetail;
import xmu.crms.pojo.StudentSeminar;
import xmu.crms.pojo.Topic;
import xmu.crms.pojo.User;

@RestController
//@RequestMapping("/api/seminar")
@RequestMapping("/seminar")
public class SeminarController {
	@RequestMapping(value = "/{seminarId}",method = RequestMethod.GET)
	public Seminar selectSeminarById(@PathVariable int seminarId) {
		Seminar seminar = new Seminar();
		seminar.setName("概要设计");
		seminar.setDescription("模型层与数据库设计");
		seminar.setGroupingMethod("fixed");
		seminar.setStartTime("2017-10-10");
		seminar.setEndTime("2017-10-24");
		ArrayList<Topic> topics = new ArrayList<Topic>();
		Topic topic = new Topic();
		topic.setId(257);
		topic.setName("领域模型与模块");
		topics.add(topic);
		seminar.setTopics(topics);
		return seminar;
	}
	
	@RequestMapping(value = "/{seminarId}",method = RequestMethod.PUT)
	@ResponseStatus(value = HttpStatus.NO_CONTENT)
	public void updateSeminarById(@PathVariable int seminarId,@RequestBody Seminar seminar) {	
	}
	
	@RequestMapping(value = "/{seminarId}",method = RequestMethod.DELETE)
	@ResponseStatus(value = HttpStatus.NO_CONTENT)
	public void deleteSeminarById(@PathVariable int seminarId) {
	}
	
	@RequestMapping(value = "/{seminarId}/my",method = RequestMethod.GET)
	public StudentSeminar selectStudentSeminarById(@PathVariable int seminarId) {
		StudentSeminar studentSeminar = new StudentSeminar();
		studentSeminar.setName("概要设计");
		studentSeminar.setGroupingMethod("random");
		studentSeminar.setStartTime("2017-10-11");
		studentSeminar.setEndTime("2017-10-24");
		studentSeminar.setClassCalling(23);
		studentSeminar.setLeader(true);
		studentSeminar.setAreTopicsSelected(true);
		studentSeminar.setCourseName("OOAD");
		return studentSeminar;
	}
	
	@RequestMapping(value = "/{seminarId}/detail",method = RequestMethod.GET)
	public SeminarDetail selectSeminarDetailById(@PathVariable int seminarId) {
		SeminarDetail seminarDetail = new SeminarDetail();
		seminarDetail.setId(32);
		seminarDetail.setName("概要设计");
		seminarDetail.setStartTime("2017-10-10");
		seminarDetail.setEndTime("2017-10-24");
		seminarDetail.setSite("海韵201");
		seminarDetail.setTeacherName("邱明");
		seminarDetail.setTeacherEmail("mingqiu@xmu.edu.cn");
		return seminarDetail;
	}
	
	@RequestMapping(value = "/{seminarId}/topic",method = RequestMethod.GET)
	public ArrayList<Topic> selectTopicById(@PathVariable int seminarId) {
		ArrayList<Topic> list=new ArrayList<Topic>();
		Topic topic = new Topic();
		topic.setSerial("A");
		topic.setName("领域模型与模块");
		topic.setDescription("Domain model与模块划分");
		topic.setGroupLimit(5);
		topic.setGroupMemberLimit(6);
		topic.setGroupLeft(2);
		topic.setId(1);
		list.add(topic);
		return list;
	}
	
	@RequestMapping(value = "/{seminarId}/topic",method = RequestMethod.POST)
	@ResponseStatus(value = HttpStatus.CREATED)
	public void createTopic(@PathVariable int seminarId,@RequestBody Topic topic) {
		
	}
	
	@RequestMapping(value = "/{seminarId}/group",method = RequestMethod.GET)
	public ArrayList<Group> selectGroup(@PathVariable int seminarId,@RequestParam(value="gradeable",required=false) boolean gradeable,@RequestParam(value="classId",required=false) Integer classId){
		ArrayList<Group> list = new ArrayList<Group>();
		Group group1 = new Group();
		Group group2 = new Group();
		group1.setId(1);
		group2.setId(2);
		group1.setName("1A1");
		ArrayList<Topic> topiclist1 = new ArrayList<Topic>();
		Topic topic1 = new Topic();
		topic1.setName("领域模型与模块");
		topiclist1.add(topic1);
		group1.setTopics(topiclist1);
		group2.setName("1A2");
		ArrayList<Topic> topiclist2 = new ArrayList<Topic>();
		Topic topic2 = new Topic();
		topic2.setName("领域模型与模块");
		topiclist2.add(topic2);
		group2.setTopics(topiclist2);
		list.add(group1);
		list.add(group2);
		return list;
	}
	
	@RequestMapping(value = "/{seminarId}/group/my",method = RequestMethod.GET)
	public Group selectGroup(@PathVariable int seminarId) {
		Group group = new Group();
		User leader = new User();
		leader.setName("张三");
		group.setLeader(leader);
		ArrayList<User> list1 = new ArrayList<User>();
		User member1 = new User();
		User member2 = new User();
		member1.setName("李四");
		member2.setName("王五");
		list1.add(member1);
		list1.add(member2);
		group.setMembers(list1);
		ArrayList<Topic> list2 = new ArrayList<Topic>();
		Topic topic = new Topic();
		topic.setName("领域模型与模块");
		list2.add(topic);
		group.setTopics(list2);
		group.setId(1);
		group.setName("1A1");
		return group;
	}
	
	@RequestMapping(value = "/{seminarId}/class/{classId}/attendance",method = RequestMethod.GET)
	public ClassAttendance selectClassAttendance(@PathVariable int classId) {
		ClassAttendance classAttendance = new ClassAttendance();
		classAttendance.setNumPresent(40);
		classAttendance.setNumStudent(60);
		classAttendance.setStatus("calling");
		classAttendance.setGroup("grouping");
		return classAttendance;
	}
	
	@RequestMapping(value = "/{seminarId}/class/{classId}/attendance/present",method = RequestMethod.GET)
	public ArrayList<User> selectPresentStudents(@PathVariable int seminarId,@PathVariable int classId){
		ArrayList<User> list = new ArrayList<User>();
		User stu1 = new User();
		User stu2 = new User();
		stu1.setName("张三");
		stu2.setName("李四");
		list.add(stu1);
		list.add(stu2);
		return list;
	}
	
	@RequestMapping(value = "/{seminarId}/class/{classId}/attendance/late",method = RequestMethod.GET)
	public ArrayList<User> selectLateStudents(@PathVariable int seminarId,@PathVariable int classId){
		ArrayList<User> list = new ArrayList<User>();
		User stu1 = new User();
		User stu2 = new User();
		stu1.setName("王五");
		stu2.setName("王七九");
		list.add(stu1);
		list.add(stu2);
		return list;
	}
	
	@RequestMapping(value = "/{seminarId}/class/{classId}/attendance/absent",method = RequestMethod.GET)
	public ArrayList<User> selectAbsentStudents(@PathVariable int seminarId,@PathVariable int classId){
		ArrayList<User> list = new ArrayList<User>();
		User stu = new User();
		stu.setName("张六");
		list.add(stu);
		return list;
	}
	
	@RequestMapping(value = "/{seminarId}/class/{classId}/attendance/{studentId}",method = RequestMethod.PUT)
	public String rollCall(@PathVariable int seminarId,@PathVariable int classId,@PathVariable int studentId,@RequestBody Location location){
		String status;
		status = "late";
		return status;
	}
}
