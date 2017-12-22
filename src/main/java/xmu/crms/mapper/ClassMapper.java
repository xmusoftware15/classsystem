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

    User findTeacherIdByteacherName(String teacherName);

    Course findCourseIdByteacherIdAndCourseName(@Param("teacherId") BigInteger teacherId, @Param("courseName") String courseName);

    List<ClassInfo> findClassByCourseId(BigInteger courseId);

    ClassInfo findClassByClassId(BigInteger classId);

    Boolean updateClassByClassId(ClassInfo newClass);

    Boolean deleteClassByClassId(BigInteger classId);

    Boolean insertCourseSelectionById(@Param("userId") BigInteger userId, @Param("classId") BigInteger classId);

    User findStudentdByStudentId(BigInteger studentId);

    User findTeacherByTeacherId(BigInteger teacherId);

    Course findCourseByCourseId(BigInteger courseId);

    Boolean deleteCourseSelectionById(@Param("userId")BigInteger userId, @Param("classId")BigInteger classId);
}
