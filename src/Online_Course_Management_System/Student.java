package Online_Course_Management_System;

public class Student {

	private String StudentId;
	private String name;
	private int contact;
	private String password;
	 private String type;
	 /**
 	 * @param contact
 	 * @param password
 	 * @param type
	 * @param name 
 	 */
	 public Student( String StudentId ,String name,int contact, String password, String type) {
		super();
		this.StudentId=StudentId;
		this.name = name;
		this.contact = contact;
		this.password = password;
		this.type = type;
	 }
	 
	 public String getName() {
		 return name;
	 }
	 public int getContact() {
		 return contact;
	 }
	 public String getPassword() {
		 return password;
	 }
	 public String getType() {
		 return type;
	 }

	 public String getStudentId() {
		return StudentId;
	 }

	 public static void add(Student obj)

	 

}
