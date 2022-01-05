// Jonatan Meyer, Mini-assignment 6: Animal Guessing Game. 05/11-2020
package com.company;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        String[] Dyr = {"Due", "Mink", "Guldfisk", "Abe", "Hest"};
        // Et array med et med mine fem dyr.

        String[] Sporgsmaal = {"Kan dyret flyve?", "Skal der aflives 12 millioner af dem?", "Har den gæller?", "Svinger dyret i træer?", "Kan man ridde på dyret?"};
        // Et array med mine fem spørgsmål.

        String[] DyrSvar = {"ynnnn", "nynnn", "nnynn", "nnnyn", "nnnny"};
        // Et array med de fem forskellige svar kombinationer. Bruger kun det første bogstav i bruger inputtet.

        String BrugerSvar = "";
        // En tom string, som gør plads til brugerinput.

        System.out.println("Hej, velkommen til mit Animal Guessing Game!");
        System.out.println("I dette Spil, skal du tænke på et dyr, som computeren så vil prøve at gætte! ;)");
        System.out.println("Du kan vælge mellem disse dyr: Due, Mink, Guldfisk, Abe og Hest");
        System.out.println("Computeren vil nu komme med et Spørgsmål, hvor du bare skal svare Yes eller No ");
        // Ovenstående 4 linjer, fortæller brugeren, hvad spillet går ud på.

        int Tal1 = 0;

        int Tal2 = 0;
        // De ovenstående to ints fungerer som tællere, længere nede i koden.


        Boolean Igang = true;
        // For at starte et while loop.

        Scanner sc = new Scanner(System.in);
        // Starter scanneren.

        while (Igang) {
            if (BrugerSvar.length() < 5) {
            // Hvis BrugerSvar er mindre end 5, udfører programmet det nedenstående.

                System.out.println(Sporgsmaal[Tal2]);
                // Programmet printer det første spørgsmål til brugeren.

                char SvarBogstav = sc.next().charAt(0);
                BrugerSvar = BrugerSvar + SvarBogstav;
                // Bruger inputtet bliver scannet og inputtet bliver tilføjet til variablen BrugerSvar.


                Tal2++;
                // Tælleren stiger med en, så længe Brugersvar er mindre end 5
            }
            if (BrugerSvar.length() > 4) {
            // Hvis BrugerSvar er større end 4.

                if (BrugerSvar.equals(DyrSvar[Tal1])) {
                    System.out.println("Dit Dyr er: "+Dyr[Tal1]);
                    System.out.println("Tak for at du gad at spille med, der er heldigvis ingen Rick Roll i denne omgang.");
                    // Hvis BrugerSvar er det samme som DyrSvar, printer programmet det ovenstående.

                    Igang = false;
                    // Igang bliver false, og stopper dermed while loopet.
                } else {
                    Tal1++;
                    // Hvis BrugerSvar ikke er større end 4, bliver Tal1 1 større, og loopet starter forfra.
                }

            }

        }

    }
}
