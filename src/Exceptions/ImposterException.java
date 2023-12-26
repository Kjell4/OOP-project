package Exceptions;

import Users.Researcher;
import Users.User;

public class ImposterException extends Exception {
	public ImposterException(String message) {
        super(message);
    }

    public static void checkParticipant(User participant) throws ImposterException {
        if (!(participant instanceof Researcher)) {
            throw new ImposterException("Non-researcher trying to join the project!");
        }
    }
}
