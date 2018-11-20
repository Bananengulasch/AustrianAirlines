import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Angebot extends Rabattstrategie{

	private double regulärpreis;
	private GregorianCalendar flugdatum;
	private String flugnummer;
	private Rabattstrategie strategie;
	
	public Angebot(double regulärpreis, GregorianCalendar flugdatum, String flugnummer) {
		super(flugnummer);
		this.regulärpreis = regulärpreis;
		this.flugdatum = flugdatum;
		this.flugnummer = flugnummer;
		rabattstrategiewählen();
		
	}

	@SuppressWarnings("deprecation")
	private void rabattstrategiewählen() {
//		Verwendungszweck vergessen
//		SimpleDateFormat format = new SimpleDateFormat("MMMM");
//		format.format(flugdatum);
		switch (flugdatum.get(Calendar.MONTH)) {
		case 1:
		case 4:
		case 10:
			strategie = new Rabattstrategie("MaxiDiscount") {
				
				@Override
				public double getReduzierterPreis(double preis) {
					// TODO Auto-generated method stub
					return regulärpreis - (regulärpreis*preis);
				}
			};
			break;
		case 2:
		case 3:
			strategie = new Rabattstrategie("MidiDiscount") {
				
				@Override
				public double getReduzierterPreis(double preis) {
					// TODO Auto-generated method stub
					return regulärpreis - (regulärpreis*preis);
				}
			};
			break;
		default:
			strategie = new Rabattstrategie("ZeroDiscount") {
				
				@Override
				public double getReduzierterPreis(double preis) {
					// TODO Auto-generated method stub
					return regulärpreis;
				}
			};
			break;
		}
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
		
		StringBuilder string = new StringBuilder();
		string.append("---------------")
		.append("")
		.append("Angebot: "+flugnummer)
		.append("Preis: "+getReduzierterPreis(getRegulärpreis()))
		.append("")
		.append("---------------");
		return string.toString();
		
	}

	@Override
	public double getReduzierterPreis(double preis) {
		// TODO Auto-generated method stub
		return strategie.getReduzierterPreis(preis);
	}
	
}
