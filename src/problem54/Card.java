package problem54;

public class Card implements Comparable<Card> {
	
	public enum Farbe {C,S,H,D};
	
	private int zahl;
	private Farbe farbe;
	
	public Card(int zahl, Farbe farbe) {
		this.zahl = zahl;
		this.farbe = farbe;
	}
	
	@Override
	public String toString() {
		return "Card [zahl=" + zahl + ", farbe=" + farbe + "]";
	}

	public static int parseZahl(String temp) {
		if(temp.equals("2")) {
			return 2;
		} else if(temp.equals("3")) {
			return 3;
		} else if(temp.equals("4")) {
			return 4;
		} else if(temp.equals("5")) {
			return 5;
		} else if(temp.equals("6")) {
			return 6;
		} else if(temp.equals("7")) {
			return 7;
		} else if(temp.equals("8")) {
			return 8;
		} else if(temp.equals("9")) {
			return 9;
		} else if(temp.equals("T")) {
			return 10;
		} else if(temp.equals("J")) {
			return 11;
		} else if(temp.equals("Q")) {
			return 12;
		} else if(temp.equals("K")) {
			return 13;
		} else {
			return 14;
		}
	}

	public int getZahl() {
		return zahl;
	}

	public Farbe getFarbe() {
		return farbe;
	}

	@Override
	public int compareTo(Card o) {
		if(PokerHands.getPh().sortierungFarbe) {
			return ((Integer)zahl).compareTo(o.zahl);
		} else {
			return -1;
		}
	}

}