package pl.maciejstarostecki.SKARBFI;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int D, N, x, y;
        D = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < D; i++) {
            x = 0;
            y = 0;
            N = Integer.parseInt(scanner.nextLine());
            for (int j = 0; j < N; j++) {
                String input = scanner.nextLine();
                String[] numbers = input.split(" ");

                int a = Integer.parseInt(numbers[0]);
                int b = Integer.parseInt(numbers[1]);

                if (a == 0) x += b;
                else if (a == 1) x -= b;
                else if (a == 2) y += b;
                else if (a == 3) y -= b;

            }
            if (x == 0 && y == 0) System.out.println("studnia");
            else {
                if (x > 0) System.out.println("0 " + x);
                else if (x < 0) System.out.println("1 " + x*(-1));
                if (y > 0)  System.out.println("2 " + y);
                else if (y < 0)  System.out.println("3 " + y*(-1));
            }
        }
    }
}
