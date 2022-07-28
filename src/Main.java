import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String username , password , password1  ;

        Scanner input = new Scanner(System.in);
        System.out.print("Lutfen Kullanici Adinizi Giriniz.");
        username = input.nextLine();
        System.out.println("Lutfen Sifrenizi Giriniz.");
        password = input.nextLine();
        if (username.equals("mfa") && password.equals("mfa3442")){
            System.out.println("Giris yaptiniz.");
        } else if (password.equals("mfa3442")==false) {
            System.out.println("Sifrenizi sifirlamak isterseniz 1'i\nSifirlamak istemezseniz 2'i seciniz.");
            int devam;
            Scanner inp= new Scanner(System.in);
            devam=inp.nextInt();
            if (devam ==1 ){
                System.out.print("Lutfen  Yeni Sifrenizi Giriniz:");
                password1 = input.nextLine();
                if (password1.equals("mfa3442")==true){
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz");
                    password1 = input.nextLine();
                    System.out.println("Yeni sifreniz olusturulmustur.");
                }
                else {
                    System.out.println("Şifre oluşturuldu.");
                }
            }
            else {
                System.out.println("Sifrenizi degistirmek istemediginizi belirttiniz.");
            }
        }

    }
}
