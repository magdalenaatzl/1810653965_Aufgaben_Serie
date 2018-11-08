package drittespackage;

public class Main {
    public static void main(String[]args)
    {
        String name = "Magdalena Atzl";
        int alter = 21;

        System.out.println(name);
        System.out.println(alter);

        //String fachhochschuleKufsteinTirol = "Fachhochschule Kufstein Tirol";
        String fhKufsteinTirol = "Fachhochschule Kufstein Tirol"; //neuer Variablenname
        System.out.println(fhKufsteinTirol);

        final String FH_KUFSTEIN_TIROL = "Fachhochschule Kufstein Tirol" ; //wurde auf final gesetzt
        System.out.println(FH_KUFSTEIN_TIROL);

        final String BEZEICHNER;

        ; //STRG+ALT+L rückt wieder zurück

        System.out.println("Java verwendet für Strings \"doppelte Anführungszeich\" und einzelne Anführungszeichen wie \'c\' um einzelne Zeichen zu definieren");
        System.out.println("Durch \\ kann mann auch den Backslash selbst beliebig oft ausgeben:\\\\\\");
        System.out.println("Ich verwende den \b Backspace, die Newline \n und den \t Tabulator");
        System.out.println("Durch den Wagenrücklauf wird die Zeile zurückgesetzt und der Teil nach dem \r überschreibt die bestehende Zeile. \f ist in der Konsole nicht bemerkbar, da es einen Seitenumbruch erzwingt");


    }
}
