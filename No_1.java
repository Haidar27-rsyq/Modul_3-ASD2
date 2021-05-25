package Tugas_3;
import java.util.Scanner;
public class No_1 {
    public static void main(String[] args) {
        System.out.println("Goleti SEQUENTIAL"+"\n");
       String data [] = {"Galileo", "Archimedes", "Alkhawarizmi", "Aljabar", "MuhammadHaidarRasyiq", "Tesla"};
       String key;
       
       //fitu scanner
       Scanner scan = new Scanner(System.in);
       System.out.print(" Lebokna Data sing digoleti : ");
       key = scan.nextLine();
       
       //Menampilkan data array
       System.out.print("Njerone data : ");
       for (int i = 0; i<data.length; i++){
           System.out.print(data[i] + " ");
       }
       System.out.println("");
       
       for (int i=0; i<=data.length; i++){
           if (key.equalsIgnoreCase(data[i])){
               System.out.print("Data "+key+" berapa pada index ke - "+i);
               break; //stop perulangan
           }
       }
       System.out.println("\n");
       System.out.println();
       System.out.println(" Matur Suwun ");
    }   
}
