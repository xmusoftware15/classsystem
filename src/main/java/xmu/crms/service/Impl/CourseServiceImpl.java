package xmu.crms.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import xmu.crms.dao.CourseDao;
import xmu.crms.entity.ClassInfo;
import xmu.crms.entity.Course;
import xmu.crms.entity.User;
import xmu.crms.exception.CourseNotFoundException;
import xmu.crms.exception.ClassesNotFoundException;
import xmu.crms.exception.UserNotFoundException;
import xmu.crms.service.ClassService;
import xmu.crms.service.CourseService;
import xmu.crms.service.UserService;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService{

    private CourseDao courseDao;

    private ClassService classService;

    private UserService userService;

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
    public List<ClassInfo> listClassByCourseName(String courseName)throws CourseNotFoundException {
        List<Course> courses = listCourseByCourseName(courseName);
        List<ClassInfo> classInfos = new ArrayList<ClassInfo>();
        for(Course course : courses){
            List<ClassInfo> classInfos1;
            classInfos1 = classService.listClassByCourseId(course.getId());
            classInfos.addAll(classInfos1);
        }
        return classInfos;
    }

    @Override
    public List<ClassInfo> listClassByTeacherName(String teacherName) throws
            IllegalArgumentException,UserNotFoundException ,ClassesNotFoundException{
        List<User> users = userService.listUserByUserName(teacherName);
        List<ClassInfo> classInfos = new ArrayList<ClassInfo>();
        for(User user : users){
            List<ClassInfo> classInfos1;
            classInfos1 = listClassByUserId(user.getId());
            classInfos.addAll(classInfos1);
        }
        return classInfos;
    }

    @Override
    public List<ClassInfo> listClassByUserId(BigInteger userId) throws IllegalArgumentException, ClassesNotFoundException {
        return courseDao.listClassByUserId(userId);
    }
}
