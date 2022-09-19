package com.mycompany.projetov1miltinho;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    
    String Titulo;
    List <String> Opcoes;
    String Rodape;
    
   
    Menu (){
    
        Titulo = "";
        Opcoes = new ArrayList<>();
        Rodape = "";
    }
    
    Menu (String titulo, String rodape){
 
        Titulo = titulo;
        Opcoes = new ArrayList<>();
        Rodape = rodape;        
    }    
    
    public void add (String opcao){
        
        Opcoes.add(opcao);
        
    }
    
    public int exibir (){
        int op = 0;
        do {
            System.out.println(Titulo);
            int i = 1;
            Scanner selecao = new Scanner (System.in);

            for (String item : Opcoes){

                System.out.println("--->      " + i++ + " = " + item + "<---");

            }  

            System.out.println(Rodape);
            op = selecao.nextInt();
        } while (op <= 0 || op > Opcoes.size());
        
        return op;
}
    
    public int imprimir(){
        int opLista = 0;
        do {
            System.out.println(Titulo);
            int i = 1;
            Scanner selecao = new Scanner (System.in);
            
            for (String item : Opcoes){
                
                System.out.println(i++ + "=> " + item);
                
            }
            
            System.out.println(Rodape);
            opLista = selecao.nextInt();
        }while (opLista <= 0 || opLista > Opcoes.size());
        
        return opLista;
            }
        }
