package boardgame;

public class Piece {

    //Attributes
    protected Position position;
    private Board board;

    //Constructors
    public Piece(Board board) {
        this.board = board;
        position = null;
    }

    //Getters and Setters
    protected Board getBoard() {
        return board;
    }
}