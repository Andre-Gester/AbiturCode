/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listen;

/**
 *
 * @author andre
 */
public abstract class LE {
    
    /* Wenn die Rekursion beim Abschluss ankommt gibt dieser einen neuen
    Knoten zurück, welcher den Abschluss "recycled" und als nächsten hat.
    Der neue Knoten wird dann durch den zuvor letzten Knoten als next benutzt.
    */
    public LE hinteneinfrek(Inhalt i){
        return new Knoten(i, this);
    }
    
    
    /*Leer damit Abschluss übersprungen wird
    */
    public void ausgaberek(){
    }
    
    
    /*Der Abschluss gibt einen Knoten mit dem neuen Inhalt zurück, welcher dann
    von dem letzten Knoten eingefügt wird.
    Der Abschluss wird nur aufgerufen wenn noch kein Knoten gefunden wurde, dessen
    Attribut größer ist als das des neuen Inhaltes.
    */
    public LE sortierteinfrek(Inhalt i){
        return new Knoten(i, this);
    }
}
