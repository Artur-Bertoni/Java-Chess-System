package chess;

public class ChessException extends RuntimeException{

    private static final long serialVersionUID = 1L;

    //Constructors
    public ChessException(String msg){
        super(msg);
    }
}
