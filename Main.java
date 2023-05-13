import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        // "Öncelikle kullanıcıdan ay gün verilerini girmesini istiyoruz."


        int day, month;
        System.out.println("Ay sayisi:");
        Scanner inp = new Scanner(System.in);
        month = inp.nextInt();
        System.out.println("Gun sayisi:");
        day = inp.nextInt();
        if (month == 3){
            if (day<=20){
                System.out.println("Balik burcu");
            } else {
                System.out.println("Koç burcu");
            }
        } else if (month == 4){
            if (day<=20){
                System.out.println("Koç burcu");
            } else {
                System.out.println("Boğa burcu");
            }
        } else if (month == 5){
            if (day<=21){
                System.out.println("Boğa burcu");
            } else {
                System.out.println("İkizler burcu");
            }
        } else if (month == 6){
            if (day<=22){
                System.out.println("İkizler burcu");
            } else {
                System.out.println("Yengeç burcu");
            }
        } else if (month == 7) {
            if (day<=22){
                System.out.println("Yengec burcu");
            } else {
                System.out.println("Aslan burcu");
            }
        } else if (month == 8){
            if (day<=22){
                System.out.println("Aslan burcu");
            } else {
                System.out.println("Başak burcu");
            }
        } else if (month == 9){
            if (day<=22){
                System.out.println("Başak burcu");
            } else {
                System.out.println("Terazi burcu");
            }
        } else if (month == 10){
            if (day<=22){
                System.out.println("Terazi burcu");
            } else{
                System.out.println("Akrep burcu");
            }
        } else if (month == 11){
            if (day<=21){
                System.out.println("Akrep burcu");
            } else {
                System.out.println("Yay burcu");
            }
        } else if (month == 12){
            if (day<=21){
                System.out.println("Yay burcu");
            } else{
                System.out.println("Oğlak burcu");
            }
        } else if (month == 1){
            if (day<=21){
                System.out.println("Oğlak burcu");
            } else {
                System.out.println("Kova burcu");
            }
        } else if (month == 2){
            if (day<=19){
                System.out.println("Kova burcu");
            } else{
                System.out.println("Balik burcu");
            }
        } else {
            System.out.println("Yanlış bilgi girildi");
        }
    }
}