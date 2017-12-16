package xmu.crms.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import xmu.crms.pojo.School;
import xmu.crms.pojo.User;

@RestController
//@RequestMapping("/api/me")
@RequestMapping("/me")
public class MyController {
	/* 获取用户信息 */
	@RequestMapping(method = RequestMethod.GET)
	public User Get() {
		User user = new User();
		user.setId(3486);
		user.setType("student");
		user.setName("张三");
		user.setNumber("23320152202333");
		user.setPhone("18911114514");
		user.setEmail("");
		user.setGender("male");
		user.setTitle("");
		School school = new School();
		school.setId(32);
		school.setName("厦门大学");
		user.setSchool(school);
		user.setAvatar("/avatar/3486.png");
		return user;
	}

	@RequestMapping(method = RequestMethod.PUT)
	@ResponseStatus(value = HttpStatus.NO_CONTENT)
	public void updateMe(@RequestBody User user) {
		System.out.println("被访问到1111111111111");
	}

}
