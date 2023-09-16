package Classes;

import java.util.Date;
/*

> Escreva um método que verifique se o motorista é servidor ou terceirizado.
> O método setNumContrato deve emitir a mensagem de erro "Método inválido." caso o tipo = 0.
> O construtor deve exigir o número do contrato para motorista terceirizado.  Já quando o motorista for servidor o atributo num_contrato não deve ser iniciado.

*/

public class Motorista extends Pessoa {
  
// inf cnh --
    private String numCnh, catCnh;
    private int tipo; //servidor = 0 terceirizado = 1
    private String numContrato; // so para o motorista tipo 1 

// Construtor :: com nome social 
  public Motorista(String nomeCivil, String nomeSocial, String cpf_cnpj, String nomePai, String nomeMae, String naturalidade, Date dataNascimento, String rua, String complemento, String bairro, String telefone, int numeroCasa, String numCnh, String catCnh, int tipo, String numContrato) {
 
    super(nomeCivil, nomeSocial, cpf_cnpj, nomePai, nomeMae, naturalidade, dataNascimento, rua, complemento, bairro, telefone, numeroCasa);
    this.numCnh = numCnh;
    this.catCnh = catCnh;
    this.tipo = tipo;
    this.numContrato = numContrato;
  }

// Construtor :: sem nome social 
  public Motorista(String nomeCivil, String cpf_cnpj, String nomePai, String nomeMae, String naturalidade, Date dataNascimento, String rua, String complemento, String bairro, String telefone, int numeroCasa, String numCnh, String catCnh, int tipo, String numContrato) {
 
    super(nomeCivil, cpf_cnpj, nomePai, nomeMae, naturalidade, dataNascimento, rua, complemento, bairro, telefone, numeroCasa);
    this.numCnh = numCnh;
    this.catCnh = catCnh;
    this.tipo = tipo;
    this.numContrato = numContrato;
  }

  // GETTERS 
  public String getNumCnh(){
    return this.numCnh;
  }
  public String getCatCnh(){
    return this.catCnh;
  }
  public int getTipo(){
    return this.tipo;
  }
  public String getNumContrato(){
    return this.numContrato;
  }
  // SETTERS 
  public void setNumCnh(String numCnh){
    this.numCnh = numCnh;
  }
  public void setCatCnh(String catCnh){
    this.catCnh = catCnh;
  }
  public void setTipo(int tipo){
    this.tipo = tipo;
  }
  public void setNumContrato(String numContrato) throws Exception {
    if (this.tipo == 0){
      throw new Exception("Método inválido");
    }
    this.numContrato = numContrato;
  }

  public boolean isServidor(){
    // Verifica se o motorista é servidor ou terceirizado

    return (this.tipo == 0); //se for servidor retorna true
  }

}

