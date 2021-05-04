package homework3;

public class StudentManager extends UserManager {
		
		public void registerLesson(InstructorManager instructorManager,Student student) {
	        System.out.println("-----------------------------\n");
			System.out.println("Sayin "+student.getFirstName() + " " + student.getLastName() + " " + instructorManager.lessonName +"Kursuna basariyla kayit oldunuz");
	        System.out.println("-----------------------------\n");

		}
	
		public void deleteStudent(Student student) {
			
			System.out.println(student.getFirstName() + " " + student.getLastName() + " isimli ogrenci sistemden silinmistir...");
	        System.out.println("-----------------------------\n");

		}
}
