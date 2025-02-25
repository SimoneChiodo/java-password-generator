package org.lessons.java.security;

// Import Scanner
import java.util.Scanner;

public class PasswordGenerator {
  public static void main(String[] args) {
    // Create Scanner
    Scanner input = new Scanner(System.in);

    // Create and Initialize User Variables
    System.out.println("Inserisci il tuo nome: ");
    String nome = input.nextLine();;
    System.out.println("Inserisci il tuo cognome: ");
    String cognome = input.nextLine();
    System.out.println("Inserisci il tuo colore preferito: ");
    String colore = input.nextLine();
    System.out.println("Inserisci il giorno in cui sei nato: ");
    int giorno = input.nextInt();
    System.out.println("Inserisci il mese in cui sei nato: ");
    int mese = input.nextInt();
    System.out.println("Inserisci l'anno in cui sei nato: ");
    int anno = input.nextInt();
    

    // Create Password
    String password = nome + "-" + cognome + "-" + colore + "-" + (giorno+mese+anno);

    // Print Password
    System.out.println("La tua password personalizzata e': \n" + password);
  }
}

// Esempio:
// Pinco-Pallo-magenta-2011