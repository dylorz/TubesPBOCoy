import java.util.Scanner;
public class Kompetisi {
    private String nama;
    private Klasemen klas;
    public Kompetisi(String nama,int tim,int group){
        this.nama = nama;
        klas=new Klasemen(tim,group);
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getNama() {
        return nama;
    }
}