package Users;

import java.util.Date;
import java.util.Vector;
import Research.ResearchPaper;
import Research.ResearchProject;

public class Researcher extends User{

	public Researcher(String login, String password, String name, String surname, String id) {
		super(login, password, name, surname, id);
	}
	
	public String toString() {
		return super.toString();
	}
	
	public boolean equals(Object o) {
	        if(!super.equals(o)) return false;
	     
	        Researcher r = (Researcher)o;
	        return this.getLogin().equals(r.getLogin()) && this.getPassword().equals(r.getPassword());
	}
	 
	Vector<ResearchPaper> papers = new Vector<>();
	Vector<ResearchProject> projects = new Vector<>();
	 
	public Vector<ResearchPaper> makeResearchPaper(String topic, Date date, int pages, String publisher, String citations, String references, String authors) {
		 ResearchPaper paper = new ResearchPaper(topic, date, pages, publisher, citations, references,authors);
		 papers.add(paper);
		 return papers;
	}
	 
	public void printPapers() {
		System.out.println(papers);
	}
	 
	 
	
}
