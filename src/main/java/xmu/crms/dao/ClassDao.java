package xmu.crms.dao;

import xmu.crms.entity.ClassInfo;
import xmu.crms.entity.Location;
import xmu.crms.exception.ClassesNotFoundException;
import xmu.crms.exception.CourseNotFoundException;
import xmu.crms.exception.SeminarNotFoundException;
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
            ClassesNotFoundException;

    Boolean updateClassByClassId(BigInteger classId,ClassInfo newClass) throws
            ClassesNotFoundException;

    Boolean deleteClassByClassId(BigInteger classId)
            throws ClassesNotFoundException;

    Boolean insertCourseSelectionById(BigInteger userId, BigInteger classId) throws
            UserNotFoundException,ClassesNotFoundException;

    Boolean deleteCourseSelectionById(BigInteger userId, BigInteger classId) throws
            UserNotFoundException,ClassesNotFoundException;

    BigInteger insertClassById(BigInteger userId, BigInteger courseId) throws
            UserNotFoundException,CourseNotFoundException;

    BigInteger findCourseIdByUserIdAndClassId(BigInteger userId,BigInteger classId);


    Location getCallStatusById(BigInteger classId, BigInteger seminarId) throws SeminarNotFoundException;
}
