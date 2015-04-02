class Tim{
	private String nama;
	private int win=0, lose=0, draw=0, idxMember=0, idxTimLawan=0, nMember=0, nTimLawan, group;
	private Tim[] timLawan;
	private Pemain[] member;

	public Tim(String nama,int nMember,int nTimLawan){
		this.nama = nama;
		this.nMember = nMember;
		this.nTimLawan = nTimLawan;
		member = new Pemain[nMember];
		timLawan = new Tim[nTimLawan];
	};
	//setter
	//hati hati ada kemungkinan array out of bound karena nMember tidak di set di konstruktor
	public void setMember(Pemain p) {
		if(idxMember <nMember) {
			member[idxMember++] = p;
		}
		else 
			System.out.println("TIM penuh");
	}
	public void addPemain(Pemain member){
		if(idxMember<nMember){
			this.member[idxMember++] = member;
		}
	}
	public void setGroup(int group){
		this.group = group;
	}
		//scoring
		public void win(){
			this.win++;
		}
		public void lose(){
			this.lose++;
		}
		public void draw(){
			this.draw++;
		}
	//getter
	public String getNama(){
		return nama;
	}
	public int getWin(){
		return win;
	}
	public int getLose(){
		return lose;
	}
	public int getDraw(){
		return draw;
	}
	public int getGroup(){
		return group;
	}
	public Pemain getMember(int noPunggung){
		int idx = 999;
		for (int i=0; i<idxMember; i++) {
			if(member[i].getNoPunggung()==noPunggung){
				idx = i;
			}
		}
		return member[idx];
	}
	public Tim getTimLawan(int idx){
		return timLawan[idx];
	}
	public int getNTimLawan(){
		return nTimLawan;
	}
	public int getNMember(){
		return nMember;
	}
	public int getPoint(){
		return (3*win+draw);
	}
	
	


	public void addTimLawan(Tim timLawan){
		if(idxTimLawan<nTimLawan){
			this.timLawan[idxTimLawan++] = timLawan;
		}
	}

	public String toSTring(){
		return "nullExceptionLoh!!!";
	}
}