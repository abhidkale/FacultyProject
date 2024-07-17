package com.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.entity.Faculty;
import com.project.service.FacultyService;

@RestController
@RequestMapping
public class FacultyController {
	
	  @Autowired
	    FacultyService service;
	    
	    @GetMapping("/getAllFacultyList")
	    
		public List<Faculty> getAllFacultylist()
		{
			      List <Faculty> flist = service.getAllFacultylist();
			
			return flist;
		}

	    @PostMapping("/insertfaculty")
		public void insertvalue(@RequestBody Faculty faculty)
		{
			service.insertvalue(faculty);
		}
	    
	    @PutMapping("updatefaculty")
		public void updatevalue(@RequestBody Faculty faculty)
		{
		service.updatevalue(faculty);
		}

	   
	    @DeleteMapping("deletefaculty/{id}")
		public void deletevalue(@PathVariable Integer id)
		{
			service.deletevalue(id);
		}
	}







