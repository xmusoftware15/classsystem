package xmu.crms;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages="xmu.crms.mapper")
public class ClasssystemApplication {
public static void main(String[] args)
{
	SpringApplication.run(ClasssystemApplication.class, args);
}
}
