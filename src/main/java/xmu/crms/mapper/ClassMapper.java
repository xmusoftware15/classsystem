package xmu.crms.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.math.BigInteger;

@Component
@Mapper
public interface ClassMapper {

    Boolean deleteClassSelectionByClassId(BigInteger classId);
}
