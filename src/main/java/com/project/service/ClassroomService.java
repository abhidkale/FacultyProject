package com.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import com.project.dao.ClassroomDao;
import com.project.entity.Classroom;
@Component
@Service
public class ClassroomService {

	@Autowired
	ClassroomDao dao;
	public void insertvalue(Classroom staff) 
	{
		dao.insertvalue(staff);
	}
	public void updatevalue(Classroom staff) {
		dao.updatevalue(staff);
	}
	public void deletevalue(Integer id) {
		dao.deletevalue(id);
		
	}

}
