import java.util.InputMismatchException;
import java.util.Scanner;
public class Driver {
    private Scanner input = new Scanner(System.in);
    private final Kompetisi[] daftarKompetisi = new Kompetisi[10];
    private int nKompetisi = 0;
    public void addKompetisi(String nama,int tim,int grup) {
        Kompetisi K = new Kompetisi(nama,tim,grup);
        daftarKompetisi[nKompetisi++] = K;
    }
    public void removeKompetisi(int index){
        daftarKompetisi[index] = null;
    }
    public String toString() {
        String tmp = "";
        for (int i=0;i<nKompetisi;i++){
            tmp =i+" "+daftarKompetisi[i].getNama()+" \n";
        }
        return tmp;
    }
     public void menuAction(int pil) {
        switch (pil){
            case 0 : break;
            case 1 : 
                System.out.print("Masukan nama Kompetisi : ");
                String tmp = input.nextLine();
                System.out.print("Masukan Jumlah Tim  : ");
                int tim = input.nextInt();
                System.out.print("Masukan Jumlah Grup : ");
                int grup = input.nextInt();
                addKompetisi(tmp,tim,grup);
                break;
            case 2 :
                boolean cek = false;
                int x = 0;
                while(cek!=true){
                    System.out.println(toString());
                    System.out.print("pilih kompetisi ( pilih dengan cara input urutan nomornya) : ");
                    try {
                        x = input.nextInt();
                        cek = true;
                    }
                    catch(InputMismatchException e){
                        throw new InputMismatchException("Input harus Angka");
                    }
                    catch(ArrayIndexOutOfBoundsException e){
                        throw new ArrayIndexOutOfBoundsException("Data tidak ada");
                    }
                }
                if (cek==true){
                    removeKompetisi(x);
                }
                break;
            case 4 :
                System.out.println(toString());
                break;
        }
    }
    public void menuKompetisi() {
        int pil=9;
        boolean cek = false;
        while(cek!=true && pil!=0){
            System.out.println("Selamat datang di menu utama");
            System.out.println("1.Buat kompetisi");
            System.out.println("2.hapus kompetisi");
            System.out.println("3.pilih kompetisi");
            System.out.println("4.lihat daftar kompetisi");
            System.out.println("0.exit");
            System.out.print("Pilih : ");
            try{
                if (input.hasNextInt()){
                    pil = input.nextInt();
                }
                else {
                    throw new InputMismatchException("Input harus angka");
                }
                
                if (pil<0 || pil>4){
                    throw new IllegalArgumentException("Input diluar menu");
                }
                cek=true;
            }
            catch (Exception e){
                e.getMessage();
            }
            finally{
            input = new Scanner(System.in);
        }
            menuAction(pil);
            }
    }
    public static void main(String[] args) {
        Driver App = new Driver();
        try {
            App.menuKompetisi();
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }

        /*Pemain p1 = new Pemain("Rian",11,"Striker");
        Pemain p2 = new Pemain("apiz",10,"Striker");
        Pemain p3 = new Pemain("api",9,"Striker");
        System.out.println(p1.getNama()+"  "+p1.getPosisi()+"  "+p1.getNoPunggung());
        Tim t1 = new Tim("IF11",2,7);
        Tim t2 = new Tim("IF12",2,7);
        Tim t3 = new Tim("IF13",2,7);
        Tim t4 = new Tim("IF14",2,7);
        Tim t5 = new Tim("IF15",2,7);
        Tim t6 = new Tim("IF16",2,7);
        System.out.println(t1.getNama()+"  win : "+t1.getWin());
        t1.win();
        System.out.println(t1.getNama()+"  win : "+t1.getWin());
        t1.setMember(p1);
        t1.setMember(p2);
        t1.setMember(p3);
        System.out.println(t1.getMember(11).getNama());
        System.out.println(t1.getMember(10).getNama());
        t1.addTimLawan(t2); 
        System.out.println(t1.getTimLawan(0).getNama());

        /*Klasemen k1 = new Klasemen(6,3);
                k1.addPeserta(t1);
                k1.addPeserta(t2);
                k1.addPeserta(t3);
                System.out.println(k1.getPeserta(0,0).getNama());
                System.out.println(k1.getPeserta(0,1).getNama());
                System.out.println(k1.getPeserta(1,0).getNama());
                //System.out.println(k1.getPeserta(1,2).getNama());
                Pertandingan P1 =new Pertandingan("FUTsal",6,3);
                P1.addPeserta(t1);
                P1.addPeserta(t2);
                P1.addPeserta(t3);
                P1.addPeserta(t4);
                P1.addPeserta(t5);
                P1.addPeserta(t6);
                System.out.println(P1.getPeserta(0,0).getNama());

                P1.setMatch();*/
    }		
}