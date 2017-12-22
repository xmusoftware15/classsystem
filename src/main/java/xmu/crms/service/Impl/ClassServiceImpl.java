package xmu.crms.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import xmu.crms.dao.ClassDao;
import xmu.crms.entity.ClassInfo;
import xmu.crms.entity.Location;
import xmu.crms.exception.CourseNotFoundException;
import xmu.crms.exception.InvalidOperationException;
import xmu.crms.exception.SeminarNotFoundException;
import xmu.crms.exception.UserNotFoundException;
import xmu.crms.service.ClassService;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

@Service
public class ClassServiceImpl implements ClassService{

    @Autowired
    private ClassDao classDao;

    @Override
    public Boolean deleteClassSelectionByClassId(BigInteger classId) {
        
        return null;
    }

    @Override
    public List<ClassInfo> listClassByName(String courseName, String teacherName) throws UserNotFoundException, CourseNotFoundException {
        return null;
    }

    @Override
    public List<ClassInfo> listClassByCourseId(BigInteger courseId) throws CourseNotFoundException {
        return null;
    }

    @Override
    public ClassInfo getClassByClassId(BigInteger classId) throws ClassNotFoundException {
        return null;
    }

    @Override
    public Boolean updateClassByClassId(BigInteger classId, ClassInfo newClass) throws ClassNotFoundException {
        return null;
    }

    @Override
    public Boolean deleteClassByClassId(BigInteger classId) throws ClassNotFoundException {
        return null;
    }

    @Override
    public String insertCourseSelectionById(BigInteger userId, BigInteger classId) throws UserNotFoundException, ClassNotFoundException {
        return null;
    }

    @Override
    public Boolean deleteCourseSelectionById(BigInteger userId, BigInteger classId) throws UserNotFoundException, ClassNotFoundException {
        return null;
    }

    @Override
    public Location getCallStatusById(BigInteger seminarId) throws SeminarNotFoundException {
        return null;
    }

    @Override
    public BigInteger insertClassById(BigInteger userId, BigInteger courseId, ClassInfo classInfo) throws UserNotFoundException, CourseNotFoundException {
        return null;
    }

    @Override
    public Boolean deleteClassByCourseId(BigInteger courseId) throws CourseNotFoundException {
        return null;
    }

    @Override
    public Boolean deleteScoreRuleById(BigInteger classId) throws ClassNotFoundException {
        return null;
    }

    @Override
    public ClassInfo getScoreRule(BigInteger classId) throws ClassNotFoundException {
        return null;
    }

    @Override
    public BigInteger insertScoreRule(BigInteger classId, ClassInfo proportions) throws InvalidOperationException, ClassNotFoundException {
        return null;
    }

    @Override
    public Boolean updateScoreRule(BigInteger classId, ClassInfo proportions) throws InvalidOperationException, ClassNotFoundException {
        return null;
    }
}
