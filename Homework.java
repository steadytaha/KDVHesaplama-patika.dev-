import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double tutar, kdv=0.18, sonuc;

        System.out.print("Ürünün fiyatını giriniz: ");
        tutar = input.nextDouble();

        double kdvTutar = kdv * tutar;
        double kdvliTutar = kdvTutar + tutar;

        System.out.println("KDV tutarı: " +kdvTutar);
        System.out.println("KDV'li tutar: " +kdvliTutar);
    }
}
