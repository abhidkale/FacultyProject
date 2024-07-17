package com.project.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.entity.Course;
import com.project.entity.Classroom;
import com.project.entity.Course;
import com.project.service.CourseService;
@Repository
public class CourseDao {
	@Autowired
	SessionFactory factory;

		public List<Course> allstaff() {
			Session session = factory.openSession();
			
			Criteria criteria = session.createCriteria(Course.class);
			List<Course> clist = criteria.list();
			
			return clist;
		}


		public void getAllCourses(Course course) {
			
			Session session = factory.openSession();
			Transaction tx = session.beginTransaction();
			session.save(course);
			tx.commit();		

			
		}

		public void insertvalue(Course course) {
			Session session = factory.openSession();
			Transaction tx = session.beginTransaction();
			session.save(course);
			tx.commit();		
		
			
		}

		public void updatevalue(Course course) {
			Session session = factory.openSession();
			Transaction tx = session.beginTransaction();
			session.update(course);
			tx.commit();		
		
		}

		public void deletevalue(Integer id) {
			Session session = factory.openSession();
			Transaction tx = session.beginTransaction();
			Course c = session.load(Course.class, id);
			session.delete(c);
			//session.delete(id);
			tx.commit();		
		
		}


		public ArrayList<Course> getAllCoursesNames() {
			ArrayList<Course> clist = new ArrayList<Course>();
			clist.add(new Course(1,"java"));
			clist.add(new Course(2,"python"));
			clist.add(new Course(3,"React"));
			clist.add(new Course(4,"ruby"));
			clist.add(new Course(5,"html"));
			
			return clist;
		}



		
		
	}


