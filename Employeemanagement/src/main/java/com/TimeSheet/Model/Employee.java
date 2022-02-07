package com.TimeSheet.Model;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="employee")
public class Employee {
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		//@Size(max=10,message="enter id upto size 10")
		private int emp_id;
		@Column(name="emp_name",nullable=false)
       @NotEmpty
		@Size(max=20,message="User name have atleast twocharacter upto 20 character")
		private String emp_name;
		
		
		public Employee() {
			
		}
		@NotEmpty
		
		 @Size(max=10,
		  message="employee desc_id have atleast twocharacter upto 10 character")
		 private String emp_designation_id;
		//@NotEmpty
	
		private Date emp_join_date;
		
		
		
		
		
		
		 @NotEmpty
		
		 @Size(max=20,message="User name have atleast twocharacter upto 20 character")
		 private String emp_skills;
		
		  @NotEmpty
		 
		  @Size(max=20,
		 message="deptment name have atleast twocharacter upto 20 character")
		 private String emp_department;
		
		  @NotEmpty
		  
		 @Size(max=50,message="emp notes  upto 50 character")
		 private String emp_notes;
		
		  @NotEmpty
		  
		 @Size(max=20,message="emp email  upto 20 character")
		 private String emp_email;

		  @NotEmpty
		  
		 @Size(max=20,message="emp_phone  upto 20 character")
		private String emp_phones;

		  @NotEmpty
		  
		 @Size(max=20,message="emp_username  upto 20 character") 
		private String emp_username;

		  @NotEmpty
		  
		 @Size(max=20,message="emp_password upto 20 character")
		private String emp_password;
		
		  
		  
		 
		public Employee(int emp_id,
				@NotEmpty @Size(max = 20, message = "User name have atleast twocharacter upto 20 character") String emp_name,
				@NotEmpty @Size(max = 10, message = "employee desc_id have atleast twocharacter upto 10 character") String emp_designation_id,
				@NotEmpty @Size(max = 20, message = "User name have atleast twocharacter upto 20 character") String emp_skills,
				@NotEmpty @Size(max = 20, message = "deptment name have atleast twocharacter upto 20 character") String emp_department,
				@NotEmpty @Size(max = 50, message = "emp notes  upto 50 character") String emp_notes,
				@NotEmpty @Size(max = 20, message = "emp email  upto 20 character") String emp_email,
				@NotEmpty @Size(max = 20, message = "emp_phone  upto 20 character") String emp_phones,
				@NotEmpty @Size(max = 20, message = "emp_username  upto 20 character") String emp_username,
				@NotEmpty @Size(max = 20, message = "emp_password upto 20 character") String emp_password) {
			super();
			this.emp_id = emp_id;
			this.emp_name = emp_name;
			this.emp_designation_id = emp_designation_id;
			this.emp_join_date = emp_join_date;
			this.emp_skills = emp_skills;
			this.emp_department = emp_department;
			this.emp_notes = emp_notes;
			this.emp_email = emp_email;
			this.emp_phones = emp_phones;
			this.emp_username = emp_username;
			this.emp_password = emp_password;
		}
		public int getEmp_id() {
			return emp_id;
		}
		public void setEmp_id(int emp_id) {
			this.emp_id = emp_id;
		}

		
		/*
		 * public Timesheet getTimesheet() { return timesheet; } public void
		 * setTimesheet(Timesheet timesheet) { this.timesheet = timesheet; }
		 */
		 
		public String getEmp_name() {
			return emp_name;
		}
		public void setEmp_name(String emp_name) {
			this.emp_name = emp_name;
		}
		public String getEmp_designation_id() {
			return emp_designation_id;
		}
		public void setEmp_designation_id(String emp_designation_id) {
			this.emp_designation_id = emp_designation_id;
		}
		public Date getEmp_join_date() {
			return emp_join_date;
		}
		public void setEmp_join_date(Date emp_join_date) {
			this.emp_join_date = emp_join_date;
		}
		public String getEmp_skills() {
			return emp_skills;
		}
		public void setEmp_skills(String emp_skills) {
			this.emp_skills = emp_skills;
		}
		public String getEmp_department() {
			return emp_department;
		}
		public void setEmp_department(String emp_department) {
			this.emp_department = emp_department;
		}
		public String getEmp_notes() {
			return emp_notes;
		}
		public void setEmp_notes(String emp_notes) {
			this.emp_notes = emp_notes;
		}
		public String getEmp_email() {
			return emp_email;
		}
		public void setEmp_email(String emp_email) {
			this.emp_email = emp_email;
		}
		public String getEmp_phones() {
			return emp_phones;
		}
		public void setEmp_phones(String emp_phones) {
			this.emp_phones = emp_phones;
		}
		public String getEmp_username() {
			return emp_username;
		}
		public void setEmp_username(String emp_username) {
			this.emp_username = emp_username;
		}
		public String getEmp_password() {
			return emp_password;
		}
		public void setEmp_password(String emp_password) {
			this.emp_password = emp_password;
		}
		@Override
		public String toString() {
			return "Employee [emp_id=" + emp_id + ", emp_name=" + emp_name + ", emp_designation_id="
					+ emp_designation_id + ", emp_join_date=" + emp_join_date + ", emp_skills=" + emp_skills
					+ ", emp_department=" + emp_department + ", emp_notes=" + emp_notes + ", emp_email=" + emp_email
					+ ", emp_phones=" + emp_phones + ", emp_username=" + emp_username + ", emp_password=" + emp_password
					+ "]";
		}
		
}
