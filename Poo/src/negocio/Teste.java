package negocio;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Teste {
	public static void main(String[] args) throws IOException {
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

gravarArq.printf( id+",' "+nome+" ,'"+ sobrenome+ " ,' "+ email+ ",' " +celular+",' "+tipo+ ",' ");

arq.close();

System.out.printf("\n Dados foram gravados com sucesso em \"d:\\dados.txt\".\n");



	}

}
