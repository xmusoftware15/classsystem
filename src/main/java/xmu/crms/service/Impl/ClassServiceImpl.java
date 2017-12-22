package xmu.crms.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import xmu.crms.dao.ClassDao;
import xmu.crms.entity.ClassInfo;
import xmu.crms.entity.Location;
import xmu.crms.entity.Seminar;
import xmu.crms.exception.*;
import xmu.crms.service.ClassService;
import xmu.crms.service.SeminarGroupService;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

@Service
public class ClassServiceImpl implements ClassService{

    @Autowired
    private ClassDao classDao;
    private SeminarGroupService seminarGroupService;

    @Override
    public void deleteClassSelectionByClassId(BigInteger classId) {
        classDao.deleteClassSelectionByClassId(classId);
    }

    @Override
    public List<ClassInfo> listClassByName(String courseName, String teacherName) throws UserNotFoundException, CourseNotFoundException {
        List<ClassInfo> classes = new ArrayList<>();
        classes= classDao.listClassByName(courseName,teacherName);

        return classes;
    }

    @Override
    public List<ClassInfo> listClassByCourseId(BigInteger courseId) throws CourseNotFoundException {
        List<ClassInfo> classes = new ArrayList<>();
        classes = classDao.findClassByCourseId(courseId);
        return classes;
    }

    @Override
    public ClassInfo getClassByClassId(BigInteger classId) throws ClassesNotFoundException {
        ClassInfo classInfo = classDao.findClassByClassId(classId);
        return classInfo;
    }

    @Override
    public void updateClassByClassId(BigInteger classId, ClassInfo newClass) throws ClassesNotFoundException {
        classDao.updateClassByClassId(classId,newClass);
    }

    @Override
    public void deleteClassByClassId(BigInteger classId) throws ClassesNotFoundException {
        classDao.deleteClassByClassId(classId);
    }

    @Override
    public BigInteger insertCourseSelectionById(BigInteger userId, BigInteger classId) throws UserNotFoundException, ClassesNotFoundException {
        if(classDao.insertCourseSelectionById(userId,classId)){
            BigInteger id = classDao.findCourseIdByUserIdAndClassId(userId,classId);
            return id;
        }else {
            return null;
        }

    }

    @Override
    public void deleteCourseSelectionById(BigInteger userId, BigInteger classId) throws UserNotFoundException, ClassesNotFoundException {
        classDao.deleteCourseSelectionById(userId,classId);
    }

    @Override
    public Location getCallStatusById(BigInteger classId, BigInteger seminarId) throws SeminarNotFoundException {
        Location location = classDao.getCallStatusById(classId,seminarId);
        return location;
    }


    @Override
    public BigInteger insertClassById(BigInteger userId, BigInteger courseId, ClassInfo classInfo) throws UserNotFoundException, CourseNotFoundException {
        return null;
    }

    @Override
    public void deleteClassByCourseId(BigInteger courseId) throws CourseNotFoundException {
        return ;
    }

    @Override
    public void deleteScoreRuleById(BigInteger classId) throws ClassesNotFoundException {
        return ;
    }

    @Override
    public ClassInfo getScoreRule(BigInteger classId) throws ClassesNotFoundException {
        return null;
    }

    @Override
    public BigInteger insertScoreRule(BigInteger classId, ClassInfo proportions) throws InvalidOperationException, ClassesNotFoundException {
        return null;
    }

    @Override
    public void updateScoreRule(BigInteger classId, ClassInfo proportions) throws InvalidOperationException, ClassesNotFoundException {
        return ;
    }
}
