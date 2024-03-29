/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package graphen;


public class MainMethodeGraph {
    
    public static void main(String[] args){
        Graph g1 = new Graph("2901",10);
        
        double[]arr = new double[10];
        for(int i=0;i<10;i++){
        arr[i]=Math.random();
        }
        
        Inhalt i1 = new Inhalt("Wolfratshausen", arr[0]); 
        Inhalt i2 = new Inhalt("Icking", arr[1]);
        Inhalt i3 = new Inhalt("Ebenhausen-Schaeftlarn", arr[2]);
        Inhalt i4 = new Inhalt("Hohenschaeftlarn", arr[3]);
        Inhalt i5 = new Inhalt("Baierbrunn", arr[4]);
        Inhalt i6 = new Inhalt("Buchenhain", arr[5]);
        Inhalt i7 = new Inhalt("Hoellriegelskreuth", arr[6]);
        Inhalt i8 = new Inhalt("Pullach", arr[7]);
        Inhalt i9 = new Inhalt("Grosshesselohe", arr[8]);
        Inhalt i10 = new Inhalt("Solln", arr[9]);
        
        g1.einfuegen(i1, 0);
        g1.einfuegen(i2, 1);
        g1.einfuegen(i3, 2);
        g1.einfuegen(i4, 3);
        g1.einfuegen(i5, 4);
        g1.einfuegen(i6, 5);
        g1.einfuegen(i7, 6);
        g1.einfuegen(i8, 7);
        g1.einfuegen(i9, 8);
        g1.einfuegen(i10, 9);
        
        g1.setAdj("Wolfratshausen", "Icking", 6);
        g1.setAdj("Icking", "Ebenhausen-Schaeftlarn", 4);
        g1.setAdj("Ebenhausen-Schaeftlarn", "Hohenschaeftlarn", 2);
        g1.setAdj("Hohenschaeftlarn", "Baierbrunn", 4);
        g1.setAdj("Baierbrunn", "Buchenhain", 2);
        g1.setAdj("Buchenhain", "Hoellriegelskreuth", 2);
        g1.setAdj("Hoellriegelskreuth", "Pullach", 1);
        g1.setAdj("Pullach", "Solln", 1);
        g1.setAdj("Wolfratshausen", "Solln", 20);
        g1.setAdj("Icking","Buchenhain",12);
        g1.setAdj("Hoellriegelskreuth","Ebenhausen-Schaeftlarn",10);
        
        g1.tiefensuche("Buchenhain");
    }
   
}
