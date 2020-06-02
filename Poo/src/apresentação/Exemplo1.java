package apresentação;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import negocio.Contato;
import persistencia.ContatoDAO;
import persistencia.IContatoDAO;

public class Exemplo1 {

	public static void menu(){
        System.out.println("Agenda de Contatos");
        System.out.println("1. Salvar");
        System.out.println("2. Atualizar");
        System.out.println("2. Deletar");
        System.out.println("3. Recuperar pelo ID");
        System.out.println("4. Recuperar todos os dados");
        System.out.println("Opcao:");
    }

  public static void mainSalvar() throws IOException {
	  Scanner ler = new Scanner(System.in);
		String id, nome, sobrenome,email,celular,tipo;
		
		
	System.out.println("Informe o ID");
	id = ler.next();
		
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

	gravarArq.println("Dados");

	gravarArq.printf( id+",'"+nome+"' ,'"+ sobrenome+ "' ,"+ email+ "',' " +celular+"','"+tipo+ "','");

	arq.close();

	System.out.printf("\n Dados foram gravados com sucesso em \"d:\\dados.txt\".\n");
		
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
                
                break;
                
            case 3:
               
                break;
                
            case 4:
               
                break;
            
            default:
                System.out.println("Opção inválida.");
            }
        } while(opcao != 0);
    


	}

}
