package day12forloopwhileloop.forloops;

import java.util.Scanner;

public class ForLoop03 {
    public static void main(String[] args) {

        /*
    Example 1: Asagidaki sekli cizdiren kodu yaziniz
                * * * *
                * * *
                * *
                *
        */

        Scanner input = new Scanner(System.in);
        System.out.println("Satir sayisini(row) giriniz");
        int row = input.nextInt();

        for (int i = 1; i <=row ; i++) {
            for (int k = row; k >=i ; k--) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
