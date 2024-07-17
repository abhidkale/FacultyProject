package com.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.project.dao.DepartmentDao;
import com.project.entity.Department;
@Component
@Service

public class DepartmentService {
	@Autowired
	DepartmentDao dao;
	public List<Department> getAllDepartmentlist() {
		List<Department> dlist = dao.getAllDepartmentlist();
		
		return dlist;
	}

	public void insertvalue(Department dept) {
		dao.insertvalue(dept);
	}

	
	public void deletevalue(Integer id) {

		dao.deletevalue(id);
		
	}

	public void updatevalue(Department dept) {
		// TODO Auto-generated method stub
		dao.updatevalue(dept);

	}

}
