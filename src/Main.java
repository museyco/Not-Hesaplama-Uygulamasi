package src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int mat, fzk, kimya, turkce, trh, mzk;

        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik Notunuzu Giriniz: ");
        mat = inp.nextInt();

        System.out.print("Fizik Notunuzu Giriniz: ");
        fzk= inp.nextInt();

        System.out.print("Kimya Notunuzu Giriniz: ");
        kimya = inp.nextInt();

        System.out.print("Türkçe Notunuzu Giriniz: ");
        turkce = inp.nextInt();

        System.out.print("Tarih Notunuzu Giriniz: ");
        trh = inp.nextInt();

        System.out.print("Müzik Notunuzu Giriniz: ");
        mzk = inp.nextInt();

        int toplam = (mat + fzk + kimya + turkce + trh + mzk);
        double ort = (toplam / 6);

        boolean kosul = ort >= 65;
        String gectimi = kosul ? "Sınıfı Geçtiniz" : "Sınıfta Kaldınız";



        System.out.print("Ortalamanız: " + ort + ", " +gectimi);




    }

}
