package apresentação;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


import negocio.Contato;
import persistencia.ContatoDAO;
import persistencia.IContatoDAO;
public class Menu {
public static void menu(){
		
		System.out.printf("**** Agenda Contatos *****\n");
	      System.out.printf("[ 1 ] Salvar Contato\n");
	      System.out.printf("[ 2 ] Atualizar Contato\n");
	      System.out.printf("[ 3 ] Deletar Contatos\n");
	      System.out.printf("[ 4 ] Recupera dados pelo ID\n");
	      System.out.printf("[ 5 ] Recupera todos os dados \n");
	      System.out.printf("\nOpção Desejada: ");
    }
	
  public static void mainSalvar() throws IOException {
	  Scanner ler = new Scanner(System.in);
	  String  nome, sobrenome,email,celular,tipo;
			
	System.out.println("Informe seu nome");
	nome = ler.next();

	System.out.println("Informe seu sobrenome");
	sobrenome = ler.next();

	System.out.println("Informe seu email");
	email = ler.next();

	System.out.println("Informe seu celular");
	celular = ler.next();

	System.out.println("Informe seu tipo");
	tipo = ler.next();

	FileWriter arq = new FileWriter("d:\\dados.txt");
	PrintWriter gravarArq = new PrintWriter(arq);


	gravarArq.printf( "'"+nome+"' ,'"+ sobrenome+"' ,'"+ email+"',' " +celular+"','"+tipo+ "'");
	


	arq.close();

	System.out.printf("\n Dados foram gravados com sucesso em \"d:\\dados.txt\".\n");
		
}
	
public static void mainAlterar() throws IOException{
	  Scanner ler = new Scanner(System.in);
	  String nome, sobrenome,email,celular,tipo;
		
	System.out.println("Informe seu nome");
	nome = ler.next();

	System.out.println("Informe seu sobrenome");
	sobrenome = ler.next();

	System.out.println("Informe seu email");
	email = ler.next();

	System.out.println("Informe seu celular");
	celular = ler.next();

	System.out.println("Informe seu tipo");
	tipo = ler.next();

	FileWriter arq = new FileWriter("d:\\dados.txt");
	PrintWriter alterarArq = new PrintWriter(arq);


	alterarArq.printf( "'"+nome+"' ,'"+ sobrenome+"' ,'"+ email+"',' " +celular+"','"+tipo+ "'");

	arq.close();

	System.out.printf("\n Dados foram alterados com sucesso em \"d:\\dados.txt\".\n");
		
}
	

public static void mainDeletar() throws IOException{
    try {            
        PrintWriter writer = new PrintWriter("d:\\dados.txt");
        writer.print("");
        writer.close();
    } catch (Exception e) {
        e.printStackTrace();
    }
    System.out.printf("Dados foram alterados com sucesso em \"d:\\dados.txt\".\n");
}


	
	
	public static void main(String[] args) throws IOException {
		int opcao;
        Scanner entrada = new Scanner(System.in);
        
        do{
            menu();
            opcao = entrada.nextInt();
            
            switch(opcao){
            case 1:
              mainSalvar();
                break;
                
            case 2:
           mainAlterar();
                break;
                
            case 3:
            	mainDeletar();
                break;
                
            case 4:

            	break;
            
            default:
                System.out.println("Opção inválida.");
            }
        } while(opcao != 0);
    
	}

}
