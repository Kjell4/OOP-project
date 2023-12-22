package Exceptions;

public class NoSuchFormatException extends Exception{

	public NoSuchFormatException(String message) {
        super(message);
    }

    public static void invalidFormat() throws NoSuchFormatException {
         throw new NoSuchFormatException("Error! No such format! Format can be [PlainText] or [Bibtex]!");
    }
}
