import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int min ;
        int max ;

            System.out.println("Kaç tane sayı gireceksiniz : ");
            int n = scanner.nextInt();

            System.out.println("1. sayıyı giriniz: ");
            int number = scanner.nextInt();
            min = number;
            max = number;

            for (int i = 2; i <= n; i++) {
                System.out.println(i + ". sayıyı giriniz: ");
                number = scanner.nextInt();

                if(number < min){
                    min = number ;

                }
                if(number > max){
                    max = number;
                }
            }
        System.out.println("En büyük sayı : " + max);
        System.out.println("En küçük sayı : " + min);
    }

}
