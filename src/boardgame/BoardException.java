package boardgame;

public class BoardException extends RuntimeException{

    private static final long serialVersionUID = 1L;

    //Constructors
    public BoardException(String msg) {
        super(msg);
    }
}