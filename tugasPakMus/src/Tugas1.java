import java.util.Scanner;
public class Tugas1 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Masukkan Nama Kota: ");
        String kota=input.next();
        switch (kota){
            case ("Padang"):
                System.out.println(25000);
                break;
            case ("bandung"):
                System.out.println("40100");
                break;
            case ("Solo"):
                System.out.println("51000");
                break;
            case ("Denpasar"):
                System.out.println("72000");
                break;
            case ("Palu"):
                System.out.println("92300");
        }



    }
}
