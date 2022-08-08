/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadoora.calculadora1;

/**
 *
 * @author Riu
 */

public class Geometria {
    public double Altura;
    public double Base;
    public double Radio;
    public double Lado;
    public double Lado1;
    public double Lado2;
    public double Lado3;
    
    
    
    //Constructor
 public Geometria(){
     this.Altura = 0;
     this.Base = 0;
     this.Radio = 0;
     this.Lado = 0;
     this.Lado1 = 0;
     this.Lado2 = 0;
     this.Lado3 = 0;
 
 }
 //Metodo del triangulo
 
 public double AreaTriangulo(){
    double AreaTriangulo = (this.Altura * this.Base)/2;
    return AreaTriangulo;
 }
 public double PerimetroTriangulo(){
     double PerimetroTriangulo = this.Lado1 + this.Lado2 + this.Lado3 ;
     return PerimetroTriangulo;
 }
 //Metodo Cuadrado
 public double PerimetroCuadrado(){
      double PerimetroCuadrado = this.Lado1 * 4;
      return PerimetroCuadrado;
 }
 public double AreaCuadrado(){
     double AreaCuadrado = this.Lado1 * this.Lado1;
     return AreaCuadrado;
 }
 //Metodo Circulo
 public double AreaCirculo(){
 double AreaCirculo = this.Radio * this.Radio * 3.1416;
 return AreaCirculo;
 }
 public double PerimetroCirculo(){
     double PerimetroCirculo = this.Radio * 2 * 3.1416;
     return PerimetroCirculo;
 }
 //Metodo Rectangulo
 public double PerimetroRectangulo(){
     double PerimetroRectangulo= 2 * this.Base + 2 * this.Altura;
     return PerimetroRectangulo;
 }
 public double AreaRectangulo(){
     double AreaRectangulo = this.Base * this.Altura;
     return AreaRectangulo;
 }
 
 
 //obtener

    public double getAltura() {
        return Altura;
    }

    public void setAltura(double Altura) {
        this.Altura = Altura;
    }

    public double getBase() {
        return Base;
    }

    public void setBase(double Base) {
        this.Base = Base;
    }

    public double getRadio() {
        return Radio;
    }

    public void setRadio(double Radio) {
        this.Radio = Radio;
    }

    public double getLado() {
        return Lado;
    }

    public void setLado(double Lado) {
        this.Lado = Lado;
    }

    public double getLado1() {
        return Lado1;
    }

    public void setLado1(double Lado1) {
        this.Lado1 = Lado1;
    }

    public double getLado2() {
        return Lado2;
    }

    public void setLado2(double Lado2) {
        this.Lado2 = Lado2;
    }

    public double getLado3() {
        return Lado3;
    }

    public void setLado3(double Lado3) {
        this.Lado3 = Lado3;
    }


 
}