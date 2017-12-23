package xmu.crms.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.math.BigInteger;

@Component
public interface SeminarGroupTopicMapper {
   void insertTopicByGroupId(@Param("seminarGroupTopicId") BigInteger seminarGroupTopicId, @Param("groupId") BigInteger groupId,@Param("topicId") BigInteger topicId);
}
