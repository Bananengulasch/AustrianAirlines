import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class Angebot extends Rabattstrategie{

	private double regulärpreis;
	private GregorianCalendar flugdatum;
	private String flugnummer;
	
	public Angebot(double regulärpreis, GregorianCalendar flugdatum, String flugnummer) {
		super();
		this.regulärpreis = regulärpreis;
		this.flugdatum = flugdatum;
		this.flugnummer = flugnummer;
	}

	private void rabattstrategiewählen() {
		
	}
	
	public double getRegulärpreis() {
		return regulärpreis;
	}

	public void setRegulärpreis(double regulärpreis) {
		this.regulärpreis = regulärpreis;
	}

	public GregorianCalendar getFlugdatum() {
		return flugdatum;
	}

	public void setFlugdatum(GregorianCalendar flugdatum) {
		this.flugdatum = flugdatum;
	}

	public String getFlugnummer() {
		return flugnummer;
	}

	public void setFlugnummer(String flugnummer) {
		this.flugnummer = flugnummer;
	}
	
	@Override
	public String toString() {
		return null;
		
	}
	
	@Override
	public double getReduzierterPreis(double regulärpreis) {


		flugdatum = new GregorianCalendar();
		SimpleDateFormat format = new SimpleDateFormat("MMMM");
		format.format(flugdatum);
		
		return 0;
	}
	
	public enum Strategie {

		MaxiDiscount,
		MidiDiscount,
		ZeroDiscount
		
	}
	
}
