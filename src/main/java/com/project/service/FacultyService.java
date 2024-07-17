package com.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dao.FacultyDao;
import com.project.entity.Faculty;

@Service
public class FacultyService {
	@Autowired
	FacultyDao dao;
	

	public List<Faculty> getAllFacultylist() {
			List<Faculty> flist = dao.getAllFacultylist();
			
			return flist;
		}


	public void insertvalue(Faculty faculty) {
			dao.insertvalue(faculty);
		
	}


	public void updatevalue(Faculty faculty) {

				dao.updatevalue(faculty);

	}


	public void deletevalue(Integer id) {
			dao.deletevalue(id);

	}


	}
