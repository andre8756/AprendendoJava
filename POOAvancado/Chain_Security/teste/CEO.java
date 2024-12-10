package teste;

public class CEO extends Aprovacao{
    
    @Override
    protected double getConfirmacaoLimite(){
        return Integer.MAX_VALUE;
    }
    
    @Override
    protected String getSetor(){
        return "CEO";
    }
    
}