package boardgame;

public class Position {

    //Attributes
    private int row;
    private int columm;

    //Constructors
    public Position(int row, int columm) {
        this.row = row;
        this.columm = columm;
    }

    //Getters and Setters
    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumm() {
        return columm;
    }

    public void setColumm(int columm) {
        this.columm = columm;
    }

    //Methods
    @Override
    public String toString(){
        return row + ", " + columm;
    }
}
