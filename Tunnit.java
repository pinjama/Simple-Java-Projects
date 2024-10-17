import java.io.*;

/*Tee ohjelma, joka laskee tietyn ajanjakson aikana tehtyjen työtuntien määrän sekä tulostaa tuntien yhteismäärän,
keskimääräisen työpäivän pituuden ja syötetyt tunnit eriteltynä. Ohjelman tulee aluksi kysyä, 
kuinka monen työpäivän tiedot syötetään (max. 30 päivää). Tämän jälkeen ohjelma kysyy päivittäiset työtunnit. */

public class Tunnit {
    public static void main(String[] args) {
		int indeksit;
        double tyotunnit[] = new double[30];
        double tyotunnit_summa = 0;
        double keskimaarainen_tyopaiva;

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		try {
            System.out.println("Ohjelma laskee yhteen haluamasi ajanjakson aikana");
            System.out.println("tehdyt työtunnit sekä keskimääräisen työpäivän pituuden.");

            System.out.print("Kuinka monta päivää:");
            int tyopaivat = Integer.parseInt(in.readLine());

			for(indeksit=1; indeksit<=tyopaivat; indeksit++) {
				System.out.print("Anna " +indeksit +". päivän työtunnit: ");
				tyotunnit[indeksit] = Double.parseDouble(in.readLine());
                tyotunnit_summa = tyotunnit_summa + tyotunnit[indeksit];
			}

            keskimaarainen_tyopaiva = tyotunnit_summa / tyopaivat;

			System.out.println("Tehdyt työtunnit yhteensä: " + tyotunnit_summa);
            System.out.println("Keskimääräinen työpäivän pituus: " + keskimaarainen_tyopaiva);

            System.out.print("Syötetyt tunnit: ");

			for(indeksit=1; indeksit<=tyopaivat; indeksit++) {
				System.out.print(tyotunnit[indeksit] + " ");
			}
		} catch(Exception e) {
			System.out.print("Syötteesi oli virheellinen.");
		}
	}
    
}
