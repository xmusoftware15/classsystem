package xmu.crms.controller;

import java.util.ArrayList;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import xmu.crms.pojo.Group;
import xmu.crms.pojo.Topic;

@RestController
//@RequestMapping("/api/topic")
@RequestMapping("/topic")
public class TopicController {
	@RequestMapping(value = "/{topicId}", method = RequestMethod.GET)
	public Topic selectTopicById(@PathVariable int topicId) {
		Topic topic = new Topic();
		topic.setGroupLeft(257);
		topic.setSerial("A");
		topic.setName("领域模型与模块");
		topic.setDescription("Domain model与模块划分");
		topic.setGroupLimit(5);
		topic.setGroupMemberLimit(6);
		topic.setGroupLeft(2);
		return topic;
	}

	@RequestMapping(value = "/{topicId}", method = RequestMethod.PUT)
	@ResponseStatus(value = HttpStatus.NO_CONTENT)
	public void updateTopicById(@PathVariable int topicId, @RequestBody Topic topic) {
		
	}

	@RequestMapping(value = "/{topicId}", method = RequestMethod.DELETE)
	@ResponseStatus(value = HttpStatus.NO_CONTENT)
	public void deleteTopicById(@PathVariable int topicId) {
		
	}

	@RequestMapping(value = "/{topicId}/group", method = RequestMethod.GET)
	public ArrayList<Group> selectGroup(@PathVariable int topicId) {
		ArrayList<Group> list = new ArrayList<Group>();
		Group group1 = new Group();
		Group group2 = new Group();
		group1.setId(23);
		group1.setName("1A1");
		group2.setId(26);
		group2.setName("2A2");
		list.add(group1);
		list.add(group2);
		return list;
	}

}
