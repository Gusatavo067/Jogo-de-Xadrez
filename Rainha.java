public class Rainha extends pecaXadrez{
    
    private Color color;
    public Rainha(Board board, Color color){
        super(board, color);
    }
    
    @Override
    public String toString(){
        return "Q";
    }
}
    