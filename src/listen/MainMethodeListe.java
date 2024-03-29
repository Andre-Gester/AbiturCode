/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listen;

public class MainMethodeListe {
    
    public static void main(String[] args){
         Liste liste1 = new Liste();
         Inhalt i1 = new Inhalt(1, "Shimamura", 481);
         Inhalt i2 = new Inhalt(2, "Adachi", 1024);
         Inhalt i3 = new Inhalt(4, "Makoto", 1615);
         Inhalt i4 = new Inhalt(7, "Miyake", 887);
         Inhalt i5 = new Inhalt(5, "MaoMao", 10640);
         Inhalt i6 = new Inhalt(14, "Frieren", 18344);
         Inhalt i7 = new Inhalt(8, "Thorfinn", 26876);
         Inhalt i8 = new Inhalt(3, "Altair", 1569);
         Inhalt i9 = new Inhalt(10, "Riko", 979);
         Inhalt i10 = new Inhalt(15, "Fern", 3374);
         Inhalt i11 = new Inhalt(0, "Jinshi", 625);
         Inhalt i12 = new Inhalt(12, "Himmel", 1222);
         Inhalt i13 = new Inhalt(6, "Madoka", 8043);
         Inhalt i14 = new Inhalt(9, "Odokawa", 1319);
         Inhalt i15 = new Inhalt(13, "Thors", 1171);
         Inhalt i16 = new Inhalt(12, "Stark", 1263);
        Inhalt[] helparray0 = new Inhalt[16];
        helparray0[0] = i1;
        helparray0[1] = i2;
        helparray0[2] = i3;
        helparray0[3] = i4;
        helparray0[4] = i5;
        helparray0[5] = i6;
        helparray0[6] = i7;
        helparray0[7] = i8;
        helparray0[8] = i9;
        helparray0[9] = i10;
        helparray0[10] = i11;
        helparray0[11] = i12;
        helparray0[12] = i13;
        helparray0[13] = i14;
        helparray0[14] = i15;
        helparray0[15] = i16;
        for(int i = 0; i<helparray0.length; i++){
            liste1.sortierteinf(helparray0[i]);
        }
        liste1.ausgabe();
        
    }
}
