package patikatemelkavramlar;

import java.util.Scanner;

public class SayilariKucuktenBuyugeSirala {
    //Girilen 3 sayıyı "küçükten büyüğe" sıralayan programı yazınız.
    public static void main(String[] args) {

        int a,b,c;

        Scanner input = new Scanner(System.in);
        System.out.println("Ilk sayiyi giriniz : ");
        a =input.nextInt();

        System.out.println("Ikinci sayiyi giriniz : ");
        b = input.nextInt();

        System.out.println("Ucuncu sayiyi giriniz : ");
        c = input.nextInt();

        if(a<b && a<c)  {
           if(b<c){
               System.out.println("a<b<c");
           }else{
               System.out.println("a<c<b");
           }

        }else if(b<c && b<a) {
            if(c<a){
                System.out.println("b<c<a");
            }else{
                System.out.println("b<a<c");
            }

        }else{
            if(c<a){
                System.out.println("c<a<b");
            }else{
                System.out.println("c<b<a");
            }
        }


    }
}