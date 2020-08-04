package studentdemos;


public class StudentMain {
	private Map<String, Student> store=new HashMap<>();
	

	public static void main(String[] args) {
	 StudentMain demo=new StudentMain();
	 demo.runApp();	
	}
		
	public void runApp() {
		try {
		Course course1=new Course(1,"java");
	    Course course2=new Course(2,"python");		
		ElectronicsStudent student1 = new ElectronicsStudent("ankit", 21, true, "multimeter");
		student1.setCourse(course1);
		ComputerScienceStudent student2 = new ComputerScienceStudent("balakrishna", 21, true, "dell");
		student2.setCourse(course2);
		ComputerScienceStudent student3 = new ComputerScienceStudent("prasanna", 22, true, "asus");
		student3.setCourse(course1);
		ElectronicsStudent student4 = new ElectronicsStudent("saiteja", 22, true, "diode");
        student4.setCourse(course2);
		store.put(student1.getName(), student1);
		store.put(student2.getName(), student2);
		store.put(student3.getName(),student3);
		store.put(student4.getName(), student4);
		
		
		displayAll();
		}
		catch(InvalidStudentArgumentException e) {
			System.out.println("student is null");
		}
		catch(Exception e) {
		  System.out.println("some error occurred in program");	
		}
		
	}
	
	
	
	public void displayAll() {
		Set<String>keys=store.keySet();
		for (String key:keys) {
			Student current=store.get(key);
			boolean isCSGuy = current instanceof ComputerScienceStudent;
			if (isCSGuy) {
				ComputerScienceStudent cs = (ComputerScienceStudent) current;
			    display(cs);  
			}

			boolean isECEGuy = current instanceof ElectronicsStudent;
			if (isECEGuy) {
				ElectronicsStudent es = (ElectronicsStudent) current;
		        display(es);
			}
			
		}
		
	}
	
	
	public void checkNull(Student student) {
		if(student==null) {
			InvalidStudentArgumentException exception=new InvalidStudentArgumentException("null argument");
		    throw exception;	
		}
	}
	
	
	public void displayStudent(Student student) {
	    checkNull(student);
		String name = student.getName();
		int age = student.getAge();
		boolean placed=student.getPlaced();
    	System.out.println("name is " + name + " age is " + age + " is placed " + placed);
		Course course=student.getCourse();
		System.out.println("student pursuing course="+course.getId()+" "+course.getName());
	}
	
	public void display(ElectronicsStudent student) {
		checkNull(student);
		displayStudent(student);
		System.out.println("gadget available=" + student.getGadgetAlloted());
		
	}
	
	public void display(ComputerScienceStudent student) {		
		checkNull(student);
		displayStudent(student);
		System.out.println("laptop available=" + student.getLaptopAlloted());
		
	}

}