package Classes;

/*

> Na classe VEICULO, escreva um método que verifique se o veículo é próprio ou alugado.
> O método setNumContrato deve emitir a mensagem de erro "Método inválido." caso o tipo = 0.
> O construtor deve exigir o número do contrato para veículo alugado. Já quando o veículo for próprio o atributo num_contrato não deve ser iniciado.

*/ 

public class Veiculo{
  
    private String placa, modelo;
    private int ano, capacidade, tipo; //próprio tipo=0 ou alugado tipo=1
    private int numContrato; //apenas veiculo alugado

// Construtor :: veiculo proprio tipo=0
public Veiculo(String placa, String modelo, int ano, int capacidade, int tipo){
  
  this.placa = placa;
  this.modelo = modelo;
  this.ano = ano;
  this.capacidade = capacidade;
  this.tipo = 0;
} 

// Construtor :: veiculo alugado tipo=1 
public Veiculo(String placa, String modelo, int ano, int capacidade, int tipo, int numContrato){
  
  this.placa = placa;
  this.modelo = modelo;
  this.ano = ano;
  this.capacidade = capacidade;
  this.tipo = 1; 
  this.numContrato = numContrato;
} 

// GETTERS 
  public String getPlaca(){
    return this.placa;
  }
  public String getModelo(){
    return this.modelo;
  }
  public int getAno(){
    return this.ano;
  }
  public int getCapacidade(){
    return this.capacidade;
  }
  public int getTipo(){
    return this.tipo;
  }
  public int getNumContrato(){
    return this.numContrato;
  }

// SETTERS 
  public void setPlaca(String placa){
    this.placa = placa;
}
  public void setModelo(String modelo){
    this.modelo = modelo;
}
  public void setAno(int ano){
    this.ano = ano;
}
  public void setCapacidade(int capacidade){
    this.capacidade = capacidade;
}
  public void setTipo(int tipo){
    this.tipo = tipo;
}
  public void setNumContrato(int numContrato) throws Exception {
    if (numContrato == 0){
      throw new Exception("Método inválido");
    }
    this.numContrato = numContrato;
}

  public boolean isProprio(){
    // Verifica se o motorista é servidor ou terceirizado

    return (this.tipo == 0); //se for proprio retorna true 
  }


}
