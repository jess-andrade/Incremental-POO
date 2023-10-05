package Classes;

import java.util.Date;
import java.util.ArrayList;


public class Contrato {

  private int numContrato;
  private Date dataInicio;
  private Date dataFim;
  private double valor;
  private ArrayList<Motorista> motoristas;
  private ArrayList<Veiculo> veiculos;

// Construtor ::  
public Contrato(int numContrato, Date dataInicio, Date dataFim, double valor) {
    
    this.numContrato = numContrato;
    this.dataInicio = dataInicio;
    this.dataFim = dataFim;
    this.valor = valor;
    this.motoristas = new ArrayList<Motorista>();
    this.veiculos = new ArrayList<Veiculo>();
  }

  // GETTERS 
  public int getNumContrato(){
    return this.numContrato;
  }
  public Date getDataInicio(){
    return this.dataInicio;
  }
  public Date getDataFim(){
    return this.dataFim;
  }
  public double getValor(){
    return this.valor;
  }
  public ArrayList<Motorista> getMotoristas(){
    return this.motoristas;
  }
  public ArrayList<Veiculo> getVeiculos(){
    return this.veiculos;
  }

 // SETTERS 
  public void setNumContrato(int numContrato){
    this.numContrato = numContrato;
  }
  public void setDataInicio(Date dataInicio){
    this.dataInicio = dataInicio;
  }
  public void setDataFim(Date dataFim){
    this.dataFim = dataFim;
  }
  public void setValor(double valor){
    this.valor = valor;
  }
  public void setMotoristas(ArrayList<Motorista> motoristas){
    this.motoristas = motoristas;
  }
  public void setVeiculos(ArrayList<Veiculo> veiculos){
    this.veiculos = veiculos;
  }

  //Metodos:::::::::::::
  
  //add veiculo ::
  // -- Apenas veículos alugados podem ser adicionados ao contrato.
  public void addVeiculo(Veiculo veiculo){
    if(!veiculo.isProprio()){ 
      this.veiculos.add(veiculo);
    }
  }

  //remover veiculo ::
  public Veiculo removeVeiculo(int index){
    try{
      return veiculos.remove(index);
    } 
    catch(Exception e){
      return null;
    }
  }
  
  //add motorista ::
  // -- Apenas motoristas terceirizados podem ser adicionados ao contrato.
  public void addVeiculo(Motorista motorista){
    if(!motorista.isServidor()){ 
      this.motoristas.add(motorista);
    }
  }

  //remover motorista ::
  public Motorista removeMotorista(int index){
    try{
      return motoristas.remove(index);
    } 
    catch(Exception e){
      return null;
    }
  }

}