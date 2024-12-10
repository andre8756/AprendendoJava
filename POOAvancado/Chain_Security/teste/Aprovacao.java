package teste;

public abstract class Aprovacao{
    
    protected Aprovacao sucessor;
    
    abstract protected double getConfirmacaoLimite();
    abstract protected String getSetor();
    
    public void setSucessor(Aprovacao aprovacao){
        this.sucessor = aprovacao;
    }
    
    public void handlerAprovacao(double credito){
        if(getConfirmacaoLimite() > credito){
            System.out.println("Credito de "+credito+" aprovado, pelo setor "+getSetor());
        }else{
            sucessor.handlerAprovacao(credito);
        }
    }
    
}