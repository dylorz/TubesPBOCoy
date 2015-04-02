public class Pemain{
	private String nama,posisi;
	private int noPunggung, jumlahGoal;

	public Pemain(String nama,int noPunggung,String posisi){
		this.nama = nama;
		this.noPunggung = noPunggung;
		this.posisi = posisi;
	}
	//getter
	public String getNama(){
		return nama;
	}
	public String getPosisi(){
		return posisi;
	}
	public int getNoPunggung(){
		return noPunggung;
	}
	public int getJumlahGoal(){
		return jumlahGoal;
	}
	//setter
	public void setJumlahGoal(int jumlahGoal){
		this.jumlahGoal = jumlahGoal;
	}
	public String toString(){
		return "nullExceptionLoh!!!";
	}
}