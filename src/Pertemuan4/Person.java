package Pertemuan4;

public class Person {
    //atribut
    private String nama, alamat;

    //constructor
    public Person(String n, String a){
        nama = n;
        alamat = a;
    }

    //getter
    //cara cepat: alt+insert

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }
}
