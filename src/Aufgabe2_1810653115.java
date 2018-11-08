public class Aufgabe2_1810653115
{
    public static void main (String[] args)
    {
        String bezeichnung;                // Zeichen Null ... 2147483647 Zeichen
        int preis;                         // Ganzzahl -2147483647 ... 2147483647
        double preisExclSteuer;            // Kommazahl 4,9 * 10 hoch -324 ... 1,8 * 10 hoch 308
        boolean verkauft;                  // Ganzzahl true ... false
        long fahrgestellnummer;            // Ganzzahl -9223372036854775808 ... 9223372036854775808
        char gehalt;                       // Ganzzahl 0 ... 65535
        byte lagernd;                      // Ganzzahl -128 ... 128
        short PS;                          // Ganzzahl -32768 ... 32768
        float wert9;                       // Kommazahl 1,4 * 10 hoch -45 ... 1,8 * 10 hoch 38

        bezeichnung = "Audi";
        preis = 143300;
        preisExclSteuer = 119416.67;
        verkauft = true;
        fahrgestellnummer = 1230758913;
        gehalt = 23400;
        lagernd = 14;
        PS = 240;
        //nachgestellt f, da Compiler meint es handelt sich um einen dobule-Wert -> 32 Bit float und nicht 64 Bit double
        wert9 = 1298461892.123231f;

        final int KONSTANTE_INT = 218;
        /* Eine Konstante wird einmalig angelegt und kann nicht mehr geändert werden
        Variablen können weiterhin abgeändert werden. z.B: von 218 zu 300 */
    }
}