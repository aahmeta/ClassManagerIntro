package classManagerIntro;

public class CourseManager {
	
	public void addToCard(Course course) {
		System.out.println(course.courseName + " Kursuna kay�t olundu.");
	}
	
	public void detail(Course course) {
		System.out.println("Kurs detaylar� : " + course.courseDetail);
		
	}
}
