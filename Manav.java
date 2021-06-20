import java.util.Scanner;
public class Manav {
    public static void main(String[] args) {
        double armut, elma, domates, muz, patlican,tutar;
        double aFiyat, eFiyat, dFiyat, mFiyat, pFiyat;
        Scanner input= new Scanner(System.in);
        System.out.println("Alınan armut kilosu:");
        armut= input.nextDouble();
        aFiyat= 2.14 * armut;
        System.out.println("Alınan elma kilosu:");
        elma= input.nextDouble();
        eFiyat = 3.67 * elma;
        System.out.println("Alınan domates kilosu:");
        domates = input.nextDouble();
        dFiyat = 1.11 * domates;
        System.out.println("Alınan muz kilosu:");
        muz= input.nextDouble();
        mFiyat = 0.95 * muz;
        System.out.println("Alınan patlican kilosu:");
        patlican = input.nextDouble();
        pFiyat = 5 * patlican;
        tutar = aFiyat + eFiyat+ dFiyat+ mFiyat+ pFiyat;
        System.out.println("Toplam tutarınız:"+ tutar);
    }
}
