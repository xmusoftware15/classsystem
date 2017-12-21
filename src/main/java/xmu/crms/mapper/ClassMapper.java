package xmu.crms.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import xmu.crms.entity.ClassInfo;
import xmu.crms.entity.Course;
import xmu.crms.entity.User;
import xmu.crms.exception.CourseNotFoundException;
import xmu.crms.exception.UserNotFoundException;

import java.math.BigInteger;
import java.util.List;

@Component

public interface ClassMapper {

    Boolean deleteClassSelectionByClassId(BigInteger classId);

    List<ClassInfo> listClassByName(String courseName, String teacherName) throws
            UserNotFoundException,CourseNotFoundException;

    User findTeacherIdByteacherName(String teacherName) throws
            UserNotFoundException;

    Course findCourseIdByteacherIdAndCourseName(@Param("teacherId") BigInteger teacherId, @Param("courseName") String courseName) throws
            CourseNotFoundException;

    List<ClassInfo> findClassByCourseId(BigInteger courseId);

    ClassInfo findClassByClassId(BigInteger classId);
}
