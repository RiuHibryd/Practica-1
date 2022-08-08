/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package calculadoora.calculadora1;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Riu
 */
public class Calculadora1 {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       Calculadora miCalculadora = new Calculadora(0,0);
       Geometria miGeometria = new Geometria();
       Avanzada miAvanzada = new Avanzada();
       Estadistica miEstadistica = new Estadistica();
       
       
       boolean mainLopp= true;
       int choice;
       //al final deje la parte aritmetica tal como la entrege antes por falta de tiempo, perdon por eso att: Riu
       // Estos comentarios los escribe la parte primitiva de mi cerebro que piensa que programar a las 2 am para levantarse a las 5 es buena idea
      do{
           System.out.println("Cargando. . .\n");
           System.out.println("Cargando. . .\n");
           System.out.println("Calculadora Avanzada 1.0\n");
           System.out.println("1. Iniciar Sistema\n");
           System.out.println("2. Salir\n");
           
           choice = input.nextInt();
           
            switch(choice){
               case 1: 
                System.out.println("_______\n");
                System.out.println("Eliga una opcion");
                System.out.println("1. Aritmetica\n");
                System.out.println("2. Geometrica\n");
                System.out.println("3. Estadistica\n");
                System.out.println("4. Avanzada\n");
                
                choice = input.nextInt();
                       
                    switch(choice){
                        case 1:
                            System.out.println("_______\n");
                            System.out.println("  Aritmetica\n");
                            System.out.println("_______\n");
                            System.out.println("Menu Principal\n");
                            System.out.println("1. Suma \n");
                            System.out.println("2. Resta \n");
                            System.out.println("3. Multiplicacion\n");
                            System.out.println("4. Division\n");
                            System.out.println("5. Salir\n");
                        
                            choice = input.nextInt();
                        
                       
                          
                                switch(choice){
                                    case 1:
                                 
                                        System.out.println("Ingrese Primer valor");
                                        miCalculadora.operando1 = input.nextInt();
                                        System.out.println("Ingrese Segundo valor");
                                        miCalculadora.operando2 = input.nextInt();
                                        int suma = miCalculadora.sumar();
                                        System.out.println("La suma es: " + suma);
                                        System.out.println("Reiniciando sistema . . .\n");
                                        
                                        
                                        break;
                                   case 2:
                                        System.out.println("Ingrese Primer valor");
                                        miCalculadora.operando1 = input.nextInt();
                                        System.out.println("Ingrese Segundo valor");
                                        miCalculadora.operando2 = input.nextInt();
                                        int resta = miCalculadora.restar();
                                        System.out.println("La resta es: " + resta);
                                        break;
                                   case 3:
                                        System.out.println("Ingrese Primer valor");
                                        miCalculadora.operando1 = input.nextInt();
                                        System.out.println("Ingrese Segundo valor");
                                        miCalculadora.operando2 = input.nextInt();
                                        int multiplicar = miCalculadora.multiplicar();
                                        System.out.println("La multiplicacion es: " + multiplicar);
                                        break;
                                   case 4:
                                        System.out.println("Ingrese Primer valor");
                                        miCalculadora.operando1 = input.nextInt();
                                        System.out.println("Ingrese Segundo valor");
                                        miCalculadora.operando2 = input.nextInt();
                                        double dividir = miCalculadora.dividir();
                                        System.out.println("La division es: " + dividir);
                                        break;
                                   case 5:
                                        System.out.println("Abandonando la existencia");
                                        System.out.println("/leave");
                                        System.exit(0);
                                        break;
                                        default :
                                        System.out.println("No es una opcion valida"); 
                                             }             
                                         break;
                        case 2:   
                            System.out.println("_______\n");
                            System.out.println("  Geometria\n");
                            System.out.println("_______\n");
                            System.out.println("Menu Principal\n");
                            System.out.println("1. Perimetro \n");
                            System.out.println("2. Area \n");
                            System.out.println("3. Salir\n");
                            
                            choice = input.nextInt();
                             
                             switch(choice){
                                 case 1:
                                     System.out.println("_______\n");
                                     System.out.println(" Elija una Figura\n");
                                     System.out.println("_______\n");
                                     System.out.println("1. Rectangulo\n");
                                     System.out.println("2. Cuadrado\n");
                                     System.out.println("3. Circulo\n");
                                     System.out.println("4. Triangulo\n");
                                     
                                     choice = input.nextInt();
                                     //Perimetro
                                      switch(choice){
                                          case 1:
                                           System.out.println("Ingrese su largo\n");
                                           miGeometria.Base = input.nextDouble();
                                           System.out.println("Ingrese su Altura\n");
                                           miGeometria.Altura = input.nextDouble();
                                           double PerimetroRectangulo = miGeometria.PerimetroRectangulo();
                                           System.out.println("Su Perimetro es : " + PerimetroRectangulo);
                                           System.out.println("Reiniciando sistema . . .\n");
                                          case 2:
                                           System.out.println("Ingrese un lado\n");
                                           miGeometria.Lado1= input.nextDouble();
                                           double PerimetroCuadrado = miGeometria.PerimetroCuadrado();
                                           System.out.println("Su perimetro es : " + PerimetroCuadrado);
                                           System.out.println("Reiniciando sistema . . .\n");
                                          case 3:
                                              System.out.println("Ingrese su radio\n");
                                              miGeometria.Radio = input.nextDouble();
                                              double PerimetroCirculo = miGeometria.PerimetroCirculo();
                                              System.out.println("El perimetro es : " + PerimetroCirculo);
                                              System.out.println("Reiniciando sistema . . .\n");
                                          case 4:
                                              System.out.println("Ingrese el primer lado\n");
                                              miGeometria.Lado1 = input.nextDouble();
                                              System.out.println("Ingrese el segundo lado\n");
                                              miGeometria.Lado2 = input.nextDouble();
                                              System.out.println("Ingrese el tercer lado\n");
                                              miGeometria.Lado3 = input.nextDouble();
                                              double PerimetroTriangulo = miGeometria.PerimetroTriangulo();
                                              System.out.println("El perimetro es :\n" + PerimetroTriangulo);
                                              System.out.println("Reiniciando sistema . . .\n");
                                          default :
                                              System.out.println("No es una opcion valida"); 
                                              
                                           
                                      };
                                 case 2:
                                     System.out.println("_______\n");
                                     System.out.println(" Elija una Figura\n");
                                     System.out.println("_______\n");
                                     System.out.println("1. Rectangulo\n");
                                     System.out.println("2. Cuadrado\n");
                                     System.out.println("3. Circulo\n");
                                     System.out.println("4. Triangulo\n");
                                     
                                     choice = input.nextInt();
                                     //Area
                                     switch(choice){
                                         case 1:  
                                           System.out.println("Ingrese su largo\n");
                                           miGeometria.Base = input.nextDouble();
                                           System.out.println("Ingrese su Altura\n");
                                           miGeometria.Altura = input.nextDouble();
                                           double AreaRectangulo = miGeometria.AreaRectangulo();
                                           System.out.println("Su Area es : " + AreaRectangulo);
                                           System.out.println("Reiniciando sistema . . .\n");
                                           break;
                                           
                                         case 2:
                                           System.out.println("Ingrese un lado\n");
                                           miGeometria.Lado1= input.nextDouble();
                                           double AreaCuadrado = miGeometria.AreaCuadrado();
                                           System.out.println("Su Area es : " + AreaCuadrado);
                                           System.out.println("Reiniciando sistema . . .\n");
                                           break;
                                         case 3:
                                           System.out.println("Ingrese su radio\n");
                                           miGeometria.Radio = input.nextDouble();
                                           double AreaCirculo = miGeometria.AreaCirculo();
                                           System.out.println("El Area es : " + AreaCirculo);
                                           System.out.println("Reiniciando sistema . . .\n");
                                           break;
                                         case 4:
                                             System.out.println("Ingres su Base\n");
                                             miGeometria.Base = input.nextDouble();
                                             System.out.println("Ingres su Altura\n");
                                             miGeometria.Altura = input.nextDouble();
                                             double AreaTriangulo = miGeometria.AreaTriangulo();
                                             System.out.println("El Area es :" + AreaTriangulo);
                                             System.out.println("Reiniciando sistema . . .\n");
                                             break;
                                         default:
                                             System.out.println("No es una opcion valida");
                                     };
                               case 3:
                                   System.out.println("Abandonando Sistema\n");
                                   System.exit(0);
                               default :
                                   System.out.println("No es una opcion valida"); 
                             }
                             break;
                        case 3:
                         System.out.println("________________\n");
                         System.out.println("  Estadistica\n");
                         System.out.println("_______________\n");
                         System.out.println("Menu Principal\n");
                         System.out.println("1. Media \n");
                         System.out.println("2. Mediana \n");
                         System.out.println("3. Moda\n");
                         System.out.println("4. Salir\n");
                            
                            choice = input.nextInt();
                            
                            switch(choice){
                                case 1:
                                    System.out.println("Ingrese el tamaño  del vector que no exceda de 50\n");
                                    miEstadistica.x = input.nextInt();
                                    double Media = miEstadistica.Media();
                                    System.out.println("\n" + Media);
                                    System.out.println("Reiniciando sistema . . .\n");
                                    break;
                                case 2:
                                    System.out.println();
                            
                            
                            
                            
                            }
                            break;
                       case 4:
                         System.out.println("________________\n");
                         System.out.println("  Avanzada\n");
                         System.out.println("_______________\n");
                         System.out.println("Menu Principal\n");
                         System.out.println("1. Fibonacci \n");
                         System.out.println("2. Factor N \n");
                         System.out.println("3. Salir\n");
                         
                         choice = input.nextInt();
                         switch(choice){
                           case 1:
                               System.out.println("Ingrese un numero entero diferente de 0\n");
                               miAvanzada.n = input.nextInt();
                               int fib = miAvanzada.fib(miAvanzada.n);
                               System.out.println("El fibonacci es :\n" + fib);
                               System.out.println("Reiniciando sistema . . .\n");
                              
                               
                           
                            break;
                           case 2:
                               System.out.println("Ingrese un numero Entero diferente de 0\n");
                               miAvanzada.n = input.nextInt();
                               int Factorial = miAvanzada.Factorial(miAvanzada.n);
                               System.out.println("El Factorial es :\n" + Factorial);
                               System.out.println("Reiniciando sistema . . .\n");
                               
                               
                               
                               break;
                               
                           case 3:
                                System.out.println("Abandonando Sistema\n");
                                   System.exit(0);
                                   break;
                           default:
                               System.out.println("No es una opcion valida\n");
                               
                          
                               
                         }
                    }
                
                break;
                 case 2: 
                   System.out.println("Abandonando Sistema\n");
                   System.exit(0);
            }
                     
            
       }while(choice !=2);
      
      
      
         
    }
}