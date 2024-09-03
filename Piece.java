public class Piece{
    protected Posicao position; 
    private Board board;

    public Piece(Board board){
        this.board = board;
        position = null;
    }

    public Board getBoard(){
        return this.board;
    }
    protected void setBoard(Board board){
        this.board = board;
    }
}