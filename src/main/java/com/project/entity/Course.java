package com.project.entity;


	import javax.persistence.*;

	//import lombok.Data;
	//import lombok.NoArgsConstructor;

	@Entity
	@Table(name = "courses")
	public class Course {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int id;

	    @Column(nullable = false)
	    private String name;

		public Course() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Course(int id, String name) {
			super();
			this.id = id;
			this.name = name;
		}

		@Override
		public String toString() {
			return "Course [id=" + id + ", name=" + name + "]";
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
	    
	    

	  
	}




