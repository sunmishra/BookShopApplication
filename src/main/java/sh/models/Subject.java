package sh.models;

public class Subject {
	private String subject;//field name should match the path provided in the subject.jsp
	public Subject() {
	}
	public Subject(String subject) {
		this.subject = subject;//this will give represent the default selected data in the view
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	@Override
	public String toString() {
		return "Subject [subject=" + subject + "]";
	}
}
