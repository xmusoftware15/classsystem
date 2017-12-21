package xmu.crms.controller;

import java.math.BigInteger;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


import xmu.crms.exception.CourseNotFoundException;
import xmu.crms.exception.UserNotFoundException;
import xmu.crms.pojo.Class;
import xmu.crms.pojo.Course;
import xmu.crms.pojo.Group;
import xmu.crms.pojo.Proportions;
import xmu.crms.pojo.User;
import xmu.crms.service.ClassService;
import xmu.crms.service.Impl.ClassServiceImpl;

@RestController
//@RequestMapping("/api/class")
@RequestMapping("/class")
public class ClassController {

	@Autowired
	private ClassService classService;

	@RequestMapping(value="/delete/{classId}" ,method = RequestMethod.POST)
	public String deleteClassSelectionByClassId(@PathVariable(name = "classId") String classId)
	{
		if(classService.deleteClassSelectionByClassId(new BigInteger(classId))){
			return "chenggong";
		}else{
			return "shibai";
		}
	}

	@RequestMapping(value="/search/{teacherName}/{courseName}" ,method = RequestMethod.POST)
	public void search(@PathVariable(name = "teacherName") String teacherName,@PathVariable(name = "courseName") String courseName)
	{
		System.out.println(teacherName);
		try {
			classService.listClassByName(courseName,teacherName);
		}catch (UserNotFoundException e){

		}catch (CourseNotFoundException e){

		}
	}

	@RequestMapping(method = RequestMethod.GET)
	public ArrayList<Class> getCertainClass() {
		ArrayList<Class> list = new ArrayList<Class>();
		Class class1 = new Class();
		Class class2 = new Class();
		class1.setId(23);
		class1.setName("一班");
		class1.setNumStudent(60);
		class1.setTime("周三1-2节、周五1-2节");
		class1.setCourseTeacher("邱明");
		class1.setCourseName("OOAD");
		class1.setSite("公寓405");
		class2.setId(42);
		class2.setName("二班");
		class2.setNumStudent(60);
		class2.setTime("周三3-4节、周五1-2节");
		class2.setCourseTeacher("杨律青");
		class2.setCourseName(".NET");
		class2.setSite("公寓405");
		list.add(class1);
		list.add(class2);
		return list;
	}
	
	@RequestMapping(value="/{classId}" ,method = RequestMethod.GET)
	public Class getClassById(@PathVariable int classId) {
		Class class1 = new Class();
		class1.setId(23);
		class1.setName("一班");
		class1.setTime("周三1-2节");
		class1.setSite("海韵201");
		class1.setCalling(-1);
		class1.setRoster("/roster/周三12班.xlsx");
		Proportions proportions = new Proportions();
		proportions.setReport(50);
		proportions.setPresentation(50);
		proportions.setC(20);
		proportions.setB(60);
		proportions.setA(20);
		class1.setProportions(proportions);
		return class1;
	}
	
	@RequestMapping(value="/{classId}" ,method = RequestMethod.PUT)
	@ResponseStatus(value = HttpStatus.NO_CONTENT)
	public void updateClassById(@PathVariable int classId,@RequestBody Class class1) {
		
	}
	
	@RequestMapping(value="/{classId}" ,method = RequestMethod.DELETE)
	@ResponseStatus(value = HttpStatus.NO_CONTENT)
	public void deleteClassById(@PathVariable int classId) {
		
	}
	
	@RequestMapping(value="/{classId}/student" ,method = RequestMethod.GET)
	public ArrayList<User> getStudent(@PathVariable int classId,@RequestParam(value="numBeginWith",required=false) String numBeginWith,@RequestParam(value="nameBeginWith",required=false) String nameBeginWith) {
		ArrayList<User> list =new ArrayList<User>();
		User student1=new User();
		User student2=new User();
		student1.setId(233);
		student1.setName("张三");
		student1.setNumber("24320152202333");
		student2.setId(245);
		student2.setName("路明非");
		student2.setNumber("24320152202745");
		list.add(student1);
		list.add(student2);
		return list;
	}
	
	@RequestMapping(value="/{classId}/student" ,method = RequestMethod.POST)
	@ResponseStatus(value = HttpStatus.CREATED)
	public String chooseClass(@PathVariable int classId,@RequestBody User user) {
		String url="/class/34/student/2757";
		return "{url:"+url+"}";
	}
	
	@RequestMapping(value="/{classId}/student/{studentId}" ,method = RequestMethod.DELETE)
	@ResponseStatus(value = HttpStatus.NO_CONTENT)
	public void cancelClass(@PathVariable int classId,@PathVariable int studentId) {
		
	}
	
	@RequestMapping(value="/{classId}/classgroup" ,method = RequestMethod.GET)
	public Group selectMyGroup(@PathVariable int classId) {
		Group group = new Group();
		User leader = new User();
		leader.setId(2757);
		leader.setName("张三");
		leader.setNumber("23320152202333");
		group.setLeader(leader);
		ArrayList<User> members = new ArrayList<User>();
		User member1 = new User();
		User member2 = new User();
		member1.setId(2756);
		member1.setName("李四");
		member1.setNumber("23320152202443");
		member2.setId(2777);
		member2.setName("王五");
		member2.setNumber("23320152202433");
		members.add(member1);
		members.add(member2);
		group.setMembers(members);
		return group;
	}
	
	@RequestMapping(value="/{classId}/classgroup/resign" ,method = RequestMethod.PUT)
	@ResponseStatus(value = HttpStatus.NO_CONTENT)
	public void classGroupLeaderResign(@RequestBody User user) {
		
	}
	
	@RequestMapping(value="/{classId}/classgroup/assign" ,method = RequestMethod.PUT)
	@ResponseStatus(value = HttpStatus.NO_CONTENT)
	public void classGroupLeaderAssign(@RequestBody User user) {
		
	}
	
	@RequestMapping(value="/{classId}/classgroup/add" ,method = RequestMethod.PUT)
	@ResponseStatus(value = HttpStatus.NO_CONTENT)
	public void addClassGroupMember(@RequestBody User user) {
		
	}
	
	@RequestMapping(value="/{classId}/classgroup/remove" ,method = RequestMethod.PUT)
	@ResponseStatus(value = HttpStatus.NO_CONTENT)
	public void removeClassGroupMember(@RequestBody User user) {
		
	}

}
