package studentdemo;

import java.util.*;


public class Student {
	
	
	private String Rollno;
	
	private int Age;
	
	
	public Student(String rollno,int age){
		this.Rollno=rollno;
		this.Age=age;
		
	}
	

	public String getRoll() {
		return Rollno;
	}

	public void setRoll(String roll) {
		this.Rollno = roll;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		this.Age = age;
	}
	
	
	public int hashcode() {
		return Age;
		
	}
	
	public boolean equals(Student arg) {
		if(this==arg) {
			return true;
		}
		if(arg==null || !(arg instance of Student)) {
			return false;
			
		}
		
		Student that=(Student)arg;
		boolean isequal=this.Rollno==that.Rollno;
		return isequal;
		
			
	}
	


	
	
	
	
	
	

}
