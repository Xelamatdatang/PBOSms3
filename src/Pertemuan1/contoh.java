package Pertemuan1;

public class contoh { //identitas

    //atribut = variabel
    //private/protected
    private String name;
    public double ipk;

    //operasi/fungsi
    //-setter = prosedur
    public void setName(String n){
        //jika nama atribut pada class sama dengan nama atribut pada parameter setter/getter.
        //maka, beri kat
        name=n;
    }
    public void setipk(double i){
        ipk=1;
    }

    //-getter = fungsi --> tanpa parameter, harus ada return
    public String getName(){
        return this.name;
    }
    public double getipk(){
        return this.ipk;
    }


}