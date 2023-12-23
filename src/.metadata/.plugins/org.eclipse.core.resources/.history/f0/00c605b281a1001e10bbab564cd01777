package SystemParts;

import java.io.Serializable;
import java.util.Objects;

import Enums.AttestationType;

public class Mark implements Serializable{
	private double firstAttestation;
	private double secondAttestation;
	private double examMark;
//	private double finalExamMark;
	private int digitMark;
	private String iteralMark;
	private AttestationType type;
	private double gpa;
	
	
	public double getGpa() {
		return gpa;
	}



	public void setGpa(double gpa) {
		this.gpa = gpa;
	}



	public void setType(AttestationType type) {
		this.type = type;
	}



	public Mark(double firstAttestation, double secondAttestation, double examMark, int digitMark, String iteralMark,AttestationType type) {
		super();
		this.firstAttestation = firstAttestation;
		this.secondAttestation = secondAttestation;
		this.examMark = examMark;
		this.digitMark = digitMark;
		this.iteralMark = iteralMark;
		this.type = type;
	}
	
	
	
	public Mark() {
		this.firstAttestation = 0;
		this.secondAttestation = 0;
		this.examMark = 0;
	}
	
	public Mark(double currentMark, AttestationType type) {
		if (this.type == AttestationType.FIRST)
			this.firstAttestation = currentMark;
		else if (this.type == AttestationType.SECOND)
			this.secondAttestation = currentMark;
		else
			this.examMark = currentMark;
	}
	
	
	public double getFirstAttestation() {
		return firstAttestation;
	}
	public void setFirstAttestation(double firstAttestation) {
		this.firstAttestation = firstAttestation;
	}
	public double getSecondAttestation() {
		return secondAttestation;
	}
	public void setSecondAttestation(double secondAttestation) {
		this.secondAttestation = secondAttestation;
	}
	public double getExamMark() {
		return examMark;
	}
	public void setExamMark(double examMark) {
		this.examMark = examMark;
	}
	public int getDigitMark() {
		return digitMark;
	}
	public void setDigitMark(int digitMark) {
		this.digitMark = digitMark;
	}
	public String getIteralMark() {
		return iteralMark;
	}
	public void setIteralMark(String iteralMark) {
		this.iteralMark = iteralMark;
	}
	
	public AttestationType getType() {
		return type;
	}
	public void setPeriod(AttestationType type) {
		this.type = type;
	}
	
	
	
	public void defineMark(double currentMark) {
		if (this.type == AttestationType.FIRST) {
			this.setFirstAttestation(this.getFirstAttestation() + currentMark);
			if (this.getFirstAttestation() > 30) this.setFirstAttestation(30);
		}
		else if (this.type == AttestationType.SECOND) {
			this.setSecondAttestation(getSecondAttestation() + currentMark);
			if (this.getSecondAttestation() > 30) this.setSecondAttestation(30);
		}
		else this.setExamMark(currentMark);
	}
	
	public double addGrade() {
    	return this.getFirstAttestation()+this.getSecondAttestation()+this.getExamMark();
    } 
	
	public void transformMark() {
	    String[] letters = {"A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D+", "D"};
	    double[] gpa = {4.0, 3.67, 3.33, 3.0, 2.67, 2.33, 2.0, 1.67, 1.33, 1.0};
	    int[] scores = {95, 90, 85, 80, 75, 70, 65, 60, 55, 50};
	    
	    String iteral = "F"; 
	    double gpaCnt = 0.0;
	    
	    for (int i = 0; i < scores.length; i++) {
	        if (addGrade() >= scores[i]) {
	            iteral = letters[i];
	            gpaCnt = gpa[i];
	            break;
	        }
	    }
        this.iteralMark = iteral; 
        this.gpa = gpaCnt; 
	}
	
	
//	public String defineIteralMark() {
//	    String[] letterMarks = {"A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D+", "D"};
//	    int[] points = {95, 90, 85, 80, 75, 70, 65, 60, 55, 50};
//
//	    for (int i = 0; i < letterMarks.length; i++) {
//	        if (total() >= points[i]) {
//	            return letterMarks[i];
//	        }
//	    }
//
//	    return "F";
//	}
//
//	public double convertToGPA() {
//	    String letterMark = this.defineIteralMark();
//	    double[] gpa = {4.00, 3.67, 3.33, 3.00, 2.67, 2.33, 2.00, 1.67, 1.33, 1.00};
//	    
//	    for (int i = 0; i < gpa.length; i++) {
//	        if (letterMark.equals("F")) {
//	            return 0.0;
//	        }
//	        if (letterMark.equals(letterMarks[i])) {
//	            return gpa[i];
//	        }
//	    }
//
//	    return 0.0;
//	}
//	
	public int hashCode() {
		return Objects.hash(examMark, firstAttestation, secondAttestation);
	}


	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Mark other = (Mark) obj;
		return Double.doubleToLongBits(examMark) == Double.doubleToLongBits(other.examMark)
				&& Double.doubleToLongBits(firstAttestation) == Double.doubleToLongBits(other.firstAttestation)
				&& Double.doubleToLongBits(secondAttestation) == Double.doubleToLongBits(other.secondAttestation);
	}



	public String toString() {
		return "Mark [firstAttestation=" + firstAttestation + ", secondAttestation=" + secondAttestation + ", examMark="
				+ examMark + ", digitMark=" + digitMark + ", iteralMark=" + iteralMark + ", type=" + type + ", gpa="
				+ gpa + "]";
	}



//	public double getFinalExamMark() {
//		return finalExamMark;
//	}
//
//
//
//	public void setFinalExamMark(double finalExamMark) {
//		this.finalExamMark = finalExamMark;
//	}
	
	
	
}
