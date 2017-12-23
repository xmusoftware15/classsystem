package xmu.crms.dao.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import xmu.crms.dao.CourseDao;
import xmu.crms.entity.ClassInfo;
import xmu.crms.entity.Course;
import xmu.crms.exception.ClassesNotFoundException;
import xmu.crms.exception.CourseNotFoundException;
import xmu.crms.mapper.CourseMapper;

import java.math.BigInteger;
import java.util.List;


public class CourseDaoImpl implements CourseDao{

    @Autowired
    private CourseMapper courseMapper;

    @Override
    public List<Course> listCourseByUserId(BigInteger userId) throws IllegalArgumentException, CourseNotFoundException {
        List<Course> courses = courseMapper.listCourseByUserId(userId);
        if(courses == null){
            throw new CourseNotFoundException();
        }
        else{
            return courses;
        }
    }

    @Override
    public BigInteger insertCourseByUserId(BigInteger userId, Course course) throws IllegalArgumentException {
        courseMapper.insertCourseByUserId(userId, course);
        return course.getId();
    }

    @Override
    public Course getCourseByCourseId(BigInteger courseId) throws IllegalArgumentException, CourseNotFoundException {
        Course course = courseMapper.selectCourseByCourseId(courseId);
        if(course == null){
            throw new CourseNotFoundException();
        }
        else{
            return course;
        }

    }

    @Override
    public void updateCourseByCourseId(BigInteger courseId, Course course) {
        courseMapper.updateCourseByCourseId(courseId, course);
    }

    @Override
    public void deleteCourseByCourseId(BigInteger courseId) throws IllegalArgumentException {
        courseMapper.deleteCourseByCourseId(courseId);
    }

    @Override
    public List<Course> listCourseByCourseName(String courseName) {
        return courseMapper.listCourseByCourseName(courseName);
    }

    @Override
    public List<ClassInfo> listClassByUserId(BigInteger userId) throws IllegalArgumentException, ClassesNotFoundException{
        List<ClassInfo> classInfos;
        classInfos = courseMapper.listClassByUserId(userId);
        if(classInfos == null){
            throw new ClassesNotFoundException();
        }
        else {
            return classInfos;
        }
    }

}
