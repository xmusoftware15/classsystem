package xmu.crms.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xmu.crms.dao.SeminarGroupDao;
import xmu.crms.entity.SeminarGroup;
import xmu.crms.entity.SeminarGroupMember;
import xmu.crms.entity.User;
import xmu.crms.exception.*;
import xmu.crms.service.SeminarGroupService;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Huhui
 */
@Service
public class SeminarGroupServiceImpl implements SeminarGroupService {
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
    public BigInteger insertSeminarGroupBySeminarId(BigInteger seminarId,BigInteger classId, SeminarGroup seminarGroup) throws IllegalArgumentException {
         seminarGroupDao.insertSeminarGroupBySeminarId(seminarId,classId,seminarGroup);
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
    public SeminarGroup getSeminarGroupByGroupId(BigInteger groupId) throws IllegalArgumentException, GroupNotFoundException {
       SeminarGroup seminarGroup=seminarGroupDao.getSeminarGroupByGroupId(groupId);
        return seminarGroup;
    }

    @Override
    public BigInteger getSeminarGroupLeaderById(BigInteger userId, BigInteger seminarId) throws IllegalArgumentException,GroupNotFoundException {
        SeminarGroup seminarGroup=getSeminarGroupById(seminarId,userId);
BigInteger leaderId=getSeminarGroupLeaderByGroupId(seminarGroup.getId());
        return leaderId;
    }

    @Override
    public void automaticallyGrouping(BigInteger seminarId, BigInteger classId) throws IllegalArgumentException, ClassesNotFoundException,
            SeminarNotFoundException,GroupNotFoundException,UserNotFoundException ,InvalidOperationException{
//       List<Attendance> list= UserService.listAttendanceById(BigInteger classId, BigInteger seminarId);
//              int num=list.size();//签到的总人数
//              int groupmemberlimit=num/9;//每组人数
//              int left=num-groupmemberlimit*9;//不够整除，余下的人
//              int k=0;//数组指针
//              for(int i = 0;i<9;i++){
//               if(left!=0){
//                   BigInteger seminarGroupId=null;
//                   for(int j=0;j<=groupmemberlimit;j++)
//                   {
//                       User student=list.get(k+j).getStudent();
//                       if(j==0) {
//                           SeminarGroup seminarGroup = new SeminarGroup();
//                           seminarGroup.setLeader(student);
//                           insertSeminarGroupBySeminarId(seminarId,classId,seminarGroup);
//                           seminarGroupId=seminarGroup.getId();
//                       }
//                       if(seminarGroupId!=null) {
//                           insertSeminarGroupMemberById(student.getId(), seminarGroupId);
//                       }
//                   }
//                   k+=groupmemberlimit+1;
//               }
//                else{
//                   BigInteger seminarGroupId=null;
//                   for(int j=0;j<groupmemberlimit;j++)
//                   {
//                       User student=list.get(k+j).getStudent();
//                       if(j==0) {
//                           SeminarGroup seminarGroup = new SeminarGroup();
//                           seminarGroup.setLeader(student);
//                           insertSeminarGroupBySeminarId(seminarId,classId,seminarGroup);
//                           seminarGroupId=seminarGroup.getId();
//                       }
//                       if(seminarGroupId!=null) {
//                           insertSeminarGroupMemberById(student.getId(), seminarGroupId);
//                       }
//                   }
//                   k+=groupmemberlimit;
//
//               }
//        }


    }

    @Override
    public SeminarGroup getSeminarGroupById(BigInteger seminarId, BigInteger userId) throws IllegalArgumentException, GroupNotFoundException {
SeminarGroup seminarGroup= seminarGroupDao.getSeminarGroupById(seminarId,userId);
        return seminarGroup;
    }

    @Override
    public List<SeminarGroup> listGroupByTopicId(BigInteger topicId) throws IllegalArgumentException, GroupNotFoundException {
        List<SeminarGroup> list=seminarGroupDao.listGroupByTopicId(topicId);
        return list;
    }

    @Override
    public BigInteger insertTopicByGroupId(BigInteger groupId, BigInteger topicId) throws IllegalArgumentException, GroupNotFoundException {
BigInteger seminarGroupTopic=seminarGroupDao.insertTopicByGroupId(groupId,topicId);
return seminarGroupTopic;
    }

    @Override
    public void assignLeaderById(BigInteger groupId, BigInteger userId) throws IllegalArgumentException, UserNotFoundException, GroupNotFoundException, InvalidOperationException {
SeminarGroup seminarGroup=seminarGroupDao.getSeminarGroupByGroupId(groupId);
if(seminarGroup==null){throw new GroupNotFoundException();}
if(seminarGroup.getLeader()!=null){throw new InvalidOperationException();}
//User user=UserService.getUserByUserId(userId);
//if(user==null){throw new UserNotFoundException();}
        seminarGroupDao.updateSeminarGroupById(groupId,userId);
    }

    @Override
    public void resignLeaderById(BigInteger groupId, BigInteger userId) throws IllegalArgumentException, GroupNotFoundException ,UserNotFoundException,InvalidOperationException{
        SeminarGroup seminarGroup=seminarGroupDao.getSeminarGroupByGroupId(groupId);
        if(seminarGroup==null){throw new GroupNotFoundException();}
        if(seminarGroup.getLeader()==null){throw new InvalidOperationException();}
//User user=UserService.getUserByUserId(userId);
//if(user==null){throw new UserNotFoundException();}
        seminarGroupDao.updateSeminarGroupById(groupId,null);
    }

}
