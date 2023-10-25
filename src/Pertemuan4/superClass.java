package Pertemuan4;

public class superClass {
    //atribut
    private String nama, keterangan;

    //constructor
    public superClass (String nama, String keterangan){
        nama = nama;
        keterangan = keterangan;
    }

    public String getNama() {
        return nama;
    }

    public String getKeterangan() {
        return keterangan;
    }
}
