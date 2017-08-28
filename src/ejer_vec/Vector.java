/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer_vec;

import java.util.Scanner;


public class Vector extends Ejer_vec implements OrientacionInterface {
    int [] vec;
    Scanner op2=new Scanner(System.in);
    //constructor
    public  Vector(){
        int tamaño;
        int dato;
        //tamaño del vector digitado por consola
        System.out.println("Digite el tamaño de su vector: ");
        tamaño=op2.nextInt();
        vec = new int [tamaño];
        for(int i=0;i<vec.length;i++){
            //datos ingresados según el tamaño ingresado previamente
            System.out.println("Digite el dato "+i);
            vec[i]=op2.nextInt();
        }
    }
    
  public void Descendente(){
     int aux,j,i;
      //método de ordenamiento
        for(i=0;i<=vec.length;i++){
           for(j=i+1;j<vec.length;j++){
               if(vec[i] > vec[j]){
                   aux = vec[i];
                   vec[i] = vec[j];
                   vec[j] = aux;
               }
           }
        }
      impresion();
  }      
  public void Ascendente(){
      int aux,j,i;
      //método de ordenamiento
        for(i=0;i<=vec.length;i++){
           for(j=i+1;j<vec.length;j++){
               if(vec[i] < vec[j]){
                   aux = vec[i];
                   vec[i] = vec[j];
                   vec[j] = aux;
               }
           }
        }
      impresion();
  }
  //método de impresión
 public void impresion(){
     for(int i=0; i<vec.length;i++){
         System.out.println("vector posición:"+i);
        System.out.println(vec[i]);
     }
 }  
}

