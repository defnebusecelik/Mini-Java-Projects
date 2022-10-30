import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BankaHesabı banka=new BankaHesabı();

        banka.veriGir();
        System.out.println("--------------MENU------------");
        System.out.println("1-\t Para Çek\n2-\t Para Yatır\n3-\t Borç Öde\n4-\t Borç Al");
        System.out.println("Yapmak istediğiniz işlemi giriniz: ");
        int islem=scan.nextInt();

        if(islem==1){
            banka.paraCek();
        }else if(islem==2){
            banka.paraYatir();
        }else if(islem==3){
            banka.borcOde();
        }else if(islem==4){
            banka.borclandir();
        }else{
            System.out.println("Hatali giriş yaptiniz!");
        }
        banka.hesapSonuc();
    }
}
