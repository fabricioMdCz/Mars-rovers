/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rovers;

import java.util.Scanner;

/**
 *
 * @author fabri
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Principal p= new Principal();
        Scanner sc = new Scanner(System.in);
        Scanner ss = new Scanner(System.in);
        String s="";
        int n=0;
        
        
        System.out.print("Ingresar la cantidad de rovers: ");
        n=sc.nextInt(); 
        System.out.print("Ingresar Coordenada de Entrada: ");
        s=ss.nextLine();
        p.cargar(s);
        
        for(int i=0;i<n;i++){
        System.out.print("\n"+"Posicion Inicial del rovers "+i+": ");
        s=ss.nextLine();
        p.posicionInicial(s);
        System.out.print("Movimientos del rovers "+i+": ");
        s=ss.nextLine();
        p.Andar(s);
        }
        
        System.out.println("\n"+"Las coordenadas esperadas son: ");
        
        for (int j=0;j<n;j++){
        String mensaje=p.menu.pop();
        System.out.println(mensaje+j);
        }
    }
    }
    

