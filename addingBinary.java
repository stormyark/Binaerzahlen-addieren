import java.util.Scanner;

public class addingBinary {

  static String Eingabe1;
  static int stelle;
  static String Eingabe2;
  static int stelle2;
  static String ziffer;
  static int Ergebnis;
  static String eins;
  static String nuel;

  public static void main(String[] args) {
    Scanner TeilEingabe1 = new Scanner(System.in) ;
    System.out.print("Geben Sie die erste Binaerzahl ein: ");
    String Eingabe1 = TeilEingabe1.nextLine();
    
    Scanner TeilEingabe2 = new Scanner(System.in) ;
    System.out.print("Geben Sie die zweite Binaerzahl ein: ");
    String Eingabe2 = TeilEingabe2.nextLine();
    
    Ergebnis = 0;
    
    stelle = 1;
    for (int i = Eingabe1.length() -1; i >= 0; i=i-1) {
      if (i <= Eingabe1.length() -2) {
        stelle = stelle*2;
      }
      ziffer=Eingabe1.charAt(i)+"";
      if (ziffer.equals("1")) {
        Ergebnis += stelle;
      }
    }
    
    stelle2 = 1;
    for (int i = Eingabe2.length() -1; i >= 0; i=i-1) {
      if (i <= Eingabe2.length() -2) {
        stelle2 = stelle2*2;
      }
      ziffer=Eingabe2.charAt(i)+"";
      if (ziffer.equals("1")) {
        Ergebnis += stelle2;
      }
    }
    
    System.out.println("Die Summe der Binär-Zahlen beträgt: "+Ergebnis);
    
  }
}
