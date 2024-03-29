/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listen;


public class Knoten extends LE {

    private Inhalt data;
    private LE next = new Abschluss();
    public Knoten(Inhalt d, LE n)
    {
    data = d;
    next = n;
    }
    
    
    /*rekursiv durchlaufen, wobei was zurückkommt zu next wird und jeder Knoten
    sich selbst zurückgibt.
    */
    @Override
    public LE hinteneinfrek(Inhalt i){
    next = next.hinteneinfrek(i);
    return this;   
    }   
    
    
    /*Wenn der Inhalt dieses Knoten eine höhere Zahl hat als der neue Inhalt, dann 
    wird ein neuer Knoten genau vor diesem Knoten erzeugt und returned.
    Jeder setzt dass, was er zurückbekommt, als next und gibt sich selbst
    zurück.
    */
    @Override
    public LE sortierteinfrek(Inhalt i){
        if (this.data.getDatavar3()>i.getDatavar3()){   
            return new Knoten(i,this);              
        }                                               
        next = next.sortierteinfrek(i);                
        return this;                                    
        
    }
    
    
    /*¯\_(ツ)_/¯ einfach rekursiv durchlaufen
    */
    @Override
    public void ausgaberek(){
        /*this.*/data.ausgeben();
        next.ausgaberek();
    }
    
    

//getter und setter
    public Inhalt getData() {
        return data;
    }

    public void setData(Inhalt data) {
        this.data = data;
    }

    public LE getNext() {
        return next;
    }

    public void setNext(LE next) {
        this.next = next;
    }
}
