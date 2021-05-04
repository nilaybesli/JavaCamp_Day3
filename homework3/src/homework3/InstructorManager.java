package homework3;

public class InstructorManager extends UserManager {
		String lessonName;
		String numberOfLessons;
	
			public String getLessonName() {
			return lessonName;
		}

		public void setLessonName(String lessonName) {
			this.lessonName = lessonName;
		}

		public String getNumberOfLessons() {
			return numberOfLessons;
		}

		public void setNumberOfLessons(String numberOfLessons) {
			this.numberOfLessons = numberOfLessons;
		}

			public void addLesson(Instructor instructor) {
				System.out.println("Ders adý : "+ lessonName);
				System.out.println("Eðitmen adý : " + instructor.firstName + " " + instructor.lastName );
				System.out.println("Yapýlacak ders sayýsý : " +numberOfLessons);
			}
}
