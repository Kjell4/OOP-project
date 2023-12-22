package Users;

import java.util.Collections;
import java.util.Date;
import Research.ResearchPaper;
import Research.ResearchProject;
import Comparators.ArticleLengthComparator;
import Comparators.PublishedDateComparator;
import Database.Data;
import Exceptions.NoSuchFormatException;

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
	 
	Data database = new Data();
	 
	public void makeResearchPaper(String topic, Date date, int pages, String publisher, String authors) {
		 ResearchPaper paper = new ResearchPaper(topic, date, pages, publisher, authors);
		 database.papers.add(paper);
	}
	 
	public void printPapersByArticleLength() {
		ArticleLengthComparator c = new ArticleLengthComparator();
		Collections.sort(database.papers, c);
		System.out.println(database.papers);
	} 
	
	public void printPapersByPublishedDate() {
		PublishedDateComparator c = new PublishedDateComparator();
		Collections.sort(database.papers, c);
		System.out.println(database.papers);
	}
	
	public void getCitation(int num, String format) {
		try {
			if(format.equalsIgnoreCase("PlainText")) {
				System.out.println(database.papers.elementAt(num).getTopic() + " | " + database.papers.elementAt(num).getDate() + " | " + database.papers.elementAt(num).getPages() + " | " + database.papers.elementAt(num).getPublisher());
			}
			else if(format.equalsIgnoreCase("Bibtex")) {
				System.out.println("{\n  authors = {" + database.papers.elementAt(num).getAuthors() + "},\n"
	                + "  topic = {" + database.papers.elementAt(num).getTopic() + "},\n"
	                + "  date = {" + database.papers.elementAt(num).getDate() + "}\n"
	                + "}");
			}
			else {
				NoSuchFormatException.invalidFormat();
			}
		}
		catch(NoSuchFormatException e){
			System.out.println(e.getMessage());
		}
	}
	
}
