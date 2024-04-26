
package nerd_jokenpo;

import java.util.Random;
import java.util.Scanner;

public class jokenpo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int quant=0, opcaoP, aleatorio, vitoriaP=0, vitoriaM=0;
        
        System.out.println("Aviso! Melhor de 5");
        
        while(quant<5){
            System.out.println("Pedra, Papel, Tesoura!");
            System.out.println("Escolha sua opção:\n(0) Pedra\n(1) Papel\n(2) Tesoura");
            opcaoP = input.nextInt();
            aleatorio = rand.nextInt(3); 
            
            switch (aleatorio) {
                case 0:
                    System.out.println("Eu escolho Pedra");
                    break;
                case 1:
                    System.out.println("Eu escolho Papel");
                    break;
                case 2:
                    System.out.println("Eu escolho Tesoura");
                    break;
                default:
                    break;
            }
            
            if(opcaoP == aleatorio){
                System.out.println("Empatamos");
            }else if(opcaoP == 0 && aleatorio == 1){
                vitoriaM ++;
                System.out.println("Eu ganho essa");
                quant ++;
            }else if(opcaoP == 0 && aleatorio == 2){
                vitoriaP ++;
                System.out.println("Você ganha essa");
                quant ++;
            }else if(opcaoP == 1 && aleatorio == 0){
                vitoriaP ++;
                System.out.println("Você ganha essa");
                quant ++;
            }else if(opcaoP == 1 && aleatorio == 2){
                vitoriaM ++;
                System.out.println("Eu ganho essa");
                quant ++;
            }else if(opcaoP == 2 && aleatorio == 0){
                vitoriaM ++;
                System.out.println("Eu ganho essa");
                quant ++;
            }else if(opcaoP == 2 && aleatorio == 1){
                vitoriaP ++;
                System.out.println("Você ganha essa");
                quant ++;
            } 
            System.out.println();
        }
        if(vitoriaP>vitoriaM){
            System.out.println("Você ganhou!");
        }else{
            System.out.println("Você perdeu!");
        }
    }
}
