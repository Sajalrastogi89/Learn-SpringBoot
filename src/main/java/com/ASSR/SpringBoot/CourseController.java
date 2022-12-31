package com.ASSR.SpringBoot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

	@RequestMapping("/courses")
	public List<Course> course(){
		return Arrays.asList(
				new Course(1,"JAVA","Sajal Rastogi "),
				new Course(2,"MicroServices","Sajal Rastogi"),
				new Course(3,"Spring Cloud","Sajal Rastogi"),
				new Course(4,"Full Stack","Sajal Rastogi"),
				new Course(5,"Spring Security","Sajal Rastogi"),
				new Course(5,"Spring Security","Sajal Rastogi")
				);
	}
	
	
	
}
