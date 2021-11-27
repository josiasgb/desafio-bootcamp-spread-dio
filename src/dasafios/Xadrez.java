package dasafios;
import java.util.Scanner;

public class Xadrez {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int L = scan.nextInt(); //linhas

        int C = scan.nextInt(); //colunas

        if ( L % 2 == 1  && C % 2 == 0){
            System.out.println("0");
        } else if ( L % 2 == 0  && C % 2 == 1){
            System.out.println("0");
            }else{
            System.out.println("1");
        }
    }
}
