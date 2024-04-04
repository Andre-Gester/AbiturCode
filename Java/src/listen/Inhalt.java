/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listen;

/**
 *
 * @author andre
 */
public class Inhalt {
    private int datavar1;
    private String datavar2;
    private long datavar3;
    
public Inhalt(int a, String b, long c){ //Konstruktor der einen int, String und long braucht
    datavar1 = a;
    datavar2 = b;
    datavar3 = c;
}
public void ausgeben(){
    System.out.println("Id: "+datavar1+" Name: "+datavar2+" MAL Favoriten: "+ datavar3);
}



//getter und setter
    public int getDatavar1() {
        return datavar1;
    }

    public void setDatavar1(int datavar1) {
        this.datavar1 = datavar1;
    }

    public String getDatavar2() {
        return datavar2;
    }

    public void setDatavar2(String datavar2) {
        this.datavar2 = datavar2;
    }

    public long getDatavar3() {
        return datavar3;
    }

    public void setDatavar3(long datavar3) {
        this.datavar3 = datavar3;
    }

   }