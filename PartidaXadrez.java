public class PartidaXadrez{

    private Board board;
    public PartidaXadrez(){
        board = new Board(8, 8);
        initialSetup();
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
    private void initialSetup(){
        board.placePiece(new Torre(board, Color.WHITE), new Posicao(0, 7));
        board.placePiece(new Torre(board, Color.WHITE), new Posicao(0, 0));
        
        board.placePiece(new Torre(board, Color.BLACK), new Posicao(7, 7));
        board.placePiece(new Torre(board, Color.BLACK), new Posicao(7, 0));

        board.placePiece(new Rei(board, Color.BLACK), new Posicao(0, 3));
        board.placePiece(new Rei(board, Color.WHITE), new Posicao(7, 4));

        board.placePiece(new Rainha(board, Color.BLACK), new Posicao(0, 4));
        board.placePiece(new Rainha(board, Color.WHITE), new Posicao(7, 3));

        board.placePiece(new Bispo(board, Color.BLACK), new Posicao(0, 2));
        board.placePiece(new Bispo(board, Color.BLACK), new Posicao(0, 5));

        board.placePiece(new Bispo(board, Color.WHITE), new Posicao(7, 2));
        board.placePiece(new Bispo(board, Color.WHITE), new Posicao(7, 5));

        board.placePiece(new Cavalo(board, Color.BLACK), new Posicao(0, 1));
        board.placePiece(new Cavalo(board, Color.BLACK), new Posicao(0, 6));

        board.placePiece(new Cavalo(board, Color.WHITE), new Posicao(7, 1));
        board.placePiece(new Cavalo(board, Color.WHITE), new Posicao(7, 6));

        for (int i = 0; i < board.getColuna(); i++) {
            board.placePiece(new Peao(board, Color.BLACK), new Posicao(1, i));
            board.placePiece(new Peao(board, Color.WHITE), new Posicao(6, i));
        }
    }
}