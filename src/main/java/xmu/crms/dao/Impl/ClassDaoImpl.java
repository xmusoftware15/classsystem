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

        return classMapper.updateClassByClassId(classId,newClass);

    }
}
