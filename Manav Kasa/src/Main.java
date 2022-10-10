import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        double fiyatArmut = 2.14, fiyatElma = 3.67 ,fiyatDomates = 1.11,fiyatMuz= 0.95 ,fiyatPatlican = 5.00;

        System.out.println("Armut kaç kilo ? : ");
        double armutKilo = scan.nextDouble();

        System.out.println("Elma kaç kilo ? : ");
        double elmaKilo = scan.nextDouble();

        System.out.println("Domates kaç kilo ? : ");
        double domatesKilo = scan.nextDouble();

        System.out.println("Muz kaç kilo ? : ");
        double muzKilo = scan.nextDouble();

        System.out.println("Patlıcan kaç kilo ? : ");
        double patlicanKilo = scan.nextDouble();

        double tutar = fiyatArmut*armutKilo+fiyatElma*elmaKilo+
                fiyatDomates*domatesKilo+fiyatMuz*muzKilo+fiyatPatlican*patlicanKilo;
        System.out.println("Toplam Tutar : " + tutar + " TL ");


    }
}