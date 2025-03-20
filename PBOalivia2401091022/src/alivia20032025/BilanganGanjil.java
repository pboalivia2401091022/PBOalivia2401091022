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
public class BilanganGanjil {
    public static void main(String[] args) {
        int[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] bilanganGanjil = getBilanganGanjil(data);
        System.out.println(Arrays.toString(bilanganGanjil));
    }

    public static int[] getBilanganGanjil(int[] data) {
        int jumlahGanjil = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] % 2 != 0) {
                jumlahGanjil++;
            }
        }

        int[] bilanganGanjil = new int[jumlahGanjil];
        int index = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] % 2 != 0) {
                bilanganGanjil[index] = data[i];
                index++;
            }
        }
        return bilanganGanjil;
    }
}
    

