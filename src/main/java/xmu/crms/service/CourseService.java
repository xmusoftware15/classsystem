package xmu.crms.service;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import xmu.crms.bo.CourseBO;
import xmu.crms.bo.UserBO;
import xmu.crms.bo.ClassBO;


/**
 * 
 * @author YeXiaona ZhouZhongjun
 * @version 1.00
 *
 */
public interface CourseService {
	/**
	 * 按userId获取与当前用户相关联的课程列表.
	 * <p>老师与他相关联的课程列表<br> 
	 * @author ZhouZhongjun
	 * @param userId 用户Id
	 * @return null 课程列表
	 */
	public List<CourseBO> listCourseByUserId(BigInteger userId);
	
	
	/**
	 * 按userId创建课程.
	 * @author ZhouZhongjun
	 * @param userId 用户Id
	 * @param course 课程信息
	 * @return courseId 新建课程的id
	 */
	public  BigInteger insertCourseByUserId(BigInteger userId,CourseBO course);
	
	
	/**
	 * 按courseId获取课程 .
	 * @author ZhouZhongjun
	 * @param courseId 课程Id
	 * @return course
	 */
	public  CourseBO getCourseByCourseId(BigInteger courseId);
	
	
	/**
	 * 传入courseId和course信息修改course信息.
	 * @author ZhouZhongjun
     * @param courseId 课程Id
	 * @param course 课程信息
	 * @return true修改成功  false修改失败
	 */
	public boolean updateCourseByCourseId(BigInteger courseId,CourseBO course);
	
	
	/**
	 * 按courseId删除课程.
	 * <p>先根据courseID删除Seminar 和 class,然后再将course的信息删除<br>  
	 * @author ZhouZhongjun
     * @param courseId 课程Id
	 * @see SeminarService #deleteSemiarByCourseId(BigInteger courseId)
	 * @see ClassService   #deleteClassByCourseId(BigInteger courseId)
	 * @return true删除成功  false删除失败
	 */
	public boolean deleteCourseByCourseId(BigInteger courseId);
	

	
	/**
	 * 根据课程名称获取课程列表.
	 * <p>根据课程名称获取课程列表<br>
	 * @author YeXiaona
	 * @param courseName 课程名称
	 * @return list 课程列表
	 * @see CourseService #listCourseByCourseName(String courseName)
	 * @see CourseService #getCourseByCourseId(BigInteger courseId)
	 */
	public List<CourseBO> listCourseByCourseName(String courseName);
	
	
	/**
	 * 按课程名称获取班级列表.
	 * <p>根据课程名获取课程ID，通过课程ID获取班级列表<br>
	 * @author YeXiaona
	 * @param courseName 课程名称
	 * @return list 班级列表
	 * @see CourseService #listCourseByCourseName(String courseName)
	 * @see ClassService #listClassByCourseId(BigInteger courseId)
	 */
	public List<ClassBO> listClassByCourseName(String courseName);
	
	
	/**
	 * 按教师名称获取班级列表.
	 * <p>根据教师名称获取课程ID，通过课程ID获取班级列表<br>
	 * @author YeXiaona
	 * @param teacherName 教师名称
	 * @return list 班级列表
	 * @see CourseService #listCourseByTeacherName(String teacherName)
	 * @see ClassService #listClassByCourseId(BigInteger courseId)
	 */
	public List<ClassBO> listClassByTeacherName(String teacherName);
	
	
	/**
	 * 根据教师ID获取班级列表.  
	 * @author YeXiaona
	 * @param userId 教师ID
	 * @return list 班级列表
	 * @see CourseService #listCourseByUserId(BigInteger userId)
	 * @see ClassService #listClassByCourseId(BigInteger courseId)
	 */
	public List<ClassBO> listClassByUserId(BigInteger userId);
}

