package Online_Course_Management_System;

public class instructor {

	private String instructorId;
	private String instructorname;
	private String instructornumber;
	private Student student;
	private Course Course;
	/**
	 * @param instructorId
	 * @param instructorname
	 * @param instructornumber
	 * @param student
	 * @param course
	 */
	public instructor(String instructorId, String instructorname, String instructornumber, Student student,
			Online_Course_Management_System.Course course) {
		super();
		this.instructorId = instructorId;
		this.instructorname = instructorname;
		this.instructornumber = instructornumber;
		this.student = student;
		Course = course;
	}
	
	public String getInstructorId() {
		return instructorId;
	}
	public String getInstructorname() {
		return instructorname;
	}
	public String getInstructornumber() {
		return instructornumber;
	}
	public Student getStudent() {
		return student;
	}
	public Course getCourse() {
		return Course;
	}
	
}
