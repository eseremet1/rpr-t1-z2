package ba.unsa.etf.rpr;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n;
        Scanner ulaz = new Scanner(System.in);
        System.out.println("Unesite broj n:");
        n = ulaz.nextInt();

        for(int i=1; i<n+1; i++) {
            if(i%(sumaCifara(i))==0)
                System.out.println(i);
        }
	// write your code here
    }

    private static int sumaCifara(int broj) {
        int suma = 0;
        while(broj!=0) {
            int pomocna = broj%10;
            suma = suma+pomocna;
            broj = broj/10;
        }
        return suma;
    }
}
