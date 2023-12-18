//package Exceptions;
//
//import java.io.IOException;
//
//public class ImposterException extends Exception {
//	public ImposterException(String message) {
//        super(message);
//    }
//
//    public static void checkParticipant(ResearchProject topic, ResearcherProject participant) throws ImposterException {
//        if (!(participant instanceof Researcher)) {
//            throw new ImposterException("Non-researcher trying to join the project!");
//        } else {
//            topic.joinParticipant(participant);
//            System.out.println("Participant added to the project!");
//        }
//    }
//}
