package Research;

import java.util.Date;

public class ResearchPaper {
	private String topic;
	private Date date;
	private int pages;
	private String publisher;
	private String citations;
	private String references;
	private String authors;
	
	public ResearchPaper(String topic, Date date, int pages, String publisher, String citations, String references,
			String authors) {
		super();
		this.topic = topic;
		this.date = date;
		this.pages = pages;
		this.publisher = publisher;
		this.citations = citations;
		this.references = references;
		this.authors = authors;
	}
	
	public String getCitation() {
		return getTopic() + " | " + getDate() + " | " + getPages() + " | " + getPublisher();
	}
	
	public String toString() {
		return getCitation();
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getCitations() {
		return citations;
	}

	public void setCitations(String citations) {
		this.citations = citations;
	}

	public String getReferences() {
		return references;
	}

	public void setReferences(String references) {
		this.references = references;
	}

	public String getAuthors() {
		return authors;
	}

	public void setAuthors(String authors) {
		this.authors = authors;
	}
}
