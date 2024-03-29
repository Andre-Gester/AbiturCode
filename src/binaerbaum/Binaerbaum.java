
package binaerbaum;
/*Die Hauptklasse eines von rechts aufsteigend sortierten Binärbaums, in welcher 
die Methoden gestartet werden. 
*/
public class Binaerbaum {
    private String ID;
    private BE wurzel;
    
public Binaerbaum(String i){
    ID = i;
    wurzel = new Abschluss();
}


//Methoden

/* Bei einem Binärbaum fügt man immer sortiert ein, damit die Charakteristik des schnellen
suchens immer verwenden kann. Hierfür sollen die Knoten schauen wie sie im Verhältnis zum 
neuen Inhalt stehen.
*/
public void sortierteinf(Inhalt i){ 
    wurzel = wurzel.sortierteinfrek(i);
    
}


/*Hierbei kann man den Baum verschieden durchlaufen (traversieren)
Optionen sind:
    In Order: So wie der Baum auch sortiert ist. Also links, wurzel, rechts
    Post Order: Wurzel, Links, Rechts
    Pre Order: Links, Rechts, Wurzel
*/
public void ausgeben(){ //IN ORDER
    wurzel.ausgebenrek();
}


/* Will man die Anzahl an Knoten/Inhalten zurückgeben, so muss man den Baum traversieren
und dabei entweder eine Zählvariable erhöhen oder rekursiv +1 zurückgeben. 
Mit +1 zurückgeben:
*/
public int anzahl(){
    return wurzel.anzahlrek();
}


/* Beim Suchen ist es wichtig die Charakteristik des Baumes zu benutzen, welche
ein extrem schnelles Suchen ermöglicht.
Hier wird der Inhalt zurückgegeben, welcher das gesuchte Kriterium hat
*/       
public Inhalt suchen(int krit){
    return wurzel.suchenrek(krit);
}        


/*will man min und max eines zweiten Kriteriums z.B. int b finden, so kann man sich eine neue
Methode schreiben, welche die kleinere von zwei Zahlen zurückgibt und diese dann
mit Rekursion verwenden. 
Die Idee ist vergleichbar mit laengsterAstRek()
*/
public double minB(){
    return wurzel.minBrek();
}
public double maxB(){
    return wurzel.maxBrek();
}


 /*Ein Baum ist ausbalanciert, wenn die Differenz zwischen dem längsten und 
    dem kürzesten Aste <=1 ist.
    Um eine Methode istAusbalanciert() zu schreiben sollte man also die Methoden
    längsterAst() und kürzesterAst() zuerst implementieren.
    Für längster/kürzester lässt sich die Rekursion sehr gut verwenden.
    */
    public int laengsterAst(){
        return wurzel.laengsterAstRek();
    }
    public int kuerzesterAst(){
        return wurzel.kuerzesterAstRek();
    }
    //Für Ausbalanciert() nur noch vergleichen. Ein if statement ist hier redundant
    public boolean istAusbalanciert(){
        return laengsterAst()-kuerzesterAst()<=1;
    }
}
