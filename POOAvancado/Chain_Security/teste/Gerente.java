package teste;


public class Gerente extends Aprovacao{
   
    @Override
    protected double getConfirmacaoLimite(){
        return 10000;
    }
    
    @Override
    protected String getSetor(){
        return "Gerente";
    }
}