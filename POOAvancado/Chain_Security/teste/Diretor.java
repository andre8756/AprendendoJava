package teste;


public class Diretor extends Aprovacao{
    
    @Override
    protected double getConfirmacaoLimite(){
        return 100000;
    }
    
    @Override
    protected String getSetor(){
        return "Diretor";
    }
}