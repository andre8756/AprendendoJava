package teste;


public class Caixa extends Aprovacao{
    
    @Override
    protected double getConfirmacaoLimite(){
        return 1000;
    }
    
    @Override
    protected String getSetor(){
        return "Caixa";
    }
    
}