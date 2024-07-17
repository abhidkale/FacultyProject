package com.project.controller;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.entity.Course;
import com.project.entity.Classroom;
import com.project.entity.Course;
import com.project.service.CourseService;


@RestController
@RequestMapping

public class CourseController {

	    @Autowired
	    CourseService service;
	    
	    @GetMapping("/getAllList")
	    
		public List<Course> getAllCourseNames()
		{
			//service = new FacultyService();
	    	      List <Course> clist = service.getAllCourseNames();
			
			return clist;
		}

	    @PostMapping("/insertcourse")
		public void insertvalue(@RequestBody Course course)
		{
			service.insertvalue(course);
		}
	    
	    @PutMapping("updatecourse")
		public void updatevalue(@RequestBody Course course)
		{
		service.updatevalue(course);
		}

	   
	    @DeleteMapping("deletecourse/{id}")
		public void deletevalue(@PathVariable Integer id)
		{
			service.deletevalue(id);
		}
	}



