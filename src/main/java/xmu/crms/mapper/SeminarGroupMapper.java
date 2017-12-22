package xmu.crms.mapper;

import org.apache.ibatis.annotations.Param;
import xmu.crms.entity.SeminarGroup;
import xmu.crms.exception.GroupNotFoundException;
import xmu.crms.service.SeminarGroupService;

import java.math.BigInteger;
import java.util.List;

public interface SeminarGroupMapper {
 SeminarGroup selectSeminarGroupByGroupId(BigInteger seminarGroupId);
 BigInteger getSeminarGroupLeaderByGroupId(BigInteger groupId);
 List<SeminarGroup> listSeminarGroupBySeminarId(BigInteger seminarId);
 void deleteSeminarGroupBySeminarId(BigInteger seminarId);
 void insertSeminarGroupBySeminarId(@Param("seminarId") BigInteger seminarId, @Param("seminarGroup") SeminarGroup seminarGroup);
 /**
  * 删除讨论课小组.
  * <p>按照id删除讨论课小组<br>
  * @author YeHongjie
  * @param seminarGroupId 讨论课小组的id
  * @see SeminarGroupService #deleteSeminarGroupMemberBySeminarGroupId(BigInteger seminarGroupId)
  * @exception IllegalArgumentException 信息不合法，id格式错误
  */
 void deleteSeminarGroupByGroupId(BigInteger seminarGroupId);


}
