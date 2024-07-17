package com.project.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.project.entity.Department;
import com.project.entity.Faculty;
@Repository
public class DepartmentDao {
	@Autowired
	SessionFactory factory;
	public List<Department> getAllDepartmentlist() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Department.class);
		List<Department> dlist = criteria.list();
		
		return dlist;
	}

	public void insertvalue(Department dept) {
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(dept);
		tx.commit();		
	
	}

	public void updatevalue(Department dept) {
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.update(dept);
		tx.commit();		
	
	}

	public void deletevalue(Integer id) {
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		Department c = session.load(Department.class, id);
		session.delete(c);
		//session.delete(id);
		tx.commit();		
	
	}


}
