import java.io.*;
public class SuurinPienin
{
  public static void main(String[] args)
  {
    int luku1, luku2, luku3, suurin, pienin;
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    try {
      System.out.print("Syötä ensimmäinen kokonaisluku: ");
      luku1 = Integer.parseInt(in.readLine());

      System.out.print("Syötä toinen kokonaisluku: ");
      luku2 = Integer.parseInt(in.readLine());

      System.out.print("Syötä kolmas kokonaisluku: ");
      luku3 = Integer.parseInt(in.readLine());

      suurin = suurin(luku1, luku2, luku3);
      pienin = pienin(luku1, luku2, luku3);

      System.out.print("Syöttämistäsi luvuista suurin oli " +suurin);
      System.out.print(" ja pienin " +pienin + "\n");
    }
    catch(Exception e){
      System.out.print("Antamasi syöte on virheellinen...");
    }
  }

//  Tähän kirjoitetaan metodit suurin() ja pienin()!!!
//  Metodit kirjoitetaan alapuolen tekstikenttään.

  public static int suurin(int numero1, int numero2, int numero3){
    int suurin_luku;

    if(numero1>numero2 && numero1>numero3){
        suurin_luku = numero1; 
    }
    else if(numero2>numero1 && numero2>numero3){
        suurin_luku = numero2;
    }
    else {
        suurin_luku = numero3;
    }
    return suurin_luku;
  }

  public static int pienin(int numero1, int numero2, int numero3){
    int pienin_luku;

    if(numero1<numero2 && numero1<numero3){
        pienin_luku = numero1; 
    }
    else if(numero2<numero1 && numero2<numero3){
        pienin_luku = numero2;
    }
    else {
        pienin_luku = numero3;
    }

    return pienin_luku;
  }
}