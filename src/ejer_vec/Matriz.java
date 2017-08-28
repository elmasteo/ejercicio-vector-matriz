/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer_vec;
import java.util.Scanner;

public class Matriz {
    int [][]matriz;
    Scanner op2=new Scanner(System.in);
    public Matriz(){
        int tamaño;
        int dato;
        //tamaño de la matriz cuadrada
        System.out.println("Digite el tamaño : ");
        tamaño = op2.nextInt();
        matriz = new int [tamaño][tamaño];
        //ingreso de datos a ordenar
        System.out.println("Digite los datos que desea ordenar:");
        for(int i=0;i<matriz.length;i++){
            for(int j = 0; j < matriz.length; j++){
                matriz[i][j]=op2.nextInt();
            }
            System.out.print("\n");
        }
        
    }
    
    // métodos de interfaz
     public void Descendente(){
      int aux,j, i, k, l;
      //método de ordenamiento de matriz
        for(i = 0; i < matriz.length; i++){
           for(j = 0; j < matriz.length; j++){
               for(k = 0; k < matriz.length; k++){
                   for(l = 0; l < matriz.length; l++){
                       if(matriz[i][j] < matriz[k][l]){
                         aux = matriz[i][j];
                         matriz[i][j] = matriz[k][l];
                         matriz[k][l] = aux;
                       }
                   }
                }
             }
        } 
    impresion();
    }
    public void Ascendente(){
      int aux,j,i,k,l;
        //método de ordenamiento de matriz  
        for(i = 0; i < matriz.length; i++){
           for(j = 0; j < matriz.length; j++){
               for(k = 0; k < matriz.length; k++){
                   for(l = 0; l < matriz.length; l++){
                       if(matriz[i][j] > matriz[k][l]){
                         aux = matriz[i][j];
                         matriz[i][j] = matriz[k][l];
                         matriz[k][l] = aux;
                       }
                   }
               }
           }
        } 
    impresion();
  }
    //método impresión
    public void impresion(){
        System.out.println("Ordenada");
        for(int i=0;i< matriz.length;i++){
            for(int j = 0; j < matriz.length; j++){
            System.out.print(matriz[i][j]+" ");
            }
            System.out.print("\n");
        }
        
    }  
    
   
}
