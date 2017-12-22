package xmu.crms.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import xmu.crms.entity.ClassInfo;
import xmu.crms.exception.ClassesNotFoundException;
import xmu.crms.exception.CourseNotFoundException;
import xmu.crms.exception.SeminarNotFoundException;
import xmu.crms.exception.UserNotFoundException;
import xmu.crms.mapper.ClassMapper;

import java.math.BigInteger;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ClassServiceTest {

    @Autowired
    private ClassService classService;

    @Test
    public void testfindClassByCourseId() {
        try {
            System.out.println(classService.listClassByCourseId(new BigInteger("1")).toString());
        }catch (CourseNotFoundException e){

        }
    }
    @Test
    public void testgetClassByClassId(){

        try {
            System.out.println(classService.getClassByClassId(new BigInteger("1")).toString());
        }catch (ClassesNotFoundException e){

        }
    }

    @Test
    public void testupdateClassByClassId(){
        ClassInfo newClass = new ClassInfo();
        BigInteger b = new BigInteger("3");
        newClass.setName("hx");
        newClass.setCourse(null);
        newClass.setDescription("nope");
        newClass.setSite("no where");
        newClass.setClassTime("buzhidao");
        newClass.setReportPercentage(50);
        newClass.setPresentationPercentage(50);
        newClass.setFivePointPercentage(20);
        newClass.setFourPointPercentage(30);
        newClass.setThreePointPercentage(50);
        try {
            classService.updateClassByClassId(b,newClass);
        }catch (ClassesNotFoundException e){

        }
    }

    @Test
    public void testdeleteClassByClassId(){
        try {
            classService.deleteClassByClassId(new BigInteger("3"));
        }catch (ClassesNotFoundException e){

        }
    }

    @Test
    public void testinsertCourseSelectionById(){

        try {
            System.out.println(classService.insertCourseSelectionById(new BigInteger("18"),new BigInteger("2")));
        }catch (UserNotFoundException e){
            System.out.println("User");
        }catch (ClassesNotFoundException e){
            System.out.println("Class");
        }
    }

    @Test
    public void testdeleteCourseSelectionById(){
        try {
            classService.deleteCourseSelectionById(new BigInteger("18"),new BigInteger("2"));
        }catch (UserNotFoundException e){
            System.out.println("User");
        }catch (ClassesNotFoundException e){
            System.out.println("Class");
        }
    }

    @Test
    public void testgetCallStatusById(){
        try {
            System.out.println(classService.getCallStatusById(new BigInteger("1"),new BigInteger("1")).toString());
        }catch (SeminarNotFoundException e){

        }
    }

}
