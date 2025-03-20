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
import java.util.Arrays;
public class AngkaFibonaci {
     public static void main(String[] args) {
         
        int[] data = {1, 3, 7, 10, 12};
        int[] fibonacci = getFibonacci(data);
        System.out.println(Arrays.toString(fibonacci));
    }

    public static int[] getFibonacci(int[] data) {
        int jumlahFibonacci = 0;
        for (int i = 0; i < data.length; i++) {
            if (isFibonacci(data[i])) {
                jumlahFibonacci++;
            }
        }

        int[] fibonacci = new int[jumlahFibonacci];
        int index = 0;
        for (int i = 0; i < data.length; i++) {
            if (isFibonacci(data[i])) {
                fibonacci[index] = data[i];
                index++;
            }
        }
        return fibonacci;
    }

    public static boolean isFibonacci(int n) {
        int a = 0;
        int b = 1;
        if (n == a || n == b) {
            return true;
        }
        int c = a + b;
        while (c <= n) {
            if (c == n) {
                return true;
            }
            a = b;
            b = c;
            c = a + b;
        }
        return false;
    }
}


