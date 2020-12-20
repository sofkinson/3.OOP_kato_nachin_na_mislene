package tretoPaketche;

public class Course {
	private String courseName;
	private String[] students = new String[100];
	private int numberOfStudents = 0;
	
	public Course(String courseName) {
		this.courseName = courseName;
	}
	
	public void addStudent(String student) {
		students[numberOfStudents] = student;
		numberOfStudents++;
	}
	
	public void dropStudent(String student) {
		for(int i = 0; i < numberOfStudents; i++) {
			if(students[i].equals(student)) {
				for(int j = i; j < numberOfStudents - 1; j++) {
					students[j] = students[j + 1];
				}
				
				students[numberOfStudents - 1] = null;
				numberOfStudents--;
				break;
			}
		}
	}
	
	public String getCourseName() {
		return courseName;
	}
	
	public String[] getStudents() {
		return students;
	}
	
	public int getNumberOfStudents() {
		return numberOfStudents;
	}

}
