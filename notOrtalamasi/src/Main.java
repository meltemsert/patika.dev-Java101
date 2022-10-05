import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Matematik notunuzu giriniz:");
        int mat = scan.nextInt();

        System.out.println("Lütfen Fizik notunuzu giriniz:");
        int fizik = scan.nextInt();

        System.out.println("Lütfen Kimya notunuzu giriniz:");
        int kimya = scan.nextInt();

        System.out.println("Lütfen Türkçe notunuzu giriniz:");
        int turkce = scan.nextInt();

        System.out.println("Lütfen Tarih notunuzu giriniz:");
        int tarih = scan.nextInt();

        System.out.println("Lütfen Müzik notunuzu giriniz:");
        int muzik = scan.nextInt();

        int toplam = (mat+fizik+kimya+turkce+tarih+muzik);
        double sonuc = toplam/6;
        System.out.println("Ortalamanız :" + sonuc);

        String metin = sonuc>60 ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(metin);

    }
}