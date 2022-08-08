/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadoora.calculadora1;
import java.util.Random;

/**
 *
 * @author chao_
 */
public class Estadistica {
    int x;
    int[] array = new int[x];
    int suma;
    int random_int;
    int Med;
    int min;
    int max;
    
public Estadistica(){
this.x=50;
this.suma = 0;
this.min = 1;
this.max = 500;
}
public double Media(){
     array = new int[x];
      Random rand = new Random();
    for(int i =0; i < array.length; i++){
       
         int random_int = 1 + rand.nextInt((500 - 1) + 1);
        
        array[i] = random_int;
    }
    
    for(int i =0; i < array.length; i++){
    suma+=array[i];
    
    
    }
    int Med = suma/array.length;
    System.out.println("La sumatoria de numeros aleatorios es \n" + suma);
    System.out.println("La media es de \n" + Med);
    System.out.println("Tamaño del vector\n" + array.length);
 return Med;
 
}


public double Moda(){
    array = new int[x];
    Random rand = new Random();
    for(int i =0; i < array.length; i++){
       
         int random_int = 1 + rand.nextInt((500 - 1) + 1);
        
        array[i] = random_int;
    }
    
    for(int i =0; i < array.length; i++){}
    



}

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public int getSuma() {
        return suma;
    }

    public void setSuma(int suma) {
        this.suma = suma;
    }

    public int getRandom_int() {
        return random_int;
    }

    public void setRandom_int(int random_int) {
        this.random_int = random_int;
    }

    public int getMed() {
        return Med;
    }

    public void setMed(int Med) {
        this.Med = Med;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

}