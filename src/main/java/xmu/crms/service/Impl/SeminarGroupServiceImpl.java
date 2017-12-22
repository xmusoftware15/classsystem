package xmu.crms.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import xmu.crms.dao.SeminarGroupDao;
import xmu.crms.entity.SeminarGroup;
import xmu.crms.entity.SeminarGroupMember;
import xmu.crms.entity.User;
import xmu.crms.exception.*;
import xmu.crms.service.SeminarGroupService;

import java.math.BigInteger;
import java.util.List;

public class SeminarGroupServiceImpl implements SeminarGroupService{
    @Autowired
    private SeminarGroupDao seminarGroupDao;
    @Override
    public void deleteSeminarGroupMemberBySeminarGroupId(BigInteger seminarGroupId) {
        seminarGroupDao.deleteSeminarGroupMemberBySeminarGroupId(seminarGroupId);
    }

    @Override
    public void insertSeminarGroupMemberById(BigInteger userId, BigInteger groupId) throws IllegalArgumentException, GroupNotFoundException, UserNotFoundException, InvalidOperationException {
                seminarGroupDao.insertSeminarGroupMemberById(userId,groupId);
    }

    @Override
    public List<User> listSeminarGroupMemberByGroupId(BigInteger groupId) throws IllegalArgumentException, GroupNotFoundException {
        List<User> list=seminarGroupDao.listSeminarGroupMemberByGroupId(groupId);
        return list;
    }

    @Override
    public List<SeminarGroup> listSeminarGroupIdByStudentId(BigInteger userId) throws IllegalArgumentException {
        List<SeminarGroup> list=seminarGroupDao.listSeminarGroupIdByStudentId(userId);
        return null;
    }

    @Override
    public BigInteger getSeminarGroupLeaderByGroupId(BigInteger groupId) throws IllegalArgumentException, GroupNotFoundException {
        BigInteger leaderId=seminarGroupDao.getSeminarGroupLeaderByGroupId(groupId);
        return leaderId;
    }

    @Override
    public List<SeminarGroup> listSeminarGroupBySeminarId(BigInteger seminarId) throws IllegalArgumentException, SeminarNotFoundException {
        List<SeminarGroup> list=seminarGroupDao.listSeminarGroupBySeminarId(seminarId);
        return list;
    }

    @Override
    public void deleteSeminarGroupBySeminarId(BigInteger seminarId) throws IllegalArgumentException ,SeminarNotFoundException{
        List<SeminarGroup> list=listSeminarGroupBySeminarId(seminarId);
        for(SeminarGroup s:list){
            deleteSeminarGroupMemberBySeminarGroupId(s.getId());
        }
              seminarGroupDao.deleteSeminarGroupBySeminarId(seminarId);
    }

    @Override
    public BigInteger insertSeminarGroupBySeminarId(BigInteger seminarId, SeminarGroup seminarGroup) throws IllegalArgumentException {
         seminarGroupDao.insertSeminarGroupBySeminarId(seminarId,seminarGroup);
return seminarGroup.getId();
    }

    @Override
    public void insertSeminarGroupMemberByGroupId(BigInteger groupId, SeminarGroupMember seminarGroupMember) {

    }

    @Override
    public void deleteSeminarGroupByGroupId(BigInteger seminarGroupId) throws IllegalArgumentException {

    }

    @Override
    public SeminarGroup getSeminarGroupByGroupId(BigInteger groupId) throws IllegalArgumentException, GroupNotFoundException {
        return null;
    }

    @Override
    public BigInteger getSeminarGroupLeaderById(BigInteger userId, BigInteger seminarId) throws IllegalArgumentException,GroupNotFoundException {
        SeminarGroup seminarGroup=getSeminarGroupById(seminarId,userId);
BigInteger leaderId=getSeminarGroupLeaderByGroupId(seminarGroup.getId());
        return leaderId;
    }

    @Override
    public void automaticallyGrouping(BigInteger seminarId, BigInteger classId) throws IllegalArgumentException, ClassesNotFoundException, SeminarNotFoundException {

    }

    @Override
    public SeminarGroup getSeminarGroupById(BigInteger seminarId, BigInteger userId) throws IllegalArgumentException, GroupNotFoundException {

        return null;
    }

    @Override
    public List<SeminarGroup> listGroupByTopicId(BigInteger topicId) throws IllegalArgumentException, GroupNotFoundException {
        return null;
    }

    @Override
    public void insertTopicByGroupId(BigInteger groupId, BigInteger topicId) throws IllegalArgumentException, GroupNotFoundException {

    }

    @Override
    public void assignLeaderById(BigInteger groupId, BigInteger userId) throws IllegalArgumentException, UserNotFoundException, GroupNotFoundException, InvalidOperationException {

    }

    @Override
    public void resignLeaderById(BigInteger groupId, BigInteger userId) throws IllegalArgumentException, GroupNotFoundException {

    }

}
