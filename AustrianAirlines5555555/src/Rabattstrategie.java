import java.util.GregorianCalendar;

public abstract class Rabattstrategie {

	private String bezeichnung;

	
	
	public String getBezeichnung() {
		return bezeichnung;
	}

	public void setBezeichnung(String bezeichnung) {
		this.bezeichnung = bezeichnung;
	}

	
	public abstract double getReduzierterPreis(double regulärpreis);
	
	
}
