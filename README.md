# Programa Que Implementa Menu de Opcoes Orientado a Objetos JAVA

<p align="center">
<img src="https://user-images.githubusercontent.com/107817929/191080935-b7d4bb1e-61d9-40c0-b6b6-be4600941738.png" alt="200" width="200"/>
</p>


<img src="https://user-images.githubusercontent.com/107817929/191084617-0b8fcc51-c1f9-45dd-8ef7-b2c1850342de.png" alt="20" width="20"/>  **Introdução**
-----------

Projeto utilizando os conhecimentos obtidos no 1º e 2º Periodo de Ciencia da Computação na disciplina Logica Programação e Algoritmos II.
Consiste na utilização da Linguagem JAVA com profundamento em POO.

O projeto consiste em:

>Criar um programa que implementa um menu de opções orientado á objetos.

1. Criar um programa para demonstrar.
2. Desenhar as Classes.
3. Implementar a solução.
4. O menu pode ter SubMenus.

-----------
<img src="https://user-images.githubusercontent.com/107817929/191095215-5b86919b-8204-42ea-95f6-3ea2d455f8fd.png" alt="20" width="20"/> **IDE Utilizada**

<p align="center">
<img src="https://user-images.githubusercontent.com/107817929/191095804-bf6e7a09-cd57-4245-a64d-10a176f6b84b.png" alt="400" width="400"/>
</p>


-----------

<img src="https://user-images.githubusercontent.com/107817929/191096249-a8b40a50-a19a-4ccd-b374-fb2c4041fd4a.png" alt="20" width="20"/> **Class**
<p align="center">
<img src="https://user-images.githubusercontent.com/107817929/191096628-9ab4b6e8-8214-4817-9fbb-2b3a39f7fa51.png"/>
</p>

-----------
<img src="https://user-images.githubusercontent.com/107817929/191097643-9c030816-7572-419b-a365-19928c771d91.png" alt="20" width="20"/> **Execução em IDE**
<p align="center">
<img src="https://user-images.githubusercontent.com/107817929/191098555-9aca55b0-5e55-4bfd-8268-1406eb5863b0.png"/>
</p>
Utilizando o SCAN junto do Import de DATA e TIME criei "sistema de login" que antecede o acesso ao Menu...


<p align="center">
<img src="https://user-images.githubusercontent.com/107817929/191099176-08c5a1c6-2f6e-4921-a780-a256bdf0f563.png"/>
</p>
Ao digitar o numero de opção escolhido será direcionado ao proximo SubMenu...


======
**Os codigos da classe para a chamada do metodo são:**


```JAVA

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
        }```        
