package xmu.crms.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import xmu.crms.dao.SeminarGroupDao;
import xmu.crms.entity.Attendance;
import xmu.crms.entity.SeminarGroup;
import xmu.crms.entity.SeminarGroupMember;
import xmu.crms.entity.User;
import xmu.crms.exception.*;
import xmu.crms.service.SeminarGroupService;
import xmu.crms.service.UserService;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class SeminarGroupServiceImpl implements SeminarGroupService{
    @Autowired
    private SeminarGroupDao seminarGroupDao;
    @Override
    public void deleteSeminarGroupMemberBySeminarGroupId(BigInteger seminarGroupId) {
        seminarGroupDao.deleteSeminarGroupMemberBySeminarGroupId(seminarGroupId);
    }

    @Override
    public BigInteger insertSeminarGroupMemberById(BigInteger userId, BigInteger groupId) throws IllegalArgumentException, GroupNotFoundException, UserNotFoundException, InvalidOperationException {
        BigInteger id=null;
                seminarGroupDao.insertSeminarGroupMemberById(id,userId,groupId);
                return id;
    }

    @Override
    public List<User> listSeminarGroupMemberByGroupId(BigInteger groupId) throws IllegalArgumentException, GroupNotFoundException {
        List<SeminarGroupMember> list=seminarGroupDao.listSeminarGroupMemberByGroupId(groupId);
        List<User> userList=new ArrayList<User>();
        for(SeminarGroupMember s:list){
            User user=s.getStudent();
            userList.add(user);

    }
    return userList;
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
    public void deleteSeminarGroupBySeminarId(BigInteger seminarId) throws IllegalArgumentException,SeminarNotFoundException {
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
    public BigInteger insertSeminarGroupMemberByGroupId(BigInteger groupId, SeminarGroupMember seminarGroupMember) {
        seminarGroupDao.insertSeminarGroupMemberByGroupId(groupId,seminarGroupMember);
        return seminarGroupMember.getId();
    }

    @Override
    public void deleteSeminarGroupByGroupId(BigInteger seminarGroupId) throws IllegalArgumentException {
deleteSeminarGroupMemberBySeminarGroupId(seminarGroupId);
seminarGroupDao.deleteSeminarGroupByGroupId(seminarGroupId);
    }

    @Override
    public List<SeminarGroupMember> getSeminarGroupByGroupId(BigInteger groupId) throws IllegalArgumentException, GroupNotFoundException {
       List<SeminarGroupMember> list=seminarGroupDao.listSeminarGroupMemberByGroupId(groupId);
        return list;
    }

    @Override
    public BigInteger getSeminarGroupLeaderById(BigInteger userId, BigInteger seminarId) throws IllegalArgumentException,GroupNotFoundException {
        SeminarGroup seminarGroup=getSeminarGroupById(seminarId,userId);
BigInteger leaderId=getSeminarGroupLeaderByGroupId(seminarGroup.getId());
        return leaderId;
    }

    @Override
    public void automaticallyGrouping(BigInteger seminarId, BigInteger classId) throws IllegalArgumentException, ClassesNotFoundException, SeminarNotFoundException {
       List<Attendance> list= UserService.listAttendanceById(BigInteger classId, BigInteger seminarId);
              int num=list.size();//签到的总人数
              int groupmemberlimit=num/9;//每组人数
              int left=num-groupmemberlimit*9;//不够整除，余下的人
              int k=0;//数组指针
              for(int i = 0;i<9;i++){
               if(left!=0){
                   for(int j=0;j<=groupmemberlimit;j++)
                   {
                       list.get(k+j).getStudent();

                   }
                   k+=groupmemberlimit+1;
               }
                else{}
        }


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
