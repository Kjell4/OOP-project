package Research;

import java.util.Vector;
import Users.Researcher;

public class ResearchProject {
	private String topic;
	
	Vector<ResearchPaper> papers = new Vector<>();
	Vector<Researcher> participants = new Vector<>();
	
	public void joinParticipant(Researcher r) {
		participants.add(r);
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}
}
