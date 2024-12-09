package aula022;

import java.util.Scanner;

class Ex4{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o valor da compra: ");
        double compra = scanner.nextDouble();
        System.out.println("Escolha a forma de pagamento: ");
        System.out.println("1. Pix: ");
        System.out.println("2. Dinheiro: ");
        System.out.println("3. Crédito: ");
        System.out.println("4. Débito: ");
        System.out.println(" ");
        System.out.print(" >> ");
        int opcao = scanner.nextInt();
        int formaPgmt = 0;
        
        switch(opcao){
            case 1:{
                formaPgmt = 1;
                break;
            }
            case 2:{
                formaPgmt = 2;
                compra = compra-(compra*0.1);
                break;
            }
            case 3:{
                formaPgmt = 3;
                break;
            }
            case 4:{
                formaPgmt = 4;
            }
        }
        
        
        
        switch(formaPgmt){
            case 2:{
                System.out.println("Valor total da compra R$"+compra);
            }
            default: {
                System.out.println("Valor total da compra R$"+compra);
            }
        }
        
        
       
        
    }
}