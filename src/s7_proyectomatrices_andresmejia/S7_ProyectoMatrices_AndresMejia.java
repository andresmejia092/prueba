// Andres Mejia
package s7_proyectomatrices_andresmejia;

import java.util.Arrays;
import java.util.Scanner;
import java.security.SecureRandom;
import javax.swing.JOptionPane;

public class S7_ProyectoMatrices_AndresMejia {

    static Scanner read= new Scanner(System.in);
    static SecureRandom random= new SecureRandom();
    
    public static void main(String[] args) {
        int opcion; 
        MetodosMatrices M=new MetodosMatrices();
        
        
        
        do{
            
            opcion=Integer.parseInt(JOptionPane.showInputDialog("Opcion 1: Sumar elementos \n"
                    + "Opcion 2: Retornar elemento mayor \n"
                    + "Opcion 3: Sumar dos matrices paralelo \n"
                    + "Opcion 4: Suma primera diagonal \n"
                    + "Opcion 5: Suma segunda diagonal \n"
                    + "Opcion 6: Suma triangulo superior \n"
                    + "Opcion 7: Suma triangulo inferior \n"
                    + "Opcion 8: Suma filas \n"
                    + "Opcion 9: Suma columnas \n"
                    + "Opcion 10: Matriz con borde 0 \n"
                    + "Opcion 11: Matriz ordenada \n"
                    + "Opcion 12: Multiplicacion de matrices \n"
                    + "Ingrese la opcion: "));
            
            System.out.println("Ingrese cantidad de filas: ");
            int filas=read.nextInt();
            System.out.println("Ingrese cantidad de columnas: ");
            int columnas=read.nextInt();
            
            int [][]numeros=lectura(filas,columnas);
            int suma=sumasimple(numeros);
            int mayor=mayor(numeros);
            
            int [][]numeros2=lectura(filas, columnas);
            int [][]sumacomplex=sumaparalelo(numeros,numeros2);
            
            
            switch(opcion){
                case 1:{
                    
                    
                    JOptionPane.showMessageDialog(null, print(numeros)+"\n"
                            +"La suma de elementos es: "+suma);
                    break;
                }
                case 2:{
                    
                    JOptionPane.showMessageDialog(null, print(numeros)+"\n"
                            + "El mayor es: "+mayor);
                    break;
                }
                
                case 3:{
                    JOptionPane.showMessageDialog(null, print(numeros)+"\n"
                            +print(numeros2)+"\n"
                                    + print(sumacomplex));
                    
                    
                    break;
                }
                case 4:{
                    JOptionPane.showMessageDialog(null, print(numeros)+"\n"
                            + "La suma de la primera diagonal es: "+sumadiagonal(numeros));
                    break;
                }
                
                case 5:{
                    JOptionPane.showMessageDialog(null, print(numeros)+"\n"
                            + "La suma de la segunda diagonal es: "+sumadiagonal2(numeros));
                    
                    break;
                }
                
                case 6:{
                    JOptionPane.showMessageDialog(null, print(numeros)+"\n"
                            + "La suma del triangulo superior es: "+triangulosup(numeros));
                    break;
                }
                case 7:{
                    JOptionPane.showMessageDialog(null, print(numeros)+"\n"
                            + "La suma del triangulo inferior es: "+trianguloinf(numeros));
                }
                case 8:{
                    JOptionPane.showMessageDialog(null, print(numeros)+"\n"
                            + printarr(sumafilas(numeros)));
                    break;
                }
                case 9:{
                    JOptionPane.showMessageDialog(null, print(numeros)+"\n"
                            + printarrv(sumacolumnas(numeros)));
                    
                    break;
                }
                case 10:{
                    JOptionPane.showMessageDialog(null, print(numeros)+"\n"
                            + print(matrizceros(numeros)));
                          
                }
                case 11:{
                    JOptionPane.showMessageDialog(null, print(numeros)+"\n"+print(orden(numeros)));
                    
                    break;
                }
                case 12:{
                    System.out.println("Ingrese cantidad de filas de segundo arreglo: ");
                    int filas2=read.nextInt();
                    System.out.println("Ingrese cantidad de columnas de segundo arreglo: ");
                    int columnas2=read.nextInt();
                    while(numeros[0].length!=filas2){
                        System.out.println("El numero de columnas de matriz 1 debe ser igual a numero de filas de matriz 2.");
                        System.out.println("Ingrese el numero de filas de segundo arreglo: ");
                        filas2=read.nextInt();
                        System.out.println("Ingrese el numero de columnas de segundo arreglo: ");
                        columnas2=read.nextInt();
                    }
                    int [][]numeros3=lectura(filas2,columnas2);
                    JOptionPane.showMessageDialog(null, print(numeros)+"\n"+print(numeros3)+"\n"+print(multmatrix(numeros,numeros3)));
                    
                    break;
                }
                
                
            }
            
            
        }while(opcion!=13);
        
    }
    
    
    
}
