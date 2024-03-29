
package binaerbaum;

public abstract class BE { //BE für Baumelement
    
    
    /* Wenn ein Abschluss aufgerufen wird, dann gibt dieser einen neuen Knoten
    zurück, welcher dann an der richtigen Stelle eingefügt ist.
    */
    public BE sortierteinfrek(Inhalt i){
        return new Knoten(i);
    }
    
    
    /* Beim ausgeben soll der Abschluss nichts machen
    */
    public void ausgebenrek(){
        
    }
    
    
    /* Abschlüsse sollen nicht gezählt werden
    */
    public int anzahlrek(){
        return 0;
    }
    
    
    /*Wenn ein Abschluss angesprochen wird, dann soll eine Fehlermeldung kommen, 
    da dies nur der Fall ist wenn es keinen Inhalt mit dem Kriterium gibt.
    */
    public Inhalt suchenrek(int krit){
        System.out.println("Error: Not Found");
        System.out.println("Inhalt nicht gefunden");
        return null;
    }
    
    
    public double minBrek(){
        return 2000000000;//2Milliarden, damit der Abschluss immer größer ist
    }
    public double maxBrek(){
        return -2000000000;//-2Milliarden, damit der Abschluss immer kleiner ist
    }
    
    /* return 0 damit der Abschluss nicht gezählt wird
    */
    public int laengsterAstRek(){
        return 0;
    }
    public int kuerzesterAstRek(){
        return 0;
    }
   
    
    
}
