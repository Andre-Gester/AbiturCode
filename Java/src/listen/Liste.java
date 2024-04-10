/*
Eine Liste ist eine besondere Form eines Baumes (/Graphens), bei welcher jeder Knoten maximal ein
Kind hat. Hierdurch ist eine Liste eine Art 'Reihe', in welcher Knoten nacheinander angeordnet sind.
Die Wurzel wird als erster bezeichnet. 
Wir kennen zwei besondere Formen der Datenstruktur Liste:
    1. Die Schlange, bei welcher hinten eingefügt wird und vorne gelöscht wird. First in, first out (FIFO)
    2. Der Stapel, bei welchem vorne eingefügt wird und vorne gelöscht wird. First in, last out (FILO)
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
        erster = erster.hintenEinfRek(i);
        System.out.println("Objekt Nr."+i.getDatavar1()+ " wurde hinten eingefuegt");
    }
    
    
    /*Sortiert Einfügen durch konditionelle Rekursion, also Rekursion nur dann wenn
    etwas (nicht) erfüllt ist. Hier mit Notiz das sortiert eingefügt wurde.
    */
    public void sortierteinf(Inhalt i){     //Sortierungskriterium dritte Variable
        erster = erster.sortiertEinfRek(i);
        System.out.println("Objekt Nr."+i.getDatavar1()+ " wurde sortiert eingefuegt");
    }
    
    
    /*Rekursiv die Liste durchlaufen
    */
    public void ausgabe(){
        erster.ausgabeRek();
    }

    
    public Inhalt suchen(int gesucht){
        return erster.suchenrek(gesucht);
    }
    
    
    /* Um den ersten zu löschen, erster ersetzen durch den next von ersten.
    Man darf allerdings nicht erster.getNext() schreiben, da diese Methode nicht auf
    LE anwendbar ist.
    Am einfachsten sollte es sein getNext() auch in LE zu implementieren, um diese zu
    verwenden, es bleibt allerdings fragwürdig ob dies eine sinnvolle Lösung ist.
    */
    public void loeschenErster(){
        erster = erster.getNext();
    }


    /* Um einen gesuchten Inhalt zu löschen kann man dem vorherigen Knoten sagen, dass dieser
    den übernächsten Knoten als next benutzen soll
    */
    public void loeschenGesucht(Inhalt g){
        erster = erster.loeschenGRek(g);
    }
}

