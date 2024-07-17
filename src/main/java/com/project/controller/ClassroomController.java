package com.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.project.entity.Classroom;
import com.project.service.ClassroomService;

@RestController
@RequestMapping
public class ClassroomController {

	@Autowired
	ClassroomService service;
	
	@PostMapping("/insertclassroom")
	public void insertvalue(@RequestBody Classroom staff)
	{
		service.insertvalue(staff);
	}
	@PutMapping("updateclassroom")
	public void updatevalue(@RequestBody Classroom staff)
	{
	service.updatevalue(staff);
	}
	@DeleteMapping("deleteclassroom/{id}")
	public void deletevalue(@PathVariable Integer id)
	{
		service.deletevalue(id);
	}
}
