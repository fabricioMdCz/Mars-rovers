/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rovers;

import java.util.Stack;

/**
 *
 * @author fabri
 */
public class Utileria {
    Stack<Integer> pila= new Stack<>();
    Stack<Integer> Coord_decodificada = new Stack<>();
 void desPilar(int cont){
 int total=0;;
 int sumador;
 for(int j=0;j<cont;j++){

       sumador=(int) (pila.pop()*Math.pow(10,j));
        total=total+sumador; 

         }
    pila.add(total);
 }
     void desencadenar(String pos_base){
    int sacado=0;
    int numero=0;
    int cont_n=0;
     int p=0;
     p=pos_base.length();
     if(pos_base.charAt(p-1)>=65){
     p=p-2;
     }
     for (int i=0; i<p;i++){

         sacado=pos_base.charAt(i);
         numero=sacado-48;
         if (sacado==32){
         desPilar(cont_n);
         cont_n=0;
         }else{
         pila.add(numero);
         cont_n++;
         }
      }
     desPilar(cont_n);
     }
void decodificar(String coord){
      int x=0;
      int y=0;
     switch (coord){
             case "N":
             x=0;
             y=1;    
             break;
                 
             case "S":
             x=0;
             y=-1;
             break;
             
             case "O":
             x=-1;
             y=0;
             break;
                 
             case "E":
             x=1;
             y=0;
             break;
        }
       Coord_decodificada.add(y);
        Coord_decodificada.add(x);
       }  
    
     String coordenada(int x,int y){
      if ((x==0)&&(y==1)){
     return "N";
     }
      if ((x==0)&&(y==-1)){
     return "S";
     }
     if ((x==1)&&(y==0)){
     return "E";
     }
     if ((x==-1)&&(y==0)){
     return "O";
     }
     return "Coordenada Incorrecta";
     } 
         
     String rotar(int mov,int x , int y){
         
     String co= coordenada(x, y);
     
     switch(mov){
         case 'R':
             switch(co){
                 case "N":
                 return "E";
                     
                 case "E":
                 return "S";
                 
                 case "S":
                 return "O";
                 
                 case "O":
                 return "N";
             }
          break;
             
         case 'L':
         switch(co){
                 case "E":
                 return "N";
                     
                 case "S":
                 return "E";
                 
                 case "O":
                 return "S";
                 
                 case "N":
                 return "O";
             }
          break;
  
      }
     return "";
          } 
     } 
