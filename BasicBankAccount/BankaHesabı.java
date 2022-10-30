import java.util.Scanner;
public class BankaHesabı {
    Scanner scan = new Scanner(System.in);
    private int number;
    private String name,lastname,email,phone;
    private double mevcut, borc, maxborc,kalan,eklenen,odenen,yeni;

    public void veriGir(){
        System.out.println("İsminizi giriniz: ");
        name=scan.next();
        lastname=scan.next();
        System.out.println("Telefon numaranızı giriniz: ");
        phone=scan.next();
        System.out.println("Mail adresinizi giriniz: ");
        email=scan.next();
        System.out.println("Hesabınızdaki toplam para miktari giriniz: ");
        mevcut=scan.nextDouble();
        System.out.println("Mevcut borç bilginizi giriniz: ");
        borc=scan.nextDouble();
        System.out.println("Max alabileceğiniz borc miktarını belirtiniz: ");
        maxborc=scan.nextDouble();
    }

    public void paraCek(){
        System.out.println("Çekmek istediğiniz parayı giriniz: ");
        kalan=scan.nextDouble();
        mevcut-=kalan;
    }
    public void paraYatir(){
        System.out.println("Yatırmak istediğiniz parayı giriniz: ");
        eklenen=scan.nextDouble();
        mevcut+=eklenen;
    }

    public void borcOde(){
        System.out.println("Borcun ödeyeceğiniz miktarını giriniz: ");
        odenen=scan.nextDouble();
        borc-=odenen;
    }

    public void borclandir(){
        System.out.println("Yeni aldığınız borcu giriniz: ");
        yeni=scan.nextDouble();
        borc+=yeni;
        if(borc>maxborc){
            System.out.println("Daha fazla borç alamazsınız!");
            borc-=yeni;
        }
    }

    public void hesapSonuc(){
        System.out.println("Mevcut paranız:\t"+mevcut+"\nMevcut borcunuz:\t"+borc);
    }
}
