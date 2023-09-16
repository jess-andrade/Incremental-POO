package Classes;

import java.util.Date;

/* 

> Classe Pessoa será reaproveitada p MOTORISTA e ALUNO
> Caso o nome social não seja informado, este deve ser preenchido com o nome civil.

*/ 

public class Pessoa{

// inf pessoais --
   private String nomeCivil, nomeSocial, cpf_cnpj, nomePai, nomeMae, naturalidade;
   private Date dataNascimento;

// inf endereço --
    private String rua, complemento, bairro, telefone;
    private int numeroCasa;

// Construtor :: completo 
public Pessoa(String nomeCivil, String nomeSocial, String cpf_cnpj, String nomePai, String nomeMae, String naturalidade, Date dataNascimento, String rua, String complemento, String bairro, String telefone, int numeroCasa){
 
 this.nomeCivil = nomeCivil;
 this.nomeSocial = nomeSocial;
 this.cpf_cnpj = cpf_cnpj;
 this.nomePai = nomePai;
 this.nomeMae = nomeMae;
 this.naturalidade = naturalidade;
 this.dataNascimento = dataNascimento;
 this.rua = rua;
 this.complemento = complemento;
 this.bairro = bairro;
 this.telefone = telefone;
 this.numeroCasa = numeroCasa;
}

// Construtor :: nome social = nome civil 
public Pessoa(String nomeCivil, String cpf_cnpj, String nomePai, String nomeMae, String naturalidade, Date dataNascimento, String rua, String complemento, String bairro, String telefone, int numeroCasa){
 
 this.nomeCivil = nomeCivil;
 this.nomeSocial = nomeCivil;
 this.cpf_cnpj = cpf_cnpj;
 this.nomePai = nomePai;
 this.nomeMae = nomeMae;
 this.naturalidade = naturalidade;
 this.dataNascimento = dataNascimento;
 this.rua = rua;
 this.complemento = complemento;
 this.bairro = bairro;
 this.telefone = telefone;
 this.numeroCasa = numeroCasa;
}

// GETTERS 
    public String getNomeCivil(){
        return this.nomeCivil;
    }
    public String getNomeSocial(){
        return this.nomeSocial;
    }
    public String getCpf_cnpj(){
        return this.cpf_cnpj;
    }
    public String getNomePai(){
        return this.nomePai;
    }
    public String getNomeMae(){
        return this.nomeMae;
    }
    public String getNaturalidade(){
        return this.naturalidade;
    }
    public Date getDataNascimento(){
        return this.dataNascimento;
    }
    public String getRua(){
        return this.rua;
    }
    public String getComplemento(){
        return this.complemento;
    }
    public String getBairro(){
        return this.bairro;
    }
    public String getTelefone(){
        return this.telefone;
    }
    public int getNumeroCasa(){
        return this.numeroCasa;
    }

    // SETTERS 
    public void setNomeCivil(String nomeCivil){
        this.nomeCivil = nomeCivil;
    }
    public void setNomeSocial(String nomeSocial){
        this.nomeSocial = nomeSocial;
    }
    public void setCpf_cnpj(String cpf_cnpj){
        this.cpf_cnpj = cpf_cnpj;
    }
    public void setNomePai(String nomePai){
        this.nomePai = nomePai;
    }
    public void setNomeMae(String nomeMae){
        this.nomeMae = nomeMae;
    }
    public void setNaturalidade(String naturalidade){
        this.naturalidade = naturalidade;
    }
    public void setDataNascimento(Date dataNascimento){
        this.dataNascimento = dataNascimento;
    }
    public void setRua(String rua){
        this.rua = rua;
    }
    public void setComplemento(String complemento){
        this.complemento = complemento;
    }
    public void setBairro(String bairro){
        this.bairro = bairro;
    }
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    public void setNumeroCasa(int numeroCasa){
        this.numeroCasa = numeroCasa;
    }

}