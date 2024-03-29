/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package binaerbaum;

/**
 *
 * @author andre
 */
public class Knoten extends BE{
    private Inhalt daten;
    private BE rechts;
    private BE links;
    
    public Knoten(Inhalt i){
        daten = i;
        rechts = new Abschluss();
        links = new Abschluss();
    }
    
    
//Methoden    
    /* Jeder Knoten schaut ob er selbst größer ist als der neue Inhalt
    wenn Knoten größer/Neu kleiner: links rekursiv
    wenn Knoten kleiner/Neu größer: rechts rekursiv
    Jeder Knoten gibt sich selbst zurück, damit dann der Knoten aus dem Abschluss
    an der richtigen Stelle eingefügt wird. 
    */
    @Override
    public BE sortierteinfrek(Inhalt i){
        if (i.getKriterium() < daten.getKriterium())
        {
            links = links.sortierteinfrek(i);
        }
        else{
            rechts = rechts.sortierteinfrek(i);
        }
        return this;
    }
    
    
    /*
    Wichtig ist die Reihenfolge für das ausgeben und die Rekursion zu beachten
    Pre Order z.B.
    daten.ausgabe();
    links.ausgebenrek();
    rechts.ausgebenrek();
    Möchte man ein Filterkriterium angeben, so kann man daten.ausgabe() in eine
    if-Bedinung z.B. if(isC()){daten.ausgabe();} schreiben.
    */
    @Override
    public void ausgebenrek(){
        links.ausgebenrek();
        this.daten.ausgabe();
        rechts.ausgebenrek();
    }
   
    
    /*Es wird InOrder traviert (Art der Traversierung ist egal)
    Zuesrt wird rechts rekursiv zurückgeben, dann 1 addiert für den Knoten selbst,
    dann links rekursiv zurückgegeben
    */
    @Override
    public int anzahlrek(){
        return rechts.anzahlrek() + 1 + links.anzahlrek();
    }
    
    
    /*Zuerst schaut der Knoten ob er selbst der richtige ist. Ist dies der Fall so gibt
    er seinen eigenen Inhalt zurück.
    Ist der eigene Inhalt größer als der gesuchte, so wird links gesucht (da alles was links
    ist kleiner ist)
    Sonst wird rechts gesucht.
    */
    @Override
    public Inhalt suchenrek(int krit){
        if(daten.getKriterium()==krit){
            return daten;
        }
        if (daten.getKriterium()>krit){
            return links.suchenrek(krit);
        }
        return rechts.suchenrek(krit);
    }
    
    
    /*neue Methode schreiben, welche die kleinere/größere Zahl zurückgibt und dann diese
    benutzen um die Rekursion rechts und links zu vergleichen. Man kann die Methode
    mehrmal ineinander verwenden, da sowieso die kleinste Zahl gewinnt.
    */
    public static double kleinere (double a,double b){
        if (a>b){
            return b;
        } return a;
    }
    public static double groessere (double a, double b){
        if (a>b){
            return a;
        } return b;
    }
    public double minBrek(){
        return kleinere(links.minBrek(),kleinere(rechts.minBrek(),this.daten.getB()));
    }
    public double maxBrek(){
        return groessere(links.maxBrek(), groessere(rechts.maxBrek(), this.daten.getB()));
    }
    
    
    /*Hier ist die Rekursion perfekt. 
    Wenn die Rekursion links größer ist nimmt man diese +1, wenn sie rechts größer
    ist nimmt man diese +1
    Easy.
    Die Rekursionsergebnisse speichern halbiert die Laufzeit.
    */
    @Override
    public int laengsterAstRek(){
        int lin = links.laengsterAstRek();
        int rec = rechts.laengsterAstRek();
        if (lin>rec){
            return lin+1;
        }
        return rec+1;
    }
    @Override
    public int kuerzesterAstRek(){
        int lin = links.kuerzesterAstRek();
        int rec = rechts.kuerzesterAstRek();
        if (lin<rec){
            return lin+1;
        }
        return rec+1;
    }
    }
