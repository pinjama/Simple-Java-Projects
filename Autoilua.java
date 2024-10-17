import java.io.*;

class Ajoneuvo
{
   private int paino;
   private int huippunopeus;
   private int ajetut_kilometrit;

   Ajoneuvo(int paino, int huippunopeus, int ajetut_kilometrit)
   {
      this.paino = paino;
      this.huippunopeus = huippunopeus;
      this.ajetut_kilometrit = ajetut_kilometrit;
   }

   protected void aja(int ajettava_matka)
   {
      this.ajetut_kilometrit += ajettava_matka;
   }

   protected int anna_paino()
   {
      return this.paino;
   }

   protected int anna_huippunopeus()
   {
      return this.huippunopeus;
   }

   protected int anna_ajetut_kilometrit()
   {
      return this.ajetut_kilometrit;
   }
}

class Auto extends Ajoneuvo {
    
    String merkki;
    String malli;
    String rekisteri_nro;
    boolean kaynnissa;

    public Auto(int paino, int huippunopeus, int ajetut_kilometrit, String uusi_merkki, String uusi_malli, String uusi_rn, boolean uusi_kaynnissa){
        super(paino, huippunopeus, ajetut_kilometrit);
        this.merkki = uusi_merkki;
        this.malli = uusi_malli;
        this.rekisteri_nro = uusi_rn;
        this.kaynnissa = uusi_kaynnissa;

    }

    public void kaynnista(){
        kaynnissa = true;
    }

    public void sammuta() {
        kaynnissa = false;
    }

    public void katsasta() {
        System.out.println("Auton tiedot:");
        System.out.println("Merkki: " + merkki);
        System.out.println("Malli: " + malli);
        System.out.println("Ajokilometrit: " + anna_ajetut_kilometrit());
        System.out.println("Paino (kg): " + anna_paino());
        System.out.println("Huippunopeus (km/h): " + anna_huippunopeus());
        System.out.println("Rekisterinumero: " + rekisteri_nro);

        if (kaynnissa) {
            System.out.println("Auto on käynnissä");
        }

        else {
            System.out.println("Auto ei ole käynnissä");
        }
    }

}

public class Autoilua
{
   public static void main(String[] args)
   {

      BufferedReader lukija = new BufferedReader(new InputStreamReader(System.in));
      int paino, nopeus, km;
      String merkki, malli, rekkari;
      try
      {
         System.out.println("Anna auton merkki:");
         merkki = lukija.readLine();
         System.out.println("Anna auton malli:");
         malli = lukija.readLine();
         System.out.println("Anna auton rekisterinumero:");
         rekkari = lukija.readLine();
         System.out.println("Anna auton paino:");
         paino = Integer.parseInt(lukija.readLine());
         System.out.println("Anna auton huippunopeus:");
         nopeus = Integer.parseInt(lukija.readLine());
         System.out.println("Anna autolla ajetut kilometrit:");
         km = Integer.parseInt(lukija.readLine());
         System.out.println("\n");

         Auto autoX = new Auto(paino, nopeus, km, merkki, malli, rekkari, false);

         autoX.katsasta();
         autoX.kaynnista();
         autoX.aja(95);
         System.out.print("\n\n");

         autoX.katsasta();
      }
      catch (Exception e)
      {
         System.out.println("Virhetilanne!");
      }
   }
}
