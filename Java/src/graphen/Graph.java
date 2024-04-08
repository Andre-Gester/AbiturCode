package graphen;

/*
Graphen als Datenstrukture können als eine allgemeinere Form von Bäumen angesehen werden. 
Wie Bäume haben Graphen auch Knoten und Kanten. Es gibt allerdings keine Blätter oder Wurzel, da
kein Ende oder Anfang der Datenstruktur bestimmt ist.
    Knoten: Die Elemente, welche in einem Graphen miteinander verbunden sind.
    Kanten: Die Verbindungen zwischen den Knoten können eine Richtung (gerichteter Graph), und/oder
    einen Wert zugewisen haben (gewichteter Graph).
    
Zusammenhängend: Lässt sich jeder Knoten durch eine Kante erreichen so ist ein Graph zusammenhängend, 
es sei denn ein Knoten lässt sich nur aus einer Richtung (im Falle eines ungerichteten Graphen) erreichen.
In diesem Falle ist der Graph schwach-zusammenhängend.

Zyklisch: Lässt sich von einem Startknoten aus genau dieser Startknoten wieder erreichen, 
ohne dabei mehrmals die gleiche Kante 'benutzen' zu müssen, dann ist ein Graph zyklisch. 
(Bascially wenn man im Kreis gehen kann)
 */
public class Graph {
    
    private String identifier;
    /*Der Graph wird implementiert durch eine Adjazenzmatrix, in welcher vermerkt ist
    ob man/wie lange man braucht um von einem Inhalt zum nächsten zu gelangen. (boolean
    oder int Matrix)
    Es gibt zwei zentrale Attribute:
    1. Ein Array mit allen Inhalten. Hier werden alle Inhalte gespeichert und indirekt
    auch jedem Inhalt ein Index zugewisen.
    2. Die Adjazenzmatrix. Hier wird die Distanz/die Verbindung zwischen allen Inhalten
    (über deren Indexe) gespeichert.

    Hier: Ungeordnet, aber Gewichtet
    */
    private Inhalt[] arrayInhalt;
    private int[][]adj;
    
    //für die Tiefensuche
    private boolean[]besucht;
    
    /* Der Konstruktor soll eine ID und die anzahl an Inhalten übergeben bekommen.
    Mit anzahl erzeugt er die arrays und die Matrix.
    */
    public Graph(String ID, int anzahl){
        identifier = ID;
        arrayInhalt = new Inhalt[anzahl]; //erzeugt array mit Inhalten
        adj = new int[anzahl][anzahl]; //erzeugt adj
        for (int i=0;i<anzahl;i++){ 
            for(int j=0;j<anzahl;j++){
                adj[i][j]= -1;    //Auffüllen der adj durch doppele Schleife um alle zu erreichen
                                    // mit -1 um zu zeigen, dass keine Verbindung besteht
            }
        }
        besucht = new boolean[anzahl];
    }
    
    
    /*Um einen Inhalt einfügen den Inhalt und den Index übergeben und arrayInhalt an Index
    ändern.
    */
    public void einfuegen(Inhalt neu, int index){
        arrayInhalt[index]=neu;
    }
    
    
    /*Um die adj mit Werten zu füllen muss man zuerst die Indexe der Inhalte die man
    verbinden möchte kennen.
    Um den Index eines bestimmten Inhaltes (gesucht durch z.B. String a) zu finden 
    arrayInhalt mit einer Schleife durchlaufen
    Dann kann man die adj auffüllen an den Stellen mit den gefundenen Indexen
    */
    public int indexSuchen (String gesucht){
        for(int i=0;i<arrayInhalt.length; i++){
            if (arrayInhalt[i].getA().equals(gesucht)){
                return i;
            }
        }
        return -1; //-1 wenn nicht gefunden (für z.B. Fehlermeldung)
    }
    public void setAdj(String a1, String a2, int adjWert){
        int num1 = indexSuchen(a1); //Speichern um Rechenzeit zu halbieren
        int num2 = indexSuchen(a2);
        adj[num1][num2]= adjWert;
        adj[num2][num1]=adjWert;
    }
    
    
    /* Bei einer Tiefensuche wird jeder Inhalt in dem Graphen angesprochen/ausgegeben
    Hierfür wird:
    1. geschaut ob es eine Verbindung zwischen dem derzeitigen(start) und dem nächsten Inhalt
    in dem array gibt und ob dieser Inhalt schon besucht wurde.
    2. Gibt es eine Verbindung und wurde dieser noch nicht besucht, so wird die 
    Tiefensuche an diesem Inhalt rekursiv weitergeführt.
    3. So lange wiederholen bis alle Knoten besucht sind
    */ 
    public void tiefensuche(String start){
        for (int i=0;i<arrayInhalt.length;i++){
            besucht[i]=false;                 //besucht auf nur false initialisieren
        }
        int s = indexSuchen(start);
        tiefensucherek(s);
    }
    public void tiefensucherek(int index){
        arrayInhalt[index].ausgeben();      //sich selbst ausgeben
        besucht[index]=true;                //nach ausgeben als besucht markieren
        for(int i=0;i<arrayInhalt.length;i++){ //alle Inhalte prüfen
            if(adj[index][i]>0 && besucht[i]==false){ //Bedingungen: Verbindung und noch nicht besucht
                tiefensucherek(i);              //rekursion beim nächsten
            }
        }
    }
}
