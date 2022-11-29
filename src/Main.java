import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Kilo (kg) / Boy(m) * Boy(m)

        double height;
        int weight;
        double result;

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu giriniz : ");
        height = input.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz : ");
        weight = input.nextInt();

        result = weight / (height * height);

        System.out.println("Vücut Kitle İndeksiniz : " + result);




    }
}
