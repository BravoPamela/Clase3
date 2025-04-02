/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.clase3;

/**
 *
 * @author User
 */
public class Clase3 {

    public static void main(String[] args) {
        //ESTRUCTIRAS REPETITIVAS
        /*int contador=0;
        //SINTAXIS DE WHILE
        while(contador<5){
            System.out.println("hola"+contador);
            contador=contador+5;
            //contador++;
        }
       //--------------------------------------------------
      //SINTAXIS DE DO WHILE
       do {
       System.out.println("hola"+contador);
            //contador=contador+5;
            contador++;
       }while (contador < 5);*/
        //-------------------------------------------------
        /*1er EJERCICIO SECUNCIAL
        Escribe un programa que calcule el area de un rectangulo
        */
        /*float altura=2;
        float base=4;
        //almcema el valor de area
        float area=0;
        area=base*altura;
        System.out.println("La base o el area del rectangulo es "+area);/*
        //------------------------------------------------------
        /*2er EJERCICIO SECUNCIAL
        Escribe un programa que determine un numero entero es positivo
        */
        //datos de entrada
        /*int num=2;
        if (num>0){
            System.out.println("El numero positivo es "+num);
        }
        else{
            System.out.println("El numero no es negativo");
        }*/
        //-----------------------------------------------------
        /*3er EJERCICIO SECUNCIAL
        Escribe un programa que determine si un numero es par o impar
        */
        /*int num=5;
       int op=num/2;
       if (op==0){
           System.out.println("este numero es par");
       }
       else {
           System.out.println("este numero es impar");
       }*/
       //------------------------------------------------------- 
       /*4er EJERCICIO SECUNCIAL
        Escribe un programa que determine si un essudiante aprueb o repueba el semestre
       mayo o igual (Exelente), 70 y 89 (Aprueba), menor de 70 (Reprueba)
        */
       int nota=80;
       if ((nota >=0)&& (nota<=100))
       {
       if (nota >=90){
           System.out.println("Exelente");
       } else if ((nota >=70) && (nota<=89))
       {
           System.out.println("Aprueba");
       }
       else if (nota < 70)
       {
           System.out.println("Reprobado");
       }
       }
       else {
           System.out.println("su nota es invalida");
       }
       
    }
}
