package com.ASSR.SpringBoot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

	
	public List<Course> course(){
		return Arrays.asList(
				new Course(1,"JAVA","Sajal Rastogi"),
				new Course(2,"MicroServices","Sajal Rastogi")
				);
	}
	
	
	
}
