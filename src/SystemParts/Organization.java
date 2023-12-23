package SystemParts;

import java.util.Vector;

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
}
