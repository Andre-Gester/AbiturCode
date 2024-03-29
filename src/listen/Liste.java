/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
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
}

