package xmu.crms.controller;

import java.util.ArrayList;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import xmu.crms.pojo.School;

@RestController
//@RequestMapping("/api/school")
@RequestMapping("/school")
public class SchoolController {
	@RequestMapping(method = RequestMethod.GET)
	public ArrayList<School> selectSchoolByCity(@RequestParam String city){
		ArrayList<School> list = new ArrayList<School>();
		School s1 = new School();
		School s2 = new School();
		s1.setName("厦门大学");
		s1.setProvince("福建");
		s1.setCity("厦门");
		s2.setName("厦门软件学院");
		s2.setProvince("福建");
		s2.setCity("厦门");
		list.add(s1);
		list.add(s2);
		return list;
	}
	
	@RequestMapping(method = RequestMethod.POST)
	@ResponseStatus(value = HttpStatus.CREATED)
	public int addSchool(@RequestBody School school){
		int id = 38;
		return id;
		
	}
	
	@RequestMapping(value = "/province",method = RequestMethod.GET)
	public ArrayList<String> selectAllProvince(){
		ArrayList<String> list = new ArrayList<String>();
		list.add("北京");
		list.add("天津");
		list.add("河北省");
		list.add("……");
		list.add("澳门特别行政区");
		return list;
	}
	
	@RequestMapping(value = "/city",method = RequestMethod.GET)
	public ArrayList<String> selectAllCity(@RequestParam("province") String province){
		ArrayList<String> list = new ArrayList<String>();
		list.add("福州");
		list.add("厦门");
		list.add("漳州");
		list.add("泉州");
		return list;
	}
}
