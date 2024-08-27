package boardgame;

public class Posicao{
    private int linha;
    private int coluna;

    public Posicao(int linha,int coluna){
        this.linha=linha;
        this.coluna=coluna;
    }
    public getLinha(){
        return linha;
    }
    public setLinha(int linha){
        this.linha = linha;
    }
    public getColuna(){
        return coluna;
    }
    public setColuna(int coluna){
        this.coluna = coluna;
    }
}