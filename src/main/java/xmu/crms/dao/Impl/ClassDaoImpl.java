package xmu.crms.dao.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import xmu.crms.dao.ClassDao;
import xmu.crms.mapper.ClassMapper;

import java.math.BigInteger;

@Component
public class ClassDaoImpl implements ClassDao{

    @Autowired
    private ClassMapper classMapper;
    @Override
    public Boolean deleteClassSelectionByClassId(BigInteger classId) {
        classMapper.deleteClassSelectionByClassId(classId);

        return null;
    }
}
