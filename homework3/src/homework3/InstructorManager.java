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
				System.out.println("Ders ad� : "+ lessonName);
				System.out.println("E�itmen ad� : " + instructor.firstName + " " + instructor.lastName );
				System.out.println("Yap�lacak ders say�s� : " +numberOfLessons);
			}
}
