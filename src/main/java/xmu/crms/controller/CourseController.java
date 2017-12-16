package xmu.crms.controller;

import static org.mockito.Mockito.RETURNS_DEEP_STUBS;

import java.util.ArrayList;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import xmu.crms.pojo.Class;
import xmu.crms.pojo.Course;
import xmu.crms.pojo.CourseDetail;
import xmu.crms.pojo.Seminar;
import xmu.crms.pojo.SeminarClasses;
import xmu.crms.pojo.SeminarGradeDetail;

@RestController
//@RequestMapping("/api/course")
@RequestMapping("/course")
public class CourseController {
	/* 获取与当前用户相关联的课程列表 */
	@RequestMapping(method = RequestMethod.GET)
	public ArrayList<Course> getCourse() {
		ArrayList<Course> list = new ArrayList<Course>();
		Course course = new Course();
		Course course1 = new Course();
		course.setId(1);
		course.setName("OOAD");
		course.setNumClass(3);
		course.setNumStudent(60);
		course.setEndTime("2018-1-1");
		course.setStartTime("2017-9-1");
		course1.setId(2);
		course1.setName("J2EE");
		course1.setNumClass(1);
		course1.setNumStudent(60);
		course1.setEndTime("2018-1-1");
		course1.setStartTime("2017-9-1");
		list.add(course);
		list.add(course1);
		return list;
	}

	@RequestMapping(method = RequestMethod.POST)
	@ResponseStatus(value = HttpStatus.CREATED)
	public String createCourse(@RequestBody Course course) {
		int id=25;
		return "{id:"+id+"}";
	}

	@RequestMapping(value = "/{courseId}", method = RequestMethod.GET)
	public CourseDetail getCourceById(@PathVariable("courseId") int courseId) {
		CourseDetail courseDetail = new CourseDetail();
		courseDetail.setId(23);
		courseDetail.setName("OOAD");
		courseDetail.setDescription("面向对象分析与设计");
		courseDetail.setTeacherName("邱明");
		courseDetail.setTeacherEmail("mingqiu@xmu.edu.cn");
		return courseDetail;
	}

	@RequestMapping(value = "/{courseId}", method = RequestMethod.PUT)
	@ResponseStatus(value = HttpStatus.NO_CONTENT)
	public void updateCourceById(@PathVariable("courseId") int courseId, @RequestBody Course course) {
		
	}

	@RequestMapping(value = "/{courseId}", method = RequestMethod.DELETE)
	@ResponseStatus(value = HttpStatus.NO_CONTENT)
	public void deleteCourceById(@PathVariable("courseId") int courseId) {
		
	}

	@RequestMapping(value = "/{courseId}/class", method = RequestMethod.GET)
	public ArrayList<Class> getClass(@PathVariable("courseId") int courseId) {
		ArrayList<Class> list = new ArrayList<Class>();
		Class class1 = new Class();
		Class class2 = new Class();
		class1.setId(45);
		class1.setName("周三1-2节");
		class2.setId(48);
		class2.setName("周三3-4节");
		list.add(class1);
		list.add(class2);
		return list;
	}
	
	@RequestMapping(value = "/{courseId}/class", method = RequestMethod.POST)
	@ResponseStatus(value = HttpStatus.CREATED)
	public String createClass(@PathVariable("courseId") int courseId,@RequestBody Class class1) {
		return "{id:25}";
	}
	
	@RequestMapping(value = "/{courseId}/seminar", method = RequestMethod.GET)
	public ArrayList<Seminar> getSeminar(@PathVariable("courseId") int courseId,@RequestParam(value="embedGrade",required=false) boolean embedGrade) {
		ArrayList<Seminar> list = new ArrayList<Seminar>();
		Seminar seminar1 = new Seminar();
		Seminar seminar2 = new Seminar();
		seminar1.setId(29);
		seminar1.setName("界面原型设计");
		seminar1.setDescription("界面原型设计");
		seminar1.setGroupingMethod("fixed");
		seminar1.setStartTime("2017-09-25");
		seminar1.setEndTime("2017-10-24");
		seminar2.setId(32);
		seminar2.setName("概要设计");
		seminar2.setDescription("模型层与数据库设计");
		seminar2.setGroupingMethod("fixed");
		seminar2.setStartTime("2017-09-25");
		seminar2.setEndTime("2017-10-24");
		list.add(seminar1);
		list.add(seminar2);
		return list;
	}
	
	@RequestMapping(value = "/{courseId}/seminar", method = RequestMethod.POST)
	@ResponseStatus(value = HttpStatus.CREATED)
	public String createSeminar(@PathVariable("courseId") int courseId,@RequestBody Seminar seminar) {
		int seminar_id = 32;
		return "{id:"+seminar_id+"}";
	}
	
	@RequestMapping(value = "/{courseId}/seminar/current", method = RequestMethod.GET)
	public SeminarClasses selectCurrentSeminar(@PathVariable int courseId) {
		SeminarClasses seminar = new SeminarClasses();
		seminar.setId(29);
		seminar.setName("界面原型设计");
		seminar.setCourseName("OOAD");
		seminar.setGroupingMethod("fixed");
		seminar.setStartTime("2017-09-25");
		seminar.setEndTime("2017-10-09");
		ArrayList<Class> list = new ArrayList<Class>();
		Class class1 = new Class();
		Class class2 = new Class();
		class1.setId(53);
		class1.setName("周三12");
		class2.setId(57);
		class2.setName("周三34");
		list.add(class1);
		list.add(class2);
		seminar.setClasses(list);
		return seminar;
	}
	
	@RequestMapping(value = "/{courseId}/grade", method = RequestMethod.GET)
	public ArrayList<SeminarGradeDetail> selectAllSeminarGrade(@PathVariable int courseId){
		ArrayList<SeminarGradeDetail> list = new ArrayList<SeminarGradeDetail>();
		SeminarGradeDetail seminarGradeDetail1 = new SeminarGradeDetail();
		SeminarGradeDetail seminarGradeDetail2 = new SeminarGradeDetail();
		seminarGradeDetail1.setSeminarName("需求分析");
		seminarGradeDetail1.setGroupName("3A2");
		seminarGradeDetail1.setLeaderName("张三");
		seminarGradeDetail1.setPresentationGrade(3);
		seminarGradeDetail1.setReportGrade(4);
		seminarGradeDetail1.setGrade(4);
		seminarGradeDetail2.setSeminarName("界面原型设计");
		seminarGradeDetail2.setGroupName("3A3");
		seminarGradeDetail2.setLeaderName("张三");
		seminarGradeDetail2.setPresentationGrade(4);
		seminarGradeDetail2.setReportGrade(4);
		seminarGradeDetail2.setGrade(4);
		list.add(seminarGradeDetail1);
		list.add(seminarGradeDetail2);
		return list;
	}
}
