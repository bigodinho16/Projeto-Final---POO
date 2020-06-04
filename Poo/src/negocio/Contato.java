package negocio;

import java.io.File;

public class Contato {
private String id = "1";
private String nome ="João";
private String sobrenome = "da Silva";
private String email = "joao@email.com";
private String celular ="(21) 98765-4321";
private String tipo = "Família";
	
public Contato(int i, String nome, String email, String celular, String string, String string2) {

}


public String getID() {
	return id;
}

public void setID(String id) {
	this.id= id;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
this.nome = nome;
}

public String getSobrenome() {
	return sobrenome;
}

public void setSobrenome(String sobrenome) {
this.sobrenome = sobrenome;
}


public String getEmail() {
return email;
}

public void setEmail(String email) {
this.email = email;
}

public String getCelular() {
	return celular;

}

public void setCelular(String celular) {
	this.celular = celular;
}

public String getTipo() {
	return tipo;
}

public void setTipo(String tipo) {
	this.tipo = tipo;
}

@Override
public String toString() {
	return  this.id+ "  ,'" + this.nome + ",'" + this.sobrenome+ ",'"+ this.email+ ",'" + this.celular+ ",'" + this.tipo+"'";
}




}