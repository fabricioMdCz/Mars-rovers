/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rovers;

import java.util.LinkedList;
import java.util.Stack;

/**
 *
 * @author fabri
 */
public class Principal extends Utileria{
 final int FILAS = 30, COLUMNAS = 30;
        String base="¶";
        int pase=0;
        int f, c;
        int aux=0;
        Stack<String> otro = new Stack<>();
        Stack<Integer> carga_inicial = new Stack<>();
        Stack<Integer> carga_inicial2 = new Stack<>();
        Stack<Integer> Posicion_i = new Stack<>();
        Stack<Integer> graficar = new Stack<>();
        Stack<String> coord_pol = new Stack<>();
        Stack<String> auxi = new Stack<>();
        LinkedList<String> menu = new LinkedList<>();
        
        String[][] A = new String[FILAS][COLUMNAS];
        
       
     void graficar(int a, int b, String letra )  {
             for (f = 0; f < A.length; f++) { 
            for (c = 0; c < A[f].length; c++) {
                if((c==a)&&(f==b)){
                A[f][c]=" "+letra+" ";
                System.out.print(A[f][c] + " ");
                 }else{
               
                A[f][c]=" - ";
                System.out.print(A[f][c] + " "); 
                 }      
            }
            System.out.println();
        }
              System.out.print("----------------------------------------------"); 
     } 
     void graficar(){
       String letra;
       if (pase==0){
       otro.add(base);
       }
       int  b=graficar.pop();
       int  a=graficar.pop();
      letra= otro.pop();
         graficar(a, b, letra);
     }
     void cargar(int a,int b,String letra){
        carga_inicial.add(a);
        carga_inicial.add(b);
        graficar.add(a);
        graficar.add(b);
        
  //          graficar(a, b, letra);
      }
     void cargar(String pos_base){
     int a,b;
     desencadenar(pos_base);
     b=pila.pop();
     a=pila.pop();
     cargar(a,b,base);
     }
     void posicionInicial(String pos_i){
     desencadenar(pos_i);
     String base=pos_i.charAt(pos_i.length()-1)+"";
     int b=pila.pop();
     int a=pila.pop();
     posicionInicial(a,b,base);
     }
     void posicionInicial(int a,int b,String coord){

     if (aux!=0){
     carga_inicial.pop();
     carga_inicial.pop();
     }
     int antB=carga_inicial.pop();
     int antA=carga_inicial.pop();
     carga_inicial2.add(antA);
     carga_inicial2.add(antB);
     f=a+antA;
     c=b+antB;
     graficar.add(f);
     graficar.add(c);
     coord_pol.add(coord);
     otro.add(coord);
     
     Posicion_i.add(c);
     Posicion_i.add(f);
    cargar(f,c,coord);
    pase++;
     }

     
     void Andar(String mover){
     int i=0;
     int x=0;
     int y=0;
//    int tamanio=lista.size();
     int c1=Posicion_i.pop();
     int f1=Posicion_i.pop();
     int c2=carga_inicial2.pop();
     int f2=carga_inicial2.pop();
     carga_inicial.add(c2);
     carga_inicial.add(c2);
     String[] a=new String[mover.length()];
    int tamanio= a.length;
   
     String coord=coord_pol.pop();
     decodificar(coord);
         x=Coord_decodificada.pop();
         y=Coord_decodificada.pop();
     while(i<tamanio){
     int direc=mover.charAt(i);
  
     if (direc!='M'){
         coord=rotar(direc, x, y);
         decodificar(coord);
         x=Coord_decodificada.pop();
         y=Coord_decodificada.pop();
        }else{
           f1=f1+y;
           c1=c1+x;        
        }
     i++;
        }
        String coordenad= coordenada(x, y);
         cargar(c1, f1, coordenad);
          graficar.add(c1);
          graficar.add(f1);
          otro.add(coordenad);
         pase++;
     //    System.out.println("coordenada final:"+(c1-c2)+" "+(f1-f2)+" "+coordenad);
         aux++;
         
         menu.add((c1-c2)+" "+(f1-f2)+" "+coordenad+" → Es la coordenada final del Rovers ");
         
     }
}

