import java.util.Scanner;

public class Pemilihan2Percobaan204 {
    public static void main(String[] args) {
        Scanner input04 = new Scanner(System.in);
        System.out.println("Masukkan sudut1: ");
        float sudut1 = input04.nextFloat();
        System.out.println("Masukkan sudut2: ");
        float sudut2 = input04.nextFloat();
        System.out.println("Masukkan sudut3: ");
        float sudut3 = input04.nextFloat();
        float totalsudut;

        totalsudut = sudut1 + sudut2 + sudut3;

        System.out.println("total sudut: " + totalsudut);

        if(totalsudut == 180) {
            if((sudut1 == 90) || (sudut2 == 90) || (sudut3 == 90)){
                System.out.println("Segitiga tersebut adalah segitiga siku-siku");

            } else {
                System.out.println("Segitiga tersebut bukan segitiga siku-siku");
            }
                
        } else
            System.out.println("Bukan segitiga");
    }
}