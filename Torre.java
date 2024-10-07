public class Torre extends pecaXadrez{
    
    public Torre(Board board, Color color){
        super(board, color);
    }
    
    @Override
    public String toString(){
        return "T";
    }
}