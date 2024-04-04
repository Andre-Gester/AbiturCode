/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package graphen;

/*Man könnte auch noch Knoten als mittlere Instanz verwenden, aber dies lohnt sich
bei Graphen wahrscheinlich nicht, da alle Methoden vollständig in der Graph Klasse
implementiert werden
*/
public class Inhalt {
    private String a;
    private double b;

    public Inhalt(String aa, double bb){
        a =aa;
        b=bb;
    }
    
    public void ausgeben(){
        System.out.println(a);
    }
    
    
    
    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

}
