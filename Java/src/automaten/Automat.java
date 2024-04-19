
package automaten;

/*Automaen werden implementiert durch switch/case statements
Syntax:
    switch(<variable>) {
        case <zustand_variable>: <was passieren soll wenn variable == zustand variabel>;
        break;
    }
Characters mit '' einzelnen Strichen
Für einzelne Vergleiche ist eine if schneller. (switch case sind auch nur mehrer ifs)
*/
public class Automat {


    /* Implementierung des Automaten aus Abitur 2016 Teil III Aufgabe 4c)
    */
    private int zustand;

    private void charZustandAendern(char c)
        {
        switch (zustand){
            case 0:
                if(c.equals('D'){
                    zustand = 1;
                }
                break;
            case 1:
                switch (c){
                    case 'E': zustand = 2; break;
                    case ' ': zustand = 3; break;
                    case '-': zustand = 3; break;
                }
                break;
            case 2:
                switch (c){
                    case ' ': zustand = 3; break;
                    case '-': zustand = 3; break;
                }
                break;
            case 3:
                if(c.equals('B')){
                    zustand = 4;
                }
                break;
            case 4: 
                switch(c){
                    case 'Y': zustand = 5;
                    case 'W': zustand = 5;
                }
                break;
            case 5: 
                if (c.equals(' ')){
                    zustand = 6;
                }
                break;
            case 6: 
                switch (c){
                    case '0': zustand = 7; break;
                    case '1': zustand = 7; break;
                    }
                break;
                // etc. etc. für alle Zustände und Übergänge
        }
        }
boolean istWort(String wort)
    {
        zustand = 1;
        for (int i=0; i<w.length(); i++)
            {
                charZustandAendern(w.charAt(i));
            }
        return (zustand == 13);
    }                    
}
