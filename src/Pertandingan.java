class Pertandingan {
	private String nama;
	Klasemen k;

	public Pertandingan(String nama, int nTim, int nGroup){
		this.nama = nama;
	}
	public void setMatch(){
		Tim[][] group=k.getGroup();
		int nGroup=k.getnGroup();
		int nTim=k.getnTiminGroup();
		for (int i=0; i<nGroup; i++){
			System.out.println("Group :"+i);
			for(int j=0;j<nTim; j++){
				for (int l=j+1; l<nTim; l++){
					System.out.println(" TIm  "+group[i][j].getNama()+" VS "+group[i][l].getNama());
				}
			}
		}
	}

	public void setHasilPertandingan(Tim tim1, Tim tim2, int scoreTim1, int scoreTim2){
		boolean match = true;
		if(tim1.getGroup() == tim2.getGroup()){
			for (int i=0; i<tim1.getNTimLawan(); i++) {
				if(tim1.getTimLawan(i)==tim2){
					match = false;
				}
			}
			if(match){
				tim1.addTimLawan(tim2);
				tim2.addTimLawan(tim1);
				if(scoreTim1>scoreTim2){
					tim1.win();tim2.lose();
				}else if(scoreTim1<scoreTim2){
					tim1.lose();tim2.win();
				}else{
					tim1.draw();tim2.draw();
				}
			}
		}
	}
	public void addPeserta(Tim p) {
		k.addPeserta(p);
	}
	public Tim getPeserta(int x,int y){
		 return k.getPeserta(x,y);
	}
	public void setKnockOutMatch(){

	}

	public String toString(){
		return "nullExceptionLoh!!!";
	}
}