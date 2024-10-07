public class Bispo extends pecaXadrez{
    
    private Color color;
    public Bispo(Board board, Color color){
        super(board, color);
        this.color = color;
    }
    
    @Override
    public String toString(){
        return "B";
    }
}