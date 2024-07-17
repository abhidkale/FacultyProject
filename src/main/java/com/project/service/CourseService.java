package com.project.service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.project.entity.Course;
import com.project.entity.Course;
import com.project.dao.CourseDao;
import com.project.entity.Classroom;
import com.project.entity.Course;
@Component
@Service
public class CourseService {
	@Autowired

	CourseDao dao;

	public List<Course> getAllCourseNames()
	{
		//dao = new FacultyDao();
	
		List<Course> clist = dao.getAllCoursesNames();
		
		
		return clist;
	}

	public int fetchspecificid() 
	{
		List<Course> specificid= dao.getAllCoursesNames();
		for(Course staff:specificid)
		{
			specificid.add(staff);
		}
		return specificid.size();
	}
	public void insertvalue(Course course) {
		dao.insertvalue(course);
			
	}

	public void updatevalue(Course course) {
		// TODO Auto-generated method stub
		dao.updatevalue(course);
		
	}

	public void deletevalue(Integer id) {
		// TODO Auto-generated method stub
		dao.deletevalue(id);
	}


	
		
}
