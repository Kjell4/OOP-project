package SystemParts;

import java.util.Vector;


import Users.Student;
public class Organization {
	private String name;
	private String head;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHead() {
		return head;
	}
	public void setHead(String head) {
		this.head = head;
	}
	public static Vector<Student> getMember() {
		return member;
	}
	public static void setMember(Vector<Student> member) {
		Organization.member = member;
	}
	private static Vector<Student> member = new Vector<Student>();

	public void addMember(Student student) {
		if (!member.contains(student)) {
			member.add(student);
		}
	}

	public void removeMember(Student student) {
		member.remove(student);
	}
	public boolean hasMember(Student student) {
		return member.contains(student);
	}

	public int getMemberCount() {
		return member.size();
	}

	public Vector<String> getMemberNames() {
		Vector<String> memberNames = new Vector<>();
		for (Student student : member) {
			memberNames.add(student.getName() + " " + student.getSurname());
		}
		return memberNames;
	}
}
