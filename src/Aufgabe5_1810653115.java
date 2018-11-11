public class Aufgabe5_1810653115
{
    public static void main(String[] args)
    {
        //Erstellen von zwei Variablen vom Typ Integer und zuweisen von Werten
        int zahl1 = 5;
        int zahl2 = 2;

        //Inkrementieren der beiden Variablen
        System.out.println(zahl1++);
        System.out.println(zahl2++);

        //Ausgabe der beiden Variablen
        System.out.println(zahl1);
        System.out.println(zahl2);

        //Inkrementieren der beiden Variablen
        System.out.println(++zahl1);
        System.out.println(++zahl2);

        //Ausgabe der beiden Variablen
        System.out.println(zahl1);
        System.out.println(zahl2);

        /*
        zahl1++ = Zuerst wird die Zahl ausgegeben und im Anschluss inkrementiert (um 1 erhöhrt)
        ++zahl1 = Zuerst wird die Zahl inkrementiert und im Anschluss ausgegeben

        Bsp: zahl1 = 0
        zahl1++ -> Ausgabe 0 und dann Inkrementierung
        ++zahl1 -> Inkrementierung vor Ausgabe -> Ausgabe 1
         */

    }
}
