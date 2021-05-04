package homework3;

public class Main {

	public static void main(String[] args) {
        UserManager userManager = new UserManager();
        userManager.logIn();
        
        
        	
		Student student = new Student();
		
		 	student.setFirstName("Nilay");
	        student.setLastName("Besli");
	        student.setId("1234");
	        student.setEmail("nil.besli@gmail.com");
	        
	        
	        
	        Instructor instructor= new Instructor();
	        instructor.setFirstName("Engin");
	        instructor.setLastName("Demirog");
	        instructor.setId("4567");
	        instructor.setEmail("engin123@gmail.com");
	        
	        InstructorManager instructorManager = new InstructorManager();
	        instructorManager.setLessonName("Yazılım Geliştirici Yetiştirme Kampı ");
	        instructorManager.setNumberOfLessons("16");
	        
	        instructorManager.addLesson(instructor);
	        
	        StudentManager studentManager = new StudentManager();
	        studentManager.registerLesson(instructorManager,student);
	        studentManager.deleteStudent(student);
	        
	        
	        userManager.logOut();
	}

}
