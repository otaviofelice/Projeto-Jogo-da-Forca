/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jogodaforca;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * 
 */

public class JogoDaForca {

    
    public static void main(String[] args) {
    
    Scanner tcl = new Scanner(System.in);
        boolean jogar = true;
        int tentativa = 0;
        
        String[] plvr ={"caneta","caderno","escopeta","telefone","carro","bicicleta","computador","mesa","cadeira","copo","caneca","garfo","geladeira","forno","livro","espelho","tesoura","garrafa","prato","brinquedo"};
        
        Random gerador = new Random();
        
        int i = gerador.nextInt(20);        
        
        String palavra = plvr[i].toLowerCase();
        
        int acertos = 0;
        
        char[] palavraescondida = new char[palavra.length()];
        
        String letrasusadas = "";
        
        for (int j = 0; j < palavra.length(); j++) {
        palavraescondida[j] = '-';   
        
       }
        
            System.out.println("Jogo da Forca");
            System.out.println("Descubra o objeto");
            System.out.println("____");
            System.out.println("|  |");
            System.out.println("|  ");
            System.out.println("| ");
            System.out.println("| ");
            System.out.println("|");

            while(jogar == true ){

                for (int j = 0; j < palavra.length(); j++) {
                    System.out.print(palavraescondida[j]);
                }

                    System.out.println("");
                    System.out.println("Digite uma letra:");

                char letra = tcl.next().toLowerCase().charAt(0);

              
                boolean certo = false;
                for (int j = 0; j < palavra.length();j++) {
 
                    if (palavra.charAt(j)== letra) {
                        palavraescondida[j] = letra;
                        acertos++;
                        certo = true;
                    }                   
                }
                
                if (certo == false){
                        System.out.println("Letra não encontrada");                                      
                        letrasusadas = letrasusadas + " " + letra;
                        System.out.println("Letras que ja foram usadas:" + letrasusadas);                   
                        tentativa++;    
                    }

                switch(tentativa){
                    case 0:
                    System.out.println("____");
                    System.out.println("|  |");
                    System.out.println("|  ");
                    System.out.println("| ");
                    System.out.println("| ");
                    System.out.println("|");
                break;
                    case 1:
                    System.out.println("____");
                    System.out.println("|  |");
                    System.out.println("|  O");
                    System.out.println("| ");
                    System.out.println("| ");
                    System.out.println("|");
                break;
                    case 2:
                    System.out.println("____");
                    System.out.println("|  |");
                    System.out.println("|  O");
                    System.out.println("|  |");
                    System.out.println("| ");
                    System.out.println("|");
                break;
                    case 3:
                    System.out.println("____");
                    System.out.println("|  |");
                    System.out.println("|  O");
                    System.out.println("|  |-");
                    System.out.println("| ");
                    System.out.println("|");
                break;
                    case 4:
                    System.out.println("____");
                    System.out.println("|  |");
                    System.out.println("|  O");
                    System.out.println("| -|-");
                    System.out.println("| ");
                    System.out.println("|");        
                break;
                    case 5:
                    System.out.println("____");
                    System.out.println("|  |");
                    System.out.println("|  O");
                    System.out.println("| -|-");
                    System.out.println("| / ");
                    System.out.println("|");
                break;
                    case 6:
                    System.out.println("____");
                    System.out.println("|  |");
                    System.out.println("|  O");
                    System.out.println("| -|-");
                    System.out.println("| / \\");
                    System.out.println("|");
                    System.out.println("Forca, a palavra era: "+ palavra);
                jogar = false;
 
                }
 
 
                
                if (acertos == palavra.length()) {
                        for (int j = 0; j < palavra.length(); j++) {
                    System.out.print(palavraescondida[j]);
                }
                    System.out.println("");
                    System.out.println("Parabens, você adivinhou a palavra!!");
                jogar = false;
   
                
                }
            }
        }
    }

