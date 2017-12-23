package xmu.crms.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import xmu.crms.entity.SeminarGroup;
import xmu.crms.entity.SeminarGroupMember;
import xmu.crms.entity.User;
import xmu.crms.exception.GroupNotFoundException;

import java.math.BigInteger;
import java.util.List;

@Component
public interface SeminarGroupMemberMapper {
    /**
     * 按seminarGroupId删除SeminarGroupMember信息.
     * <p>按seminarGroupId删除SeminarGroupMember信息<br>
     * @author huhui
     * @param seminarGroupId 讨论课小组Id
     */
    void deleteSeminarGroupMemberBySeminarGroupId(BigInteger seminarGroupId) ;
    /**
     * 将学生加入讨论课小组.
     * <p>将用户加入指定的讨论课小组<br>
     * @author YeHongjie
     * @param userId 学生的id
     * @param groupId 要加入讨论课小组的id
     * @return BigInteger 若创建成功返回该条记录的id，失败则返回-1
     */
    BigInteger insertSeminarGroupMemberById(@Param("id")BigInteger id,@Param("userId") BigInteger userId, @Param("groupId") BigInteger groupId);
    /**
     * 查询讨论课小组成员.
     * <p>按照讨论课小组id查询该小组的成员<br>
     * @author YeHongjie
     * @param groupId 要查询的讨论课小组id
     * @return List 讨论课小组成员信息
     */
    List<SeminarGroupMember> listSeminarGroupMemberByGroupId(BigInteger groupId);

    /**
     * 获取某学生所有的讨论课小组.
     * <p>根据学生id获取学生所在的所有讨论课小组的信息<br>
     * @author qinlingyun
     * @param userId 学生id
     * @return list 讨论课小组列表
     */
    List<SeminarGroupMember> listSeminarGroupIdByStudentId(BigInteger userId);
    /**
     * 创建小组成员信息.
     * <p>在指定小组成员表下创建一个新的小组信息<br>
     * @param seminarGroupMember 小组成员信息
     * @return BigInteger 若创建成功返回该小组成员表的id，失败则返回-1
     */
    void insertSeminarGroupMemberByGroupId( @Param("groupId") BigInteger groupId,@Param("seminarGroupMember") SeminarGroupMember seminarGroupMember);
}
