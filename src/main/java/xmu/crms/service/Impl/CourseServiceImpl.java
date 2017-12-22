package xmu.crms.service.Impl;

import xmu.crms.entity.ClassInfo;
import xmu.crms.entity.Course;
import xmu.crms.exception.CourseNotFoundException;
import xmu.crms.service.CourseService;

import java.math.BigInteger;
import java.util.List;

public class CourseServiceImpl implements CourseService{
    @Override
    public List<Course> listCourseByUserId(BigInteger userId) throws IllegalArgumentException, CourseNotFoundException {
        return null;
    }

    @Override
    public BigInteger insertCourseByUserId(BigInteger userId, Course course) throws IllegalArgumentException {
        return null;
    }

    @Override
    public Course getCourseByCourseId(BigInteger courseId) throws IllegalArgumentException, CourseNotFoundException {
        return null;
    }

    @Override
    public void updateCourseByCourseId(BigInteger courseId, Course course) {

    }

    @Override
    public void deleteCourseByCourseId(BigInteger courseId) throws IllegalArgumentException, CourseNotFoundException {

    }

    @Override
    public List<Course> listCourseByCourseName(String courseName) {
        return null;
    }

    @Override
    public List<ClassInfo> listClassByCourseName(String courseName) {
        return null;
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
