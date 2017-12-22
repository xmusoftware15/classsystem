package xmu.crms.dao.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import xmu.crms.dao.ClassDao;
import xmu.crms.entity.ClassInfo;
import xmu.crms.entity.Course;
import xmu.crms.entity.User;
import xmu.crms.exception.CourseNotFoundException;
import xmu.crms.exception.UserNotFoundException;
import xmu.crms.mapper.ClassMapper;
import xmu.crms.pojo.Class;

import java.math.BigInteger;
import java.util.List;

@Component
public class ClassDaoImpl implements ClassDao{

    @Autowired
    private ClassMapper classMapper;

    @Override
    public List<ClassInfo> listClassByName(String courseName, String teacherName) throws UserNotFoundException, CourseNotFoundException {
        List<ClassInfo> classes;
        User teacher = classMapper.findTeacherIdByteacherName(teacherName);
        if(teacher == null){
            throw new UserNotFoundException();
        }else{
            BigInteger teacherId = teacher.getId();
            Course course = classMapper.findCourseIdByteacherIdAndCourseName(teacherId,courseName);
            if(course == null){
                throw new CourseNotFoundException();
            }else{
                BigInteger courseId = course.getId();
                classes = classMapper.findClassByCourseId(courseId);
            }
        }
        return classes;
    }

    @Override
    public Boolean deleteClassSelectionByClassId(BigInteger classId) {
        return classMapper.deleteClassSelectionByClassId(classId);
    }

    @Override
    public List<ClassInfo> findClassByCourseId(BigInteger courseId) throws CourseNotFoundException {
        List<ClassInfo> classes;
        classes = classMapper.findClassByCourseId(courseId);
        if(classes == null) {
            throw new CourseNotFoundException();
        }
        return classes;
    }

    @Override
    public ClassInfo findClassByClassId(BigInteger classId) throws ClassNotFoundException {
        ClassInfo classes;
        classes = classMapper.findClassByClassId(classId);
        if(classes == null) {
            throw new ClassNotFoundException();
        }
        return classes;
    }

    @Override
    public Boolean updateClassByClassId(BigInteger classId, ClassInfo newClass) throws ClassNotFoundException {
        newClass.setId(classId);
        return classMapper.updateClassByClassId(newClass);

    }

    @Override
    public Boolean deleteClassByClassId(BigInteger classId) throws ClassNotFoundException {
        ClassInfo classInfo = classMapper.findClassByClassId(classId);
        if(classInfo == null){
            throw new ClassNotFoundException();
        }else{
            classMapper.deleteClassByClassId(classId);
        }
        return null;
    }

    @Override
    public Boolean insertCourseSelectionById(BigInteger userId, BigInteger classId) throws UserNotFoundException, ClassNotFoundException {
        User student = classMapper.findStudentdByStudentId(userId);
        if(student == null){
            throw new UserNotFoundException();
        }else {
            ClassInfo classInfo = classMapper.findClassByClassId(classId);
            if(classInfo == null){
                throw new ClassNotFoundException();
            }else{
                classMapper.insertCourseSelectionById(userId,classId);
            }
        }
        return null;
    }

    @Override
    public Boolean deleteCourseSelectionById(BigInteger userId, BigInteger classId) throws UserNotFoundException, ClassNotFoundException {
        User student = classMapper.findStudentdByStudentId(userId);
        if(student == null){
            throw new UserNotFoundException();
        }else {
            ClassInfo classInfo = classMapper.findClassByClassId(classId);
            if(classInfo == null){
                throw new ClassNotFoundException();
            }else{
                classMapper.deleteCourseSelectionById(userId,classId);
            }
        }

        return null;
    }

    @Override
    public BigInteger insertClassById(BigInteger userId, BigInteger courseId) throws UserNotFoundException, CourseNotFoundException {
        User teacher = classMapper.findTeacherByTeacherId(userId);
        if(teacher == null){
            throw new UserNotFoundException();
        }else {
            Course course = classMapper.findCourseByCourseId(courseId);
            if(course == null){
                throw new CourseNotFoundException();
            }
        }
        return null;
    }
}
