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

import com.project.entity.Department;
import com.project.service.DepartmentService;
@RestController
@RequestMapping

public class DepartmentController {
	
	    @Autowired
	    DepartmentService service;
	    
	    @GetMapping("/getAlldeptList")
	    
		public List<Department> getAllDepartmentlist()
		{
			      List <Department> dlist = service.getAllDepartmentlist();
			
			return dlist;
		}

	    @PostMapping("/insertdept")
		public void insertvalue(@RequestBody Department dept)
		{
			service.insertvalue(dept);
		}
	    
	    @PutMapping("updatedept")
		public void updatevalue(@RequestBody Department dept)
		{
		service.updatevalue(dept);
		}

	   
	    @DeleteMapping("deletedept/{id}")
		public void deletevalue(@PathVariable Integer id)
		{
			service.deletevalue(id);
		}
	}






