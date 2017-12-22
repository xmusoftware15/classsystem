package xmu.crms.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigInteger;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ClassMapperTest {@Autowired
private ClassMapper classMapper;

    @Test
    public void testSelectCourse() {
        System.out.println(classMapper.findClassByCourseId(BigInteger.valueOf(1L)));
    }


}
