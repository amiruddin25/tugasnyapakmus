import java.util.Scanner;
public class tugasPertama {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int LuasPersegiPanjang,lebar,panjang,Keliling ;
        LuasPersegiPanjang=24;
        lebar=6;
        String Masukan;
        System.out.print("Masukkan nilai yang anda Ingin cari P untuk mencari Panjang dan K untuk mencari Keliling : ");
        Masukan=input.next();
        switch (Masukan){
            case ("P"):
                panjang= LuasPersegiPanjang / lebar;
                System.out.println("Panjangnya adalah : "+ panjang+" CM");
                break;
            case ("K"):
                panjang= LuasPersegiPanjang / lebar;
                Keliling= 2*(panjang+lebar);
                System.out.print("Kelilingnya adalah: "+Keliling+" CM");
        }


    }
}
