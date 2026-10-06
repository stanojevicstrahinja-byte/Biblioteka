package biblioteka;

public class Test {

	public static void main(String[] args) {

		Knjiga k1 = new Knjiga();
		Knjiga k2 = new Knjiga("Na Drini cuprija", "Ivo Andric");
		Knjiga k3 = new Knjiga("Prokleta avlija", "Ivo Andric", 1954, 120, 890.0);

		k1.prikaziPodatke();
		k2.prikaziPodatke();
		k3.prikaziPodatke();

		k1.setNaslov("Dervis i smrt");
		k1.setAutor("Mesa Selimovic");
		k1.setGodinaIzdanja(1966);
		k1.setBrojIzdanja(480);
		k1.setCena(1250.0);

		k1.prikaziPodatke();

		k2.setCena(-300);
		k2.setGodinaIzdanja(3000);

		k2.prikaziPodatke();

		System.out.println("Naslov: " + k3.getNaslov() + ", cena: " + k3.getCena());

		System.out.println("Cena jedne knjige: " + k3.izracunajCenu());
		System.out.println("Cena za 5 primeraka: " + k3.izracunajCenu(5));
		System.out.println("Cena za 5 primeraka sa 10% popusta: " + k3.izracunajCenu(5, 10));


	}

}