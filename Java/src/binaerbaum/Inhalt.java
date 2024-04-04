/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package binaerbaum;

/**
 *
 * @author andre
 */
public class Inhalt {
    /*Beispielhafter Inhalt: Anatomische Daten von Katzen
    */
    private int kriterium; 
    private String sex; 
    private double b;//body weight in kg
    private double h;//heart weight in g
public Inhalt(int k, String s, double bw, double hw ){
    kriterium = k;
    sex = s;
    b = bw;
    h = hw;
}

public void ausgabe(){
    System.out.println("Kriterium: "+kriterium+" Sex: "+sex+" Koerpergewicht in kg: "+b+" Herzgewicht in g: "+h);
}

/*
Getter und Setter
*/
    public int getKriterium() {
        return kriterium;
    }

    public void setKriterium(int kriterium) {
        this.kriterium = kriterium;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

}
