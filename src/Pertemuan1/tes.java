package Pertemuan1;

//tahapan I/O:
/*
1. Import I/O (Scanner/BuferredReader)
2. Error handling
3. Objek dari library I/O
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class tes {
    public static void main(String[] args) {
        //Objek br
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //Instancce of Class
        contoh c = new contoh();

        //Error handling
        try {
            //blok kode dengan asumsi benar
            //input
            System.out.println("--- INPUT ---");
            c.setName(br.readLine());

            //output
            System.out.println(c.getName());


        } catch (Exception e) {
            //blok kode untuk menjalankan informasi kesalahan dari blok try
            System.out.println(e.getMessage());
        }
    }
}
