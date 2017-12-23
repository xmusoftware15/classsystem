package xmu.crms.mapper;

import org.apache.ibatis.annotations.Param;

import java.math.BigInteger;

public interface SeminarGroupTopicMapper {
   void insertTopicByGroupId(@Param("seminarGroupTopicId") BigInteger seminarGroupTopicId, @Param("groupId") BigInteger groupId,@Param("topicId") BigInteger topicId);
}
