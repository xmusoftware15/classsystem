package xmu.crms.dao.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import xmu.crms.dao.ClassDao;
import xmu.crms.entity.ClassInfo;
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
            User teacher = classMapper.findTeacherIdByteacherName(teacherName);
            System.out.println(teacherName);
            System.out.println(teacher.getId());
            if(teacher.getId() == null){
                throw new UserNotFoundException();
            }else{

            }
        return null;
    }

    @Override
    public Boolean deleteClassSelectionByClassId(BigInteger classId) {
        return classMapper.deleteClassSelectionByClassId(classId);
    }
}
