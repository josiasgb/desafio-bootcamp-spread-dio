package dasafios;

import java.util.Scanner;

public class FusoHorario {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int horaSaida = scan.nextInt();
        int tempoViagem = scan.nextInt();
        int fuso = scan.nextInt();

        int hora = horaSaida + tempoViagem + fuso;
        if (hora >= 24) hora -= 24;
        else if (hora < 0) hora += 24;

        System.out.println(hora);

        scan.close();
    }

}
