/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer_vec;

import java.util.Scanner;

public class Ejer_vec {

    static Scanner op=new Scanner(System.in);
    
    public static void main(String[] args) {
      int men1,metodo1;
      men1=Menu();
      switch(men1){
          case 1:
              Vector obj1= new Vector();
              metodo1=Menu1();
              if(metodo1==1){
                  obj1.Ascendente();
              }else{
                  obj1.Descendente();
              }
              break;
          case 2:
              Matriz obj2 = new Matriz();
              metodo1 = Menu1();
              if(metodo1 == 1){
                  obj2.Ascendente();
              }else{
                  obj2.Descendente();
              }
              break;
          default:
              System.out.println("opción invalida");
      }
    }
    public static int Menu(){
     
    int op1;
    System.out.println("menu");
    System.out.println("1.vector");
    System.out.println("2.matriz");
    System.out.print("digite su opción: ");
    System.out.println();
    op1=op.nextInt();
    return(op1);
    }
    public static int Menu1(){
        int metodo;
        System.out.println("¿Cómo desea ordenar sus datos?");
        System.out.println("1.ascendente");
        System.out.println("2.descendente");
        System.out.print("digite su opción: ");
        System.out.println();
        metodo=op.nextInt();
        return(metodo);
    }

    
}
