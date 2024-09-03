public class PartidaXadrez{

    private Board board;
    public PartidaXadrez(){
        board = new Board(8, 8);
    }
    public pecaXadrez[][] getPieces(){
        pecaXadrez[][] mat = new pecaXadrez[board.getLinha()][board.getColuna()];

        for (int i = 0; i < board.getLinha(); i++) {
            for (int j = 0; j < board.getColuna(); j++){
                mat[i][j] = (pecaXadrez) board.piece(i, j);
            }
        }
        return mat;
    }
}