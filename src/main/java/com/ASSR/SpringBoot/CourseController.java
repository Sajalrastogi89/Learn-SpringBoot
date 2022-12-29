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
				new Course(1,"JAVA","Sajal Rastogi ASSR hello world"),
				new Course(2,"MicroServices","Sajal Rastogi")
				);
	}
	
	
	
}
