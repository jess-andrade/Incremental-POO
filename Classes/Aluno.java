package Classes;

import java.util.ArrayList;
import java.util.Date;


public class Aluno extends Pessoa {

  private int numMatricula;
  private String serie;
  private Escola escola; // ainda não inicializada
  private Rota rota; // ainda não inicializada

// Construtor ::  
public Aluno(String nomeCivil, String nomeSocial, String cpf_cnpj, String nomePai, String nomeMae, String naturalidade, Date dataNascimento, String rua, String complemento, String bairro, String telefone, int numeroCasa, String numCnh, String catCnh, int tipo, String numContrato) {
 
    super(nomeCivil, nomeSocial, cpf_cnpj, nomePai, nomeMae, naturalidade, dataNascimento, rua, complemento, bairro, telefone, numeroCasa);
    this.numMatricula = numMatricula;
    this.serie = serie;
    this.escola = escola;
  }

  // GETTERS 
  public int getNumMatricula(){
    return this.numMatricula;
  }
  public String getSerie(){
    return this.serie;
  }
  public Escola getEscola(){
    return this.escola;
  }
  public Rota getRota(){
    return this.rota;
  }

 // SETTERS 
  public void setNumMatricula(int numMatricula){
    this.numMatricula = numMatricula;
  }
  public void setSerie(String serie){
    this.serie = serie;
  }
  public void setEscola(Escola escola){
    this.escola = escola;
  }
  public void setRota(Rota rota){
    this.rota = rota;
  }

}