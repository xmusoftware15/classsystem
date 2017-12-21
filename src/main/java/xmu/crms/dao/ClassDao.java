package xmu.crms.dao;

import xmu.crms.entity.ClassInfo;
import xmu.crms.exception.CourseNotFoundException;
import xmu.crms.exception.UserNotFoundException;

import java.math.BigInteger;
import java.util.List;

public interface ClassDao {

    Boolean deleteClassSelectionByClassId(BigInteger classId);

    List<ClassInfo> listClassByName(String courseName, String teacherName) throws
            UserNotFoundException,CourseNotFoundException;

    List<ClassInfo> findClassByCourseId(BigInteger courseId) throws
            CourseNotFoundException;

    ClassInfo findClassByClassId(BigInteger classId) throws
            ClassNotFoundException;

    Boolean updateClassByClassId(BigInteger classId,ClassInfo newClass) throws
            ClassNotFoundException;
}
