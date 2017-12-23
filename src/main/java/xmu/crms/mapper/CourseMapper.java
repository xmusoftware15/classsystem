package xmu.crms.mapper;

import org.apache.ibatis.annotations.Param;
import xmu.crms.entity.ClassInfo;
import xmu.crms.entity.Course;
import xmu.crms.exception.CourseNotFoundException;
import xmu.crms.exception.ClassesNotFoundException;

import java.math.BigInteger;
import java.util.List;

public interface CourseMapper {

    List<Course> listCourseByUserId(BigInteger userId)throws IllegalArgumentException,CourseNotFoundException;

    BigInteger insertCourseByUserId(@Param("userId") BigInteger userId, @Param("course") Course course)throws IllegalArgumentException;

    Course selectCourseByCourseId(BigInteger courseId)throws IllegalArgumentException,CourseNotFoundException;

    void updateCourseByCourseId(@Param("courseId") BigInteger courseId,@Param("course") Course course);

    void deleteCourseByCourseId(BigInteger courseId)throws IllegalArgumentException;

    List<Course> listCourseByCourseName(String courseName);

    List<ClassInfo> listClassByUserId(BigInteger userId) throws IllegalArgumentException, ClassesNotFoundException;
}
