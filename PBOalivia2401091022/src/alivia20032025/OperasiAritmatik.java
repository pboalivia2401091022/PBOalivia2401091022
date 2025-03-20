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
public class OperasiAritmatik {
      public static void main( String[] args ){
         
          if (args.length != 2) {
            System.out.println("Usage: java ArithmeticOperation <bilangan1> <bilangan2>");
            return;
        }

        try {
            int bilangan1 = Integer.parseInt(args[0]);
            int bilangan2 = Integer.parseInt(args[1]);

            int sum = bilangan1 + bilangan2;
            int difference = bilangan1 - bilangan2;
            int product = bilangan1 * bilangan2;
            double quotient = (double) bilangan1 / bilangan2;

            System.out.println("sum = " + sum);
            System.out.println("difference = " + difference);
            System.out.println("product = " + product);
            System.out.println("quotient = " + quotient);
        } catch (NumberFormatException e) {
            System.out.println("Input harus berupa bilangan integer");
        }
    }
}


