package Aula2_2;

import java.util.Scanner;

public class Ex2 {
	private Scanner scanner = new Scanner(System.in);
    private String materia;
    private String data;
    private int numQestoes;
    private String bimestre;
    private String assunto;
    
    private String[] questao;
    private String[] respostaGab;
    private String[] respostaAluno;

    Ex2() {
    }

    Ex2(String materia, String data, int numQestoes) {
        this.materia = materia;
        this.data = data;
        this.numQestoes = numQestoes;
        this.questao = new String[numQestoes];
        this.respostaGab = new String[numQestoes];
        this.respostaAluno = new String[numQestoes];
    }

    void setCadastrarDisciplina(int numQuestao, String bimestre, String materia, String assunto) {
        System.out.println("CADASTRANDO PROVA");
        System.out.println("");
        
        this.questao = new String[numQuestao];
        for (int i = 0; i < numQuestao; i++) {
            System.out.println("Digite a questao numero " + (i + 1) + ": ");
            this.questao[i] = scanner.nextLine();
        }
        this.numQestoes = numQuestao;
        this.bimestre = bimestre;
        this.materia = materia;
        this.assunto = assunto;
        System.out.println("");
        System.out.println("PROVA REGISTRADA COM ÊXITO");
        System.out.println("");
    }

    void setCadastrarGabarito(int numQuestao, String bimestre, String materia, String assunto) {
        System.out.println("CADASTRANDO GABARITO");
        this.respostaGab = new String[numQuestao];
        for (int i = 0; i < numQuestao; i++) {
            System.out.println("Digite a questao numero " + (i + 1) + ": ");
            this.questao[i] = scanner.nextLine();
            System.out.println("Digite a resposta da questao numero " + (i + 1) + ": ");
            this.respostaGab[i] = scanner.nextLine();
        }
        this.numQestoes = numQuestao;
        this.bimestre = bimestre;
        this.materia = materia;
        this.assunto = assunto;
    }

    void setMostrarProva(){
        this.respostaAluno = new String[questao.length];
        for (int i = 0; i < questao.length; i++) {
            System.out.println(questao[i]);
            this.respostaAluno[i] = scanner.nextLine();
            System.out.println("");
        }
    }

    void setMostrarGaba() {
        for (int i = 0; i < questao.length; i++) {
            System.out.println(questao[i]);
            System.out.println(respostaGab[i]);
        }
    }
}
