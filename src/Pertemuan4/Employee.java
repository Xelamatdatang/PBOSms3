package Pertemuan4;

public class Employee extends Person {
    //atribut
    private String id_emp;

    public Employee(String n, String a, String id_emp) {
        super(n, a);
        this.id_emp = id_emp;
    }

    public String getId_emp() {
        return id_emp;
    }

    @Override
    public String getNama() {
        return super.getNama();
    }

    @Override
    public String getAlamat() {
        return super.getAlamat();
    }
}
