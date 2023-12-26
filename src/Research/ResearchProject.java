package Research;

import java.io.Serializable;
import java.util.Vector;
import Users.Researcher;
import Users.User;
import Exceptions.ImposterException;

public class ResearchProject implements Serializable{
	private String topic;
	
	Vector<ResearchPaper> papers = new Vector<>();
	
	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}
}
