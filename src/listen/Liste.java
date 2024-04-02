/*
Eine Liste ist eine besondere Form eines Baumes (/Graphens), bei welcher jeder Knoten maximal ein
Kind hat. Hierdurch ist eine Liste eine Art 'Reihe', in welcher Knoten nacheinander angeordnet sind.
Die Wurzel wird als erster bezeichnet. 
Bei einer Liste wird hinten eingefügt und vorne gelöscht, wie es einer Warteschlange am Supermarkt
der Fall wäre. Analog hierzu wäre z.B. der Stapel, bei welchem vorne eingefügt und vorne gelöscht wird.
 */
package listen;

public class Liste {
    private LE erster;
   
    public Liste(){
        erster = new Abschluss();           //Initialisierung der Liste mit einem Abschluss,
                                            //damit diese nie leer ist.
    } 
    
    
    /*Ohne Rekursion
    */
    public void vorneeinf(Inhalt i){        //Aufruf Methode durch erster, welcher einen neuen Knoten mit Inhalt i und 
        erster = new Knoten(i, erster); //mit next = erster erzeugt
        System.out.println("Objekt Nr."+i.getDatavar1()+ " wurde vorne eingefuegt");
    }
    
    
    /*Duch Rekursion und hier mit Notiz das einegfügt wurde
    */
    public void hinteneinf(Inhalt i){
        erster = erster.hinteneinfrek(i);
        System.out.println("Objekt Nr."+i.getDatavar1()+ " wurde hinten eingefuegt");
    }
    
    
    /*Sortiert Einfügen durch konditionelle Rekursion, also Rekursion nur dann wenn
    etwas (nicht) erfüllt ist. Hier mit Notiz das sortiert eingefügt wurde.
    */
    public void sortierteinf(Inhalt i){     //Sortierungskriterium dritte Variable
        erster = erster.sortierteinfrek(i);
        System.out.println("Objekt Nr."+i.getDatavar1()+ " wurde sortiert eingefuegt");
    }
    
    
    /*Rekursiv die Liste durchlaufen
    */
    public void ausgabe(){
        erster.ausgaberek();
    }

    /* Um den ersten zu löschen, erster ersetzen durch erster.getNext();
    */
    public void loeschenErster(){
        erster = erster.getNext();
    }
}

