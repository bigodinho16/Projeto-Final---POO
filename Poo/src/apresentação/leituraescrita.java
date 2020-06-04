package apresentação;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class leituraescrita {
	public static void main(String[] args) {
        try {
            
            File file = new File("teste.txt");

           
            if (!file.exists()) {
                file.createNewFile();
            }

           
            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            
           
            bw.write("Teste"+" "+"Matheus");
           
            bw.close();
            
            
            FileReader ler = new FileReader("teste.txt");
            BufferedReader reader = new BufferedReader(ler);  
            String linha;
            while( (linha = reader.readLine()) != null ){
                System.out.println(linha);
            }

            
            System.out.println("Realizado com Sucesso !!!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
