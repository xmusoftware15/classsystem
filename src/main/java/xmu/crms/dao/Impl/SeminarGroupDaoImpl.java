package xmu.crms.dao.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import xmu.crms.dao.SeminarGroupDao;
import xmu.crms.mapper.SeminarGroupMapper;

import java.math.BigInteger;

public class SeminarGroupDaoImpl implements SeminarGroupDao{
    @Autowired
    private SeminarGroupMapper seminarGroupMapper;
    @Override
    public void deleteSeminarGroupMemberBySeminarGroupId(BigInteger seminarGroupId) {

    }
}
