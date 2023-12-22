package Comparators;
import java.util.Comparator;

import Research.ResearchPaper;

public class ArticleLengthComparator implements Comparator<ResearchPaper>{

	public int compare(ResearchPaper r1, ResearchPaper r2) {
        return r1.compareTo(r2);
    }
	
}
