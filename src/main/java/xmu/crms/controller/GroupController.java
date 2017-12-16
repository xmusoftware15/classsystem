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

import com.fasterxml.jackson.annotation.JsonFormat.Value;

import xmu.crms.pojo.Group;
import xmu.crms.pojo.PresentGrade;
import xmu.crms.pojo.SeminarGrade;
import xmu.crms.pojo.Topic;
import xmu.crms.pojo.User;

@RestController
//@RequestMapping("/api/group")
@RequestMapping("/group")
public class GroupController {
	@RequestMapping(value = "/{groupId}",method = RequestMethod.GET)
	public Group selectGroupById(@PathVariable int groupId,@RequestParam(value="embedTopics",required=false) boolean embedTopics,@RequestParam(value="embedGrade",required=false) boolean embedGrade) {
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
		group.setReport("");
		return group;
	}
	
	@RequestMapping(value = "/{groupId}/resign",method = RequestMethod.PUT)
	@ResponseStatus(value = HttpStatus.NO_CONTENT)
	public void leaderResign(@PathVariable int groupId,@RequestBody User user) {
		
	}
	
	@RequestMapping(value = "/{groupId}/assign",method = RequestMethod.PUT)
	@ResponseStatus(value = HttpStatus.NO_CONTENT)
	public void leaderAssign(@PathVariable int groupId,@RequestBody User user) {
		
	}
	
	@RequestMapping(value = "/{groupId}/add",method = RequestMethod.PUT)
	@ResponseStatus(value = HttpStatus.NO_CONTENT)
	public void addMember(@PathVariable int groupId,@RequestBody User user) {
		
	}
	
	@RequestMapping(value = "/{groupId}/remove",method = RequestMethod.PUT)
	@ResponseStatus(value = HttpStatus.NO_CONTENT)
	public void removeMember(@PathVariable int groupId,@RequestBody User user) {
		
	}
	
	@RequestMapping(value = "/{groupId}/topic",method = RequestMethod.POST)
	@ResponseStatus(value = HttpStatus.CREATED)
	public void chooseTopicById(@PathVariable int groupId,@RequestBody User user) {
		
	}
	
	@RequestMapping(value = "/{groupId}/topic/{topicId}",method = RequestMethod.DELETE)
	@ResponseStatus(value = HttpStatus.NO_CONTENT)
	public void cancelChooseTopic(@PathVariable int groupId,@PathVariable int topicId) {
		
	}
	
	@RequestMapping(value = "/{groupId}/grade",method = RequestMethod.GET)
	public SeminarGrade selectSeminarGradeById(@PathVariable int groupId) {
		SeminarGrade seminarGrade = new SeminarGrade();
		ArrayList<PresentGrade> list = new ArrayList<PresentGrade>();
		PresentGrade p1 = new PresentGrade();
		PresentGrade p2 = new PresentGrade();
		p1.setTopicId(257);
		p1.setGrade(4);
		p2.setTopicId(258);
		p2.setGrade(5);
		list.add(p1);
		list.add(p2);
		seminarGrade.setPresentationGrade(list);
		seminarGrade.setReportGrade(3);
		seminarGrade.setGrade(4);
		return seminarGrade;
	}
	
	@RequestMapping(value = "/{groupId}/grade/report",method = RequestMethod.PUT)
	@ResponseStatus(value = HttpStatus.NO_CONTENT)
	public void setReprotGradeById(@PathVariable int groupId,@RequestBody SeminarGrade seminarGrade) {
		
	}
	
	@RequestMapping(value = "/{groupId}/grade/presentation/{studentId}",method = RequestMethod.PUT)
	@ResponseStatus(value = HttpStatus.NO_CONTENT)
	public void setPresentationGrade(@PathVariable int groupId,@PathVariable int studentId,@RequestBody PresentGrade presentationGrade) {
		
	}
}
