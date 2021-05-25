package Tugas_3;
import java.util.Scanner;
public class No_2 {
    public static void main(String[] args) {
        int B[] = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        Scanner input = new Scanner(System.in);
        System.out.println("Manjingna data sing digoleti : ");
        int cari = input.nextInt();
        int ketemu = 0;
        int IndeksAwal = 0;
        int IndeksAkhir = B.length-1;
        int point = 0;
        
        System.out.println("njerone Data B Adalah : ");
            for (int i = 0; i<B.length; i++){
                System.out.print(B[i] + " ");
            }
        System.out.println("");
        System.out.println("");
        
        while ((IndeksAwal <= IndeksAkhir) && (ketemu == 0)){
            point = (IndeksAwal + IndeksAkhir)/ 2;
            System.out.println("Indeks pointer : "+point);
                 if (cari == B [point]){
                     ketemu = 1;
                     System.out.println("Data "+
                     cari + " Telah ditemukan pada indeks ke "+ point);
                 }
                 else if (cari < B[point]){
                     System.out.println("Cari di kiri ");
                     IndeksAkhir = point-1;
                 }
                 else {
                     IndeksAwal = point+1;
                     System.out.println("Cari di kanan ");
                 }
        }
        
        if (ketemu == 1)
            System.out.println("Kesimpulan : Data Ditemukan");
        else
            System.out.println("Kesimpulan : Data Tidak Ditemukan");
    }
}