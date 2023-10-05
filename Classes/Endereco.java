package Classes;

import java.util.Date;


public class Endereco {

  private String rua, complemento, bairro;
  private int numero;

// Construtor ::  
public Endereco(String rua, String complemento, String bairro, int numero) {
  
  this.rua = rua;
  this.complemento = complemento;
  this.bairro = bairro;
  this.numero = numero;
  }

  // GETTERS 
  public String getRua(){
    return this.rua;
  }
  public String getComplemento(){
    return this.complemento;
  }
  public String getBairro(){
    return this.bairro;
  }
  public int getNumero(){
    return this.numero;
  }

 // SETTERS 
  public void setRua(String rua){
    this.rua = rua;
  }
  public void setComplemento(String complemento){
    this.complemento = complemento;
  }
  public void setBairro(String bairro){
    this.bairro = bairro;
  }
  public void setNumero(int numero){
    this.numero = numero;
  }


}