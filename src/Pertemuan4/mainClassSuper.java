package Pertemuan4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class mainClassSuper {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //instance of class
        subClass subC = new subClass("","",0);

        System.out.println("===== INPUT ======");
        System.out.print("Masukkan nama: ");
        String nama = br.readLine();
        System.out.print("Masukkan keterangan: ");
        String keterangan = br.readLine();
        System.out.print("Masukkan usia: ");
        int usia = Integer.parseInt(br.readLine());

        //masukkan data ke object constructor
        subC = new subClass(nama, keterangan, usia);

        System.out.print("Nama: " + subC.getNama());
        System.out.print("Keterangan: " + subC.getKeterangan());
        System.out.print("Usia: " + subC.getUsia());

    }
}
