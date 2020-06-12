/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetojogodavelha;

import java.util.Scanner;

/**
 *
 * @author laiz.alves
 */
public class ProjetoJogodavelha {

    static Scanner input = new Scanner(System.in);
    
    static void p() {
        String[][] matriz3 = new String[3][3];
        matriz3[0][0] ="1";
        matriz3[0][1] ="2";
        matriz3[0][2] ="3";
        matriz3[1][0] ="4";
        matriz3[1][1] ="5";
        matriz3[1][2] ="6";
        matriz3[2][0] ="7";
        matriz3[2][1] ="8";
        matriz3[2][2] ="9";
        
        System.out.println("|" + matriz3[0][0] + "|" + matriz3[0][1] + "|" + matriz3[0][2] + "|");

        System.out.println("|" + matriz3[1][0] + "|" + matriz3[1][1] + "|" + matriz3[1][2] + "|");
        System.out.println("|" + matriz3[2][0] + "|" + matriz3[2][1] + "|" + matriz3[2][2] + "|");
    }
    static void p2(int posicao, String jogada) {
        String[][] matriz = new String[3][3];
        int [] vetor = new int [9];
        matriz[0][0] ="1";
        matriz[0][1] ="2";
        matriz[0][2] ="3";
        matriz[1][0] ="4";
        matriz[1][1] ="5";
        matriz[1][2] ="6";
        matriz[2][0] ="7";
        matriz[2][1] ="8";
        matriz[2][2] ="9";
        
        
        switch(posicao){
            case 1: matriz[0][0]=jogada;
            break;
            case 2: matriz[0][1]=jogada;
            break;
            case 3: matriz[0][2]=jogada;
            break;
            case 4: matriz[1][0]=jogada;
            break;
            case 5: matriz[1][1]=jogada;
            break;
            case 6: matriz[1][2]=jogada;
            break;
            case 7: matriz[2][0]=jogada;
            break;
            case 8: matriz[2][1]=jogada;
            break;
            case 9: matriz[2][2]=jogada;
            break;
        }
        
        System.out.println("|" + matriz[0][0] + "|" + matriz[0][1] + "|" + matriz[0][2] + "|");

        System.out.println("|" + matriz[1][0] + "|" + matriz[1][1] + "|" + matriz[1][2] + "|");
        System.out.println("|" + matriz[2][0] + "|" + matriz[2][1] + "|" + matriz[2][2] + "|");
    }
    static String jogada(){
        String escolhaUsuario;
        do {
        System.out.println("Deseja jogar X ou O?");
        escolhaUsuario=input.nextLine();
        } while((!"x".equals(escolhaUsuario) && !"X".equals(escolhaUsuario)) &&
                (!"o".equals(escolhaUsuario) && !"O".equals(escolhaUsuario)));
        if ("X".equals(escolhaUsuario) | "x".equals(escolhaUsuario)){
            
        }
        return escolhaUsuario;
    }
    static int posicao(){
        int posicaoEscolhida;
        do {System.out.println("Em qual posição você vai jogar?");
        posicaoEscolhida=input.nextInt();
    } while(posicaoEscolhida<1|posicaoEscolhida>9);
        
        
        return posicaoEscolhida;  
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
   
        String escolhaJogada;
        int escolhaPosicao;
        p();
        escolhaPosicao = posicao();
        escolhaJogada=jogada();
        int contador = 0;
        do {
            p2(escolhaPosicao, escolhaJogada);
            escolhaPosicao = posicao();
            escolhaJogada=jogada();
            contador++;
        } while(contador<10);

    }
    }
    
