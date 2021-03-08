/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.systeme_lin;

/**
 *
 * @author cz
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       /* System.out.println(Matrice.matTest1(3).toString());
        Matrice m = Matrice.matTest1(3);
        System.out.println(m.toString());
        Matrice m2= Matrice.matTest1(3);
        Matrice m3 = Matrice.identite(3);
        Matrice m4 = Matrice.identite(4);
        System.out.println(Matrice.add(m,m2).toString());
        System.out.println(Matrice.mult(m3, m3).toString());
       Matrice m =Matrice.identite(3);
       System.out.println(m.toString());
       System.out.println(m.permuteLigne(0,1));
       System.out.println(m.toString());
           Matrice m = Matrice.matTest1(3);
       System.out.println(m.toString());
       m.transvection(1,2);
       System.out.println(m.toString());
*/
      
    Matrice m=Matrice.matTest1(3);
    System.out.println(m.determinant());
    Matrice n = Matrice.matTest2(3);
        System.out.println(n.determinant());
     
      
    
    
  
    
   
    
}
}
