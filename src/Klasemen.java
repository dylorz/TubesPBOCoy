import java.util.Scanner;
class Klasemen{
	private int nGroup;
	private int nTim;
	private int nTimInGroup;
	private Tim[][] group;
        private Pertandingan[] tanding;
	public Klasemen(int nTim, int nGroup){
		this.nGroup = nGroup;
		this.nTim = nTim;
		nTimInGroup = (int)Math.ceil(nTim/nGroup);
		group = new Tim[nGroup][nTimInGroup];
                tanding=new Pertandingan[50];
                
	}

	public void addPeserta(Tim p){
		int idx=0;
		int group=0;
		while ((this.group[group][idx]!=null)) {
			idx++;
			if(idx==nTimInGroup){
				idx=0;
				group++;
			}
			if(group==nGroup){
				break;
			}
		}
		if(idx<nTimInGroup){
			this.group[group][idx] = p;
			this.group[group][idx].setGroup(group);
		}
	}
	public Tim getPeserta(int x,int y){
		return group[x][y];
	}
	public Tim[][] getGroup(){
		return group;
	}
	public int getnGroup(){
		return nGroup;
	}
	public int getnTim(){
		return nTim;
	}
	public int getnTiminGroup(){
		return nTimInGroup;
	}
	public String toString(){
		return "nullExceptionLoh!!!";
	}
}