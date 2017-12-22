package xmu.crms.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import xmu.crms.dao.CourseDao;
import xmu.crms.entity.ClassInfo;
import xmu.crms.entity.Course;
import xmu.crms.exception.CourseNotFoundException;
import xmu.crms.service.ClassService;
import xmu.crms.service.CourseService;

import java.math.BigInteger;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService{

    @Autowired
    private CourseDao courseDao;

    @Autowired
    private ClassService classService;

    @Override
    public List<Course> listCourseByUserId(BigInteger userId) throws IllegalArgumentException, CourseNotFoundException {
        return courseDao.listCourseByUserId(userId);
    }

    @Override
    public BigInteger insertCourseByUserId(BigInteger userId, Course course) throws IllegalArgumentException {
        return courseDao.insertCourseByUserId(userId, course);
    }

    @Override
    public Course getCourseByCourseId(BigInteger courseId) throws IllegalArgumentException, CourseNotFoundException {
        return courseDao.getCourseByCourseId(courseId);
    }

    @Override
    public void updateCourseByCourseId(BigInteger courseId, Course course) {
        courseDao.updateCourseByCourseId(courseId, course);
    }

    @Override
    public void deleteCourseByCourseId(BigInteger courseId) throws IllegalArgumentException{
        courseDao.deleteCourseByCourseId(courseId);
    }

    @Override
    public List<Course> listCourseByCourseName(String courseName) {
        return courseDao.listCourseByCourseName(courseName);
    }

    @Override
    public List<ClassInfo> listClassByCourseName(String courseName) {
        List<Course> courses = listCourseByCourseName(courseName);
        List<ClassInfo> classInfos;
        for(Course course : courses){
            classService.listClassByCourseId(course.getId())
        }
    }

    @Override
    public List<ClassInfo> listClassByTeacherName(String teacherName) {
        return null;
    }

    @Override
    public List<ClassInfo> listClassByUserId(BigInteger userId) throws IllegalArgumentException, ClassNotFoundException {
        return null;
    }
}
