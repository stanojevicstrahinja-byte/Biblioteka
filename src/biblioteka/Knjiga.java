package biblioteka;

public class Knjiga {

	private String naslov;
	private String autor;
	private int godinaIzdanja;
	private int brojIzdanja;
	private double cena;

	public Knjiga() {
		this.naslov = "Nepoznato";
		this.autor = "Nepoznato";
		this.godinaIzdanja = 2000;
		this.brojIzdanja = 100;
		this.cena = 0.0;
	}

	public Knjiga(String naslov, String autor) {
		this.naslov = naslov;
		this.autor = autor;
		this.godinaIzdanja = 2000;
		this.brojIzdanja = 100;
		this.cena = 0.0;
	}

	public Knjiga(String naslov, String autor, int godinaIzdanja, int brojIzdanja, double cena) {
		this.naslov = naslov;
		this.autor = autor;
		this.godinaIzdanja = godinaIzdanja;
		this.brojIzdanja = brojIzdanja;
		this.cena = cena;
	}

	public String getNaslov() {
		return naslov;
	}

	public void setNaslov(String naslov) {
		if (naslov.equals("")) {
			System.out.println("Greska: naslov ne sme biti prazan.");
		} else {
			this.naslov = naslov;
		}
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		if (autor.equals("")) {
			System.out.println("Greska: autor ne sme biti prazan.");
		} else {
			this.autor = autor;
		}
	}

	public int getGodinaIzdanja() {
		return godinaIzdanja;
	}

	public void setGodinaIzdanja(int godinaIzdanja) {
		if (godinaIzdanja < 1450 || godinaIzdanja > 2026) {
			System.out.println("Greska: godina mora biti izmedju 1450 i 2026.");
		} else {
			this.godinaIzdanja = godinaIzdanja;
		}
	}

	public int getBrojIzdanja() {
		return brojIzdanja;
	}

	public void setBrojIzdanja(int brojIzdanja) {
		if (brojIzdanja <= 0) {
			System.out.println("Greska: broj strana mora biti veci od 0.");
		} else {
			this.brojIzdanja = brojIzdanja;
		}
	}

	public double getCena() {
		return cena;
	}

	public void setCena(double cena) {
		if (cena < 0) {
			System.out.println("Greska: cena ne moze biti negativna.");
		} else {
			this.cena = cena;
		}
	}

	public void prikaziPodatke() {
		System.out.println(naslov + " | " + autor + " | " + godinaIzdanja + " | " + brojIzdanja + " str. | " + cena + " din");
	}

	public double izracunajCenu() {
		return cena;
	}

	public double izracunajCenu(int kolicina) {
		return cena * kolicina;
	}

	public double izracunajCenu(int kolicina, double popustProcenat) {
		if (popustProcenat < 0 || popustProcenat > 50) {
			System.out.println("Greska: popust mora biti izmedju 0 i 50.");
			return cena * kolicina;
		} else {
			return cena * kolicina * (1 - popustProcenat / 100);
		}
	}

}