package xmu.crms.dao.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import xmu.crms.dao.SeminarGroupDao;
import xmu.crms.entity.SeminarGroup;
import xmu.crms.entity.SeminarGroupMember;
import xmu.crms.entity.User;
import xmu.crms.exception.*;
import xmu.crms.mapper.SeminarGroupMapper;
import xmu.crms.mapper.SeminarGroupMemberMapper;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class SeminarGroupDaoImpl implements SeminarGroupDao{
    @Autowired
    private SeminarGroupMapper seminarGroupMapper;
    @Autowired
    private SeminarGroupMemberMapper seminarGroupMemberMapper;
    @Override
    public void deleteSeminarGroupMemberBySeminarGroupId(BigInteger seminarGroupId) {
seminarGroupMemberMapper.deleteSeminarGroupMemberBySeminarGroupId(seminarGroupId);
    }

    @Override
    public void insertSeminarGroupMemberById(BigInteger id,BigInteger userId, BigInteger groupId) {
        seminarGroupMemberMapper.insertSeminarGroupMemberById(id,userId,groupId);
    }

    @Override
    public List<SeminarGroupMember> listSeminarGroupMemberByGroupId(BigInteger groupId) throws IllegalArgumentException, GroupNotFoundException {
          List<SeminarGroupMember> list=seminarGroupMemberMapper.listSeminarGroupMemberByGroupId(groupId);
          if(list==null){throw new GroupNotFoundException();}
          else{
              return list;
          }
       }


    @Override
    public List<SeminarGroup> listSeminarGroupIdByStudentId(BigInteger userId) throws IllegalArgumentException {
List<SeminarGroupMember> list=seminarGroupMemberMapper.listSeminarGroupIdByStudentId(userId);

            List<SeminarGroup> groupList=new ArrayList<SeminarGroup>();
            for(SeminarGroupMember s:list){
                SeminarGroup group=s.getSeminarGroup();
                groupList.add(group);
            }
            return groupList;
    }

    @Override
    public BigInteger getSeminarGroupLeaderByGroupId(BigInteger groupId) throws IllegalArgumentException, GroupNotFoundException {
        BigInteger leaderId=seminarGroupMapper.getSeminarGroupLeaderByGroupId(groupId);
        return leaderId;
    }

    @Override
    public List<SeminarGroup> listSeminarGroupBySeminarId(BigInteger seminarId) throws IllegalArgumentException, SeminarNotFoundException {
           List<SeminarGroup> list=seminarGroupMapper.listSeminarGroupBySeminarId(seminarId);
           if(list==null){throw new SeminarNotFoundException();}
           else{
        return list;}
    }

    @Override
    public void deleteSeminarGroupBySeminarId(BigInteger seminarId) throws IllegalArgumentException {
seminarGroupMapper.deleteSeminarGroupBySeminarId(seminarId);
    }

    @Override
    public BigInteger insertSeminarGroupBySeminarId( BigInteger seminarId,SeminarGroup seminarGroup) throws IllegalArgumentException {
        seminarGroupMapper.insertSeminarGroupBySeminarId(seminarId,seminarGroup);
        return  seminarGroup.getId();
    }

    @Override
    public BigInteger insertSeminarGroupMemberByGroupId( BigInteger groupId,SeminarGroupMember seminarGroupMember) {

        seminarGroupMemberMapper.insertSeminarGroupMemberByGroupId(groupId,seminarGroupMember);
        return seminarGroupMember.getId();
    }

    @Override
    public void deleteSeminarGroupByGroupId(BigInteger seminarGroupId) throws IllegalArgumentException {
seminarGroupMapper.deleteSeminarGroupByGroupId(seminarGroupId);
    }

    @Override
    public SeminarGroup getSeminarGroupByGroupId(BigInteger groupId) throws IllegalArgumentException, GroupNotFoundException {
SeminarGroup seminarGroup=seminarGroupMapper.selectSeminarGroupByGroupId(groupId);
if(seminarGroup==null){throw new GroupNotFoundException();}
else{
        return seminarGroup;
    }}


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
    public BigInteger insertTopicByGroupId(BigInteger groupId, BigInteger topicId) throws IllegalArgumentException, GroupNotFoundException {
        return null;
    }

    @Override
    public void assignLeaderById(BigInteger groupId, BigInteger userId) throws IllegalArgumentException, UserNotFoundException, GroupNotFoundException, InvalidOperationException {

    }

    @Override
    public void resignLeaderById(BigInteger groupId, BigInteger userId) throws IllegalArgumentException, GroupNotFoundException {

    }
}
