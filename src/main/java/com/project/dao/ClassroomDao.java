package com.project.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.project.service.ClassroomService;

import com.project.entity.Classroom;

@Repository
public class ClassroomDao {
	
	@Autowired
	SessionFactory factory;

	public List<Classroom> allstaff() {
		Session session = factory.openSession();
		
		Criteria criteria = session.createCriteria(Classroom.class);
		List<Classroom> faclist = criteria.list();
		
		return faclist;
	}
	
	public void insertvalue(Classroom staff) {
		// TODO Auto-generated method stub
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(staff);
		tx.commit();		
	}
	
	public void updatevalue(Classroom staff) {
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.update(staff);
		tx.commit();	
	}

	public void deletevalue(Integer id) {
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		Classroom c = session.load(Classroom.class, id);
		session.delete(c);
		tx.commit();	

		
	}
	
	
}