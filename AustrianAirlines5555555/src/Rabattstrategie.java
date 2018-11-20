public abstract class Rabattstrategie {

	public Rabattstrategie(String bezeichnung) {
		super();
		this.bezeichnung = bezeichnung;
	}

	private String bezeichnung;

	
	
	public String getBezeichnung() {
		return bezeichnung;
	}

	public void setBezeichnung(String bezeichnung) {
		this.bezeichnung = bezeichnung;
	}
	
	public abstract double getReduzierterPreis(double preis);
}
