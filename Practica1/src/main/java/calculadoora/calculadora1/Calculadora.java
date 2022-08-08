/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadoora.calculadora1;

/**
 *
 * @author Riu
 */
public class Calculadora {
    //atributos
    public int operando1;
    public int operando2;
    //Constructor
    public Calculadora(){
    }
    public Calculadora(int operando1, int operando2){
        
        this.operando1 = operando1;
        this.operando2 = operando2;
        }
    //Metodos necesarios de la calculadora basica
    public int sumar(){
    int suma = this.operando1 + this.operando2;
    
    return suma;
    }
    public int restar(){
    int resta = this.operando1 - this.operando2;
    return resta;
    }
    public int multiplicar(){
        int multiplicar = this.operando1 * this.operando2;
        return multiplicar;
    }
    public double dividir() {
    double division = (double)this.operando1 / (double)this.operando2;
    return division;
    }
    //double lo deja ser decimal
//Esto de abajo supuestamente deja modificar los valores porque andan privados los originales
    public int getOperando1() {
        return operando1;
    }

    public void setOperando1(int operando1) {
        this.operando1 = operando1;
    }

    public int getOperando2() {
        return operando2;
    }

    public void setOperando2(int operando2) {
        this.operando2 = operando2;
    }
}
