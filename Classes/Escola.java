package Classes;

import java.util.Date;
import java.util.ArrayList;


public class Escola {

  private String nome, cnpj, telefone;
  private Endereco endereco;
  private ArrayList<Aluno> alunos;

// Construtor ::  
public Escola(String nome, String cnpj, String telefone) {

  this.nome = nome;
  this.cnpj = cnpj;
  this.telefone = telefone;
  this.alunos = new ArrayList<Aluno>();
  }

  // GETTERS 
  public String getNome(){
    return this.nome;
  }
  public String getCnpj(){
    return this.cnpj;
  }
  public String getTelefone(){
    return this.telefone;
  }
  public ArrayList<Aluno> getAlunos(){
    return this.alunos;
  }

 // SETTERS 
  public void setNome(String nome){
    this.nome = nome;
  }
  public void setCnpj(String cnpj){
    this.cnpj = cnpj;
  }
  public void setTelefone(String telefone){
    this.telefone = telefone;
  }
  public void setAlunos(ArrayList<Aluno> alunos){
    this.alunos = alunos;
  }


  // Metodos ::::::::::::::::::

  // matricular aluno ::
  public void matricularAluno(Aluno aluno){

      this.alunos.add(aluno);
  }
  
  // exibir alunos ::
  // -- Devem ser listados a matrícula, CPF, nome social e série do aluno.
  public void exibirAlunos(){

    for (Aluno aluno : this.alunos) {

            System.out.println(aluno.getNumMatricula());
            System.out.println(aluno.getCpf_cnpj());
            System.out.println(aluno.getNomeSocial());
            System.out.println(aluno.getSerie());
            System.out.println("");
        }
  }


}