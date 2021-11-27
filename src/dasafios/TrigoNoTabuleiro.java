package dasafios;

import java.util.Scanner;

public class TrigoNoTabuleiro {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt(), x;
        double quantidade;
        while(n-- > 0) {
            x = scan.nextInt();
            quantidade = 1;
            for (int i = 0; i < x; i++)
                quantidade *= 2;
            quantidade = Math.floor((quantidade/ 12) / 1000);
            System.out.printf("%.0f kg\n", quantidade);
        }
        scan.close();
    }
}
