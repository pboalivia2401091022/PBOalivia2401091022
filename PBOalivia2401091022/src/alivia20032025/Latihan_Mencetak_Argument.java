/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alivia20032025;

/**
 *
 * @author LABP1KOMP
 */
public class Latihan_Mencetak_Argument {
     public static void main( String[] args ){
         
          System.out.println("Number of arguments=" +args.length);
          System.out.println("First Argument="+ args[0]); 
         
          int i;
          
          for(i=0; i<= args.length; i++ )
              System.out.println(""+ args [i]);     
     } 
}
