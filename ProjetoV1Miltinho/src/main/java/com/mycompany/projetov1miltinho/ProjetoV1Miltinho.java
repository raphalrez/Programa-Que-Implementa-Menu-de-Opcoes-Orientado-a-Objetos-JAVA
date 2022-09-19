package com.mycompany.projetov1miltinho;
 //@author Raphael Lazzarini
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;




public class ProjetoV1Miltinho {

    public static void main(String[] args) { 
        
        Menu m = new Menu ("========> Menu da Fawkers <===========", "Escolha uma opção: ");
        m.add("Listar             ");
        m.add("Cadastrar          ");
        m.add("Editar             ");
        m.add("Cadastrar Cliente  ");
        m.add("Sair               ");
        
        Menu l = new Menu ("=====> Menu de Lista <=====", "Escolha uma opção: ");
        l.add("Produtos       ");
        l.add("Categorias     ");
        l.add("Voltar         ");
        
        Menu o = new Menu ("=====> Menu de Cadastro <=====", "Escolha uma opção: ");
        o.add("Produtos       ");
        o.add("Categorias     ");
        o.add("Voltar         ");
        
        Menu p = new Menu ("=====> Modo Edição <=====", "Digite o que deseja mudar: ");
        p.add("Voltar ao Menu Principal       ");
        //p.add("Você entrou no modo edição:       ");
            
        Menu ll = new Menu ("=====> Menu de Cadastro de Produtos <=====", "Escolha uma opção: ");
        ll.add("Nome:         ");
        ll.add("Categoria:    ");
        ll.add("Preço:        ");
        ll.add("Quantidade:   ");
        ll.add("Voltar...     ");
        
        Menu oo = new Menu ("=====> Menu de Categorias de Produtos <=====", "Escolha uma opção: ");
        oo.add("Proteinas:     ");
        oo.add("Verduras:      ");
        oo.add("Legumes:       ");
        oo.add("Frutas:        ");
        oo.add("Voltar...      ");
        
        
        Menu lista = new Menu ("Cadastro de Clientes Fisicos: ", "Digite abaixo os dados do Cliente: ");
        lista.add("Nome Completo: ");
        lista.add("Data de Nascimento: ");
        lista.add("Idade: ");
        lista.add("Cidade: ");
        lista.add("Telefone de Contato: ");
        lista.add("CPF: ");
        lista.add("RG: ");
        lista.add("Voltar: ");
        
        Menu telaInicial = new Menu ("", "");
        telaInicial.add ("Usuario:               ");
        telaInicial.add ("Senha:                 ");
        telaInicial.add ("Continuar sem Cadastro:");
        telaInicial.add ("         SAIR         :");
                
        
                System.out.println("");
                System.out.println("");
                System.out.println("==================================================================================");
                System.out.println("----------------------------------------------------------------------------------");
                System.out.println(" SEJA BEM VINDO AO SISTEMA DE GERENCIAMENTO DE PRODUTOS DO SUPERMERCADO FAWKERS ! ");
                System.out.println("----------------------------------------------------------------------------------");
                System.out.println("==================================================================================");
                System.out.println("");
                System.out.println("");
                
        Scanner ler = new Scanner(System.in);
        
        String nome;
        int senha;
        String timeStamp = new SimpleDateFormat().format(Calendar.getInstance().getTime());
        System.out.println("=== >  Hoje são: " +timeStamp + " < ===");
        
        System.out.println("======   INFORME O SEU USUARIO   ======");
        nome = ler.nextLine();
        System.out.println("======    INFORME A SUA SENHA    ======");
        senha = ler.nextInt();
        System.out.println("");
        System.out.println("--------------------------------------");
        System.out.println("Olá " +nome + "! Seja muito BEM VINDO.");
        System.out.println("--------------------------------------");
        System.out.println("");
        
        
        
        
        int op = 0;
        do {
                
            //op = telaInicial.exibir();
            
            /*switch (op) {
                case 1:
                    do {
                        System.out.println("==========================================================");
                        System.out.println("");
                        System.out.println("PAGINÁ FORA DO AR ! POR FAVOR ENTRE NO MODO 'SEM CADASTRO'");
                        System.out.println("");
                        System.out.println("==========================================================");
                        op = telaInicial.exibir();
                    }while (op!=3);
                    
                case 2:
                    do {
                        System.out.println("==========================================================");
                        System.out.println("");
                        System.out.println("PAGINÁ FORA DO AR ! POR FAVOR ENTRE NO MODO 'SEM CADASTRO'");
                        System.out.println("");
                        System.out.println("==========================================================");
                        op = telaInicial.exibir();
                        break;
                    }while (op!=2);
                case 3:
                    break;
                case 4:
                    /*System.out.println("");
                    System.out.println("|=============================================================================|");
                    System.out.println("|                                                                             |");
                    System.out.println("|-----------------------------   ATÉ BREVE   ---------------------------------|");
                    System.out.println("|                                                                             |"); 
                    System.out.println("|=============================================================================|");
                    System.out.println("");
                    
                    System.out.println("________´$$$$`_____________________________,,,_");
                    System.out.println("_______´$$$$$$$`_________________________´$$$`");
                    System.out.println("________`$$$$$$$`______,,________,,_______´$$$$´");
                    System.out.println("_________`$$$$$$$`____´$$`_____´$$`____´$$$$$´");
                    System.out.println("__________`$$$$$$$`_´$$$$$`_´$$$$$`__´$$$$$$$´");
                    System.out.println("___________`$$$$$$$_$$$$$$$_$$$$$$$_´$$$$$$$´_");
                    System.out.println("____________`$$$$$$_$$$$$$$_$$$$$$$`´$$$$$$´_");
                    System.out.println("___,,,,,_____`$$$$$$_$$$$$$$_$$$$$$$_$$$$$$´_");
                    System.out.println("_´$$$$$`____`$$$$$$_$$$$$$$_$$$$$$$_$$$$$$´_");
                    System.out.println("´$$$$$$$$$`´$$$$$$$_$$$$$$$_$$$$$$$_$$$$$´_");
                    System.out.println("´$$$$$$$$$$$$$$$$$$_$$$$$$$_$$$$$$$_$$$$$´_");
                    System.out.println("___`$$$$$$$$$$$$$$$_$$$$$$$_$$$$$$_$$$$$$´_");
                    System.out.println("______`$$$$$$$$$$$$$_$$$$$__$$_$$$$$$_$$´_");
                    System.out.println("_______`$$$$$$$$$$$$,___,$$$$,_____,$$$$$´_");
                    System.out.println("_________`$$$$$$$$$$$$$$$$$$$$$$$$$$$$$´_");
                    System.out.println("__________`$$$$$$$$$$$$$$$$$$$$$$$$$$$´_");
                    System.out.println("____________`$$$$$$$$$$$$$$$$$$$$$$$$´_");
                    System.out.println("_______________`$$$$$$$$$$$$$$$$$$$$´_");
                    System.out.println("");
                    System.out.println("                      ATÉ LOGO");                    
                    return
                    
            }*/
        
            op = m.exibir();
            
            switch (op){
                case 1:
                    do {
                        System.out.println();
                        System.out.println();
                        System.out.println("============================================================");
                        System.out.println("===== >> VOCÊ ENTROU NO MENU DE LISTAGEM DA FAWKERS << =====");
                        System.out.println("============================================================");
                        System.out.println();
                        System.out.println();
                        op = l.exibir();

                        switch (op){
                            case 1:
                    do {
                        System.out.println();
                        System.out.println();
                        System.out.println("================================================================");
                        System.out.println("================================================================");
                        System.out.println("===== >> VOCÊ ENTROU NO CADASTRO DE PRODUTOS DA FAWKERS << =====");
                        System.out.println("================================================================");
                        System.out.println("================================================================");
                        System.out.println();
                        System.out.println();
                        op = ll.exibir();

                        switch (op){
                            case 1:
                            break;
                            case 2:
                            break;
                            case 3:
                            break;
                            default:
                            break;
                        }
                    } while (op != 5);
                                                   
                            break;
                            case 2:
                    do {
                        System.out.println();
                        System.out.println();
                        System.out.println("==========================================================================");
                        System.out.println("==========================================================================");
                        System.out.println("===== >> VOCÊ ENTROU NO MENU DE CATEGORIAS DE PRODUTOS DA FAWKERS << =====");
                        System.out.println("==========================================================================");
                        System.out.println("==========================================================================");
                        System.out.println();
                        System.out.println();
                        op = oo.exibir();

                        switch (op){
                            case 1:
                            break;
                            case 2:
                            break;
                            case 3:
                            break;
                            default:
                            break;
                        }
                    } while (op != 5);
                            break;
                            case 3:
                            break;
                            default:
                            break;
                        }
                    } while (op != 3);
                    break;
                case 2:
                    do {

                        System.out.println();
                        System.out.println();
                        System.out.println("============================================================");
                        System.out.println("===== >> VOCÊ ENTROU NO MENU DE CADASTRO DA FAWKERS << =====");
                        System.out.println("============================================================");
                        System.out.println();
                        System.out.println();
                        
                        op = o.exibir();

                        switch (op){
                            case 1:
                                
                            break;
                            case 2:
                            break;
                            case 3:
                            break;
                            default:
                            break;
                        }
                    } while (op != 3);
                    
                    break;
                case 3:
                    do {
                        
                        System.out.println();
                        System.out.println();
                        System.out.println("============================================================================");
                        System.out.println("===== >> VOCÊ ENTROU NO MODO DE EDIÇÃO DO BANCO DE DADOS DA FAWKERS << =====");
                        System.out.println("============================================================================");
                        System.out.println();
                        System.out.println();

                        
                        op = p.exibir();
                        System.out.println("");
                        
                        switch (op){
                            case 1:
                            break;
                            case 2:
                            break;
                            case 3:
                            break;
                            default:
                            break;
                        }
                    } while (op != 1);
                    
                    break;
                    case 4:
                    do {
                        
                        System.out.println();
                        System.out.println();
                        System.out.println("====================================================================================");
                        System.out.println("===== >> BEM VINDO AO CADASTRO DE CLIENTES DA FAWKERS ! SUA MELHOR ESCOLHA! << =====");
                        System.out.println("====================================================================================");
                        System.out.println();
                        System.out.println();

                        
                        op = lista.imprimir();
                        System.out.println("");
                        
                        
                        switch (op){
                            case 1:
                            break;
                            case 2:
                            break;
                            case 3:
                            break;
                            default:
                            break;
                        }
                    } while (op != 8);
                    
                    break;
                default:
                        System.out.println();
                        System.out.println();
                        System.out.println("============================================================");
                        System.out.println("============================================================");
                        System.out.println("============================================================");
                        System.out.println("====== >> ALTERAÇÕES SALVAS COM SUCESSO! ATÉ LOGO! << ======");
                        System.out.println("============================================================");
                        System.out.println("============================================================");
                        System.out.println("============================================================");
                        System.out.println();
                        System.out.println();
                    
                    
                    break;
            }
            
        } while (op != 5);
        
    }
}

