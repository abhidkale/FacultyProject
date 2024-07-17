package com.project.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.entity.Faculty;
@Repository

public class FacultyDao {

	@Autowired
	SessionFactory factory;
	public List<Faculty> getAllFacultylist() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Faculty.class);
		List<Faculty> flist = criteria.list();
		
		return flist;
	}

	public void insertvalue(Faculty faculty) {
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(faculty);
		tx.commit();		
	
	}

	public void updatevalue(Faculty faculty) {
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.update(faculty);
		tx.commit();		
	
	}

	public void deletevalue(Integer id) {
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		Faculty c = session.load(Faculty.class, id);
		session.delete(c);
		tx.commit();		
	
	}

}
