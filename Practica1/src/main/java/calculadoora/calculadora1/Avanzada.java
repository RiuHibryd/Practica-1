/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadoora.calculadora1;

/**
 *
 * @author Riu
 */
public class Avanzada {
    public int n;
    public int factorial;
    
    //Constructor
 public Avanzada(){
  this.n = 1;
  this.factorial = 1;
  

 }
 //Metodos
 public int Factorial(int n){
  if (n == 0)
      return 1;
  return Factorial(n-1)*n;
 }
 public int fib(int n)
{
    if (n <= 1)
        return n;
    return fib(n-1) + fib(n-2);
  
}

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getFactorial() {
        return factorial;
    }

    public void setFactorial(int factorial) {
        this.factorial = factorial;
    }
}
