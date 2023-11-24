package pl.maciejstarostecki.PTCLTZ;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int t = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < t; i++) {
            int s = Integer.parseInt(scanner.nextLine());
            int count = 0;
            int xn = s;

            while (xn != 1) {
                if (xn%2 == 1) xn = 3*xn+1;
                else xn = xn/2;
                count++;
            }

            System.out.println(count);
        }
    }
}
