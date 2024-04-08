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
    public LE hintenEinfRek(Inhalt i){
    next = next.hintenEinfRek(i);
    return this;   
    }   
    
    
    /*Wenn der Inhalt dieses Knoten eine höhere Zahl hat als der neue Inhalt, dann 
    wird ein neuer Knoten genau vor diesem Knoten erzeugt und returned.
    Jeder setzt dass, was er zurückbekommt, als next und gibt sich selbst
    zurück.
    */
    @Override
    public LE sortiertEinfRek(Inhalt i){
        if (this.data.getDatavar3()>i.getDatavar3()){   
            return new Knoten(i,this);              
        }                                               
        next = next.sortiertEinfRek(i);                
        return this;                                    
        
    }
    
    
    /*¯\_(ツ)_/¯ einfach rekursiv durchlaufen
    */
    @Override
    public void ausgabeRek(){
        /*this.*/data.ausgeben();
        next.ausgabeRek();
    }


    /*Jeder Knoten muss schauen ob er selbst der gesuchte Inhalt ist, wenn dies der Fall ist soll
    der Knoten, statt sich selbst, seinen next zurückgeben, damit der Knoten selbst aus der Liste
    genommen wird. 
    */
    @Override
    public LE loeschenGRek(Inhalt i){
        if (/*this.*/data.equals(i)){
            i.ausgeben();
            System.out.print(" wurde gelöscht");
            return next;
        }
        return this;
    }
    

//getter und setter
    public Inhalt getData() {
        return data;
    }

    public void setData(Inhalt data) {
        this.data = data;
    }

    @Override
    public LE getNext() {
        return next;
    }

    public void setNext(LE next) {
        this.next = next;
    }
}
