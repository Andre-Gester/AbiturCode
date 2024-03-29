/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package binaerbaum;

/**
 *
 * @author andre
 */
public class MainMethodeBaum {

    public static void main(String[] args) {
        Binaerbaum Baum1 = new Binaerbaum("24561");
        Inhalt[] assistance = new Inhalt[144];
        assistance[0] = new Inhalt(1, "Female", 2, 7);
        assistance[1] = new Inhalt(2, "Female", 2, 7.4);
        assistance[2] = new Inhalt(3, "Female", 2, 9.5);
        assistance[3] = new Inhalt(4, "Female", 2.1, 7.2);
        assistance[4] = new Inhalt(5, "Female", 2.1, 7.3);
        assistance[5] = new Inhalt(6, "Female", 2.1, 7.6);
        assistance[6] = new Inhalt(7, "Female", 2.1, 8.1);
        assistance[7] = new Inhalt(8, "Female", 2.1, 8.2);
        assistance[8] = new Inhalt(9, "Female", 2.1, 8.3);
        assistance[9] = new Inhalt(10, "Female", 2.1, 8.5);
        assistance[10] = new Inhalt(11, "Female", 2.1, 8.7);
        assistance[11] = new Inhalt(12, "Female", 2.1, 9.8);
        assistance[12] = new Inhalt(13, "Female", 2.2, 7.1);
        assistance[13] = new Inhalt(14, "Female", 2.2, 8.7);
        assistance[14] = new Inhalt(15, "Female", 2.2, 9.1);
        assistance[15] = new Inhalt(16, "Female", 2.2, 9.7);
        assistance[16] = new Inhalt(17, "Female", 2.2, 10.9);
        assistance[17] = new Inhalt(18, "Female", 2.2, 11);
        assistance[18] = new Inhalt(19, "Female", 2.3, 7.3);
        assistance[19] = new Inhalt(20, "Female", 2.3, 7.9);
        assistance[20] = new Inhalt(21, "Female", 2.3, 8.4);
        assistance[21] = new Inhalt(22, "Female", 2.3, 9);
        assistance[22] = new Inhalt(23, "Female", 2.3, 9);
        assistance[23] = new Inhalt(24, "Female", 2.3, 9.5);
        assistance[24] = new Inhalt(25, "Female", 2.3, 9.6);
        assistance[25] = new Inhalt(26, "Female", 2.3, 9.7);
        assistance[26] = new Inhalt(27, "Female", 2.3, 10.1);
        assistance[27] = new Inhalt(28, "Female", 2.3, 10.1);
        assistance[28] = new Inhalt(29, "Female", 2.3, 10.6);
        assistance[29] = new Inhalt(30, "Female", 2.3, 11.2);
        assistance[30] = new Inhalt(31, "Female", 2.4, 6.3);
        assistance[31] = new Inhalt(32, "Female", 2.4, 8.7);
        assistance[32] = new Inhalt(33, "Female", 2.4, 8.8);
        assistance[33] = new Inhalt(34, "Female", 2.4, 10.2);
        assistance[34] = new Inhalt(35, "Female", 2.5, 9);
        assistance[35] = new Inhalt(36, "Female", 2.5, 10.9);
        assistance[36] = new Inhalt(37, "Female", 2.6, 8.7);
        assistance[37] = new Inhalt(38, "Female", 2.6, 10.1);
        assistance[38] = new Inhalt(39, "Female", 2.6, 10.1);
        assistance[39] = new Inhalt(40, "Female", 2.7, 8.5);
        assistance[40] = new Inhalt(41, "Female", 2.7, 10.2);
        assistance[41] = new Inhalt(42, "Female", 2.7, 10.8);
        assistance[42] = new Inhalt(43, "Female", 2.9, 9.9);
        assistance[43] = new Inhalt(44, "Female", 2.9, 10.1);
        assistance[44] = new Inhalt(45, "Female", 2.9, 10.1);
        assistance[45] = new Inhalt(46, "Female", 3, 10.6);
        assistance[46] = new Inhalt(47, "Female", 3, 13);
        assistance[47] = new Inhalt(48, "Male", 2, 6.5);
        assistance[48] = new Inhalt(49, "Male", 2, 6.5);
        assistance[49] = new Inhalt(50, "Male", 2.1, 10.1);
        assistance[50] = new Inhalt(51, "Male", 2.2, 7.2);
        assistance[51] = new Inhalt(52, "Male", 2.2, 7.6);
        assistance[52] = new Inhalt(53, "Male", 2.2, 7.9);
        assistance[53] = new Inhalt(54, "Male", 2.2, 8.5);
        assistance[54] = new Inhalt(55, "Male", 2.2, 9.1);
        assistance[55] = new Inhalt(56, "Male", 2.2, 9.6);
        assistance[56] = new Inhalt(57, "Male", 2.2, 9.6);
        assistance[57] = new Inhalt(58, "Male", 2.2, 10.7);
        assistance[58] = new Inhalt(59, "Male", 2.3, 9.6);
        assistance[59] = new Inhalt(60, "Male", 2.4, 7.3);
        assistance[60] = new Inhalt(61, "Male", 2.4, 7.9);
        assistance[61] = new Inhalt(62, "Male", 2.4, 7.9);
        assistance[62] = new Inhalt(63, "Male", 2.4, 9.1);
        assistance[63] = new Inhalt(64, "Male", 2.4, 9.3);
        assistance[64] = new Inhalt(65, "Male", 2.5, 7.9);
        assistance[65] = new Inhalt(66, "Male", 2.5, 8.6);
        assistance[66] = new Inhalt(67, "Male", 2.5, 8.8);
        assistance[67] = new Inhalt(68, "Male", 2.5, 8.8);
        assistance[68] = new Inhalt(69, "Male", 2.5, 9.3);
        assistance[69] = new Inhalt(70, "Male", 2.5, 11);
        assistance[70] = new Inhalt(71, "Male", 2.5, 12.7);
        assistance[71] = new Inhalt(72, "Male", 2.5, 12.7);
        assistance[72] = new Inhalt(73, "Male", 2.6, 7.7);
        assistance[73] = new Inhalt(74, "Male", 2.6, 8.3);
        assistance[74] = new Inhalt(75, "Male", 2.6, 9.4);
        assistance[75] = new Inhalt(76, "Male", 2.6, 9.4);
        assistance[76] = new Inhalt(77, "Male", 2.6, 10.5);
        assistance[77] = new Inhalt(78, "Male", 2.6, 11.5);
        assistance[78] = new Inhalt(79, "Male", 2.7, 8);
        assistance[79] = new Inhalt(80, "Male", 2.7, 9);
        assistance[80] = new Inhalt(81, "Male", 2.7, 9.6);
        assistance[81] = new Inhalt(82, "Male", 2.7, 9.6);
        assistance[82] = new Inhalt(83, "Male", 2.7, 9.8);
        assistance[83] = new Inhalt(84, "Male", 2.7, 10.4);
        assistance[84] = new Inhalt(85, "Male", 2.7, 11.1);
        assistance[85] = new Inhalt(86, "Male", 2.7, 12);
        assistance[86] = new Inhalt(87, "Male", 2.7, 12.5);
        assistance[87] = new Inhalt(88, "Male", 2.8, 9.1);
        assistance[88] = new Inhalt(89, "Male", 2.8, 10);
        assistance[89] = new Inhalt(90, "Male", 2.8, 10.2);
        assistance[90] = new Inhalt(91, "Male", 2.8, 11.4);
        assistance[91] = new Inhalt(92, "Male", 2.8, 12);
        assistance[92] = new Inhalt(93, "Male", 2.8, 13.3);
        assistance[93] = new Inhalt(94, "Male", 2.8, 13.5);
        assistance[94] = new Inhalt(95, "Male", 2.9, 9.4);
        assistance[95] = new Inhalt(96, "Male", 2.9, 10.1);
        assistance[96] = new Inhalt(97, "Male", 2.9, 10.6);
        assistance[97] = new Inhalt(98, "Male", 2.9, 11.3);
        assistance[98] = new Inhalt(99, "Male", 2.9, 11.8);
        assistance[99] = new Inhalt(100, "Male", 3, 10);
        assistance[100] = new Inhalt(101, "Male", 3, 10.4);
        assistance[101] = new Inhalt(102, "Male", 3, 10.6);
        assistance[102] = new Inhalt(103, "Male", 3, 11.6);
        assistance[103] = new Inhalt(104, "Male", 3, 12.2);
        assistance[104] = new Inhalt(105, "Male", 3, 12.4);
        assistance[105] = new Inhalt(106, "Male", 3, 12.7);
        assistance[106] = new Inhalt(107, "Male", 3, 13.3);
        assistance[107] = new Inhalt(108, "Male", 3, 13.8);
        assistance[108] = new Inhalt(109, "Male", 3.1, 9.9);
        assistance[109] = new Inhalt(110, "Male", 3.1, 11.5);
        assistance[110] = new Inhalt(111, "Male", 3.1, 12.1);
        assistance[111] = new Inhalt(112, "Male", 3.1, 12.5);
        assistance[112] = new Inhalt(113, "Male", 3.1, 13);
        assistance[113] = new Inhalt(114, "Male", 3.1, 14.3);
        assistance[114] = new Inhalt(115, "Male", 3.2, 11.6);
        assistance[115] = new Inhalt(116, "Male", 3.2, 11.9);
        assistance[116] = new Inhalt(117, "Male", 3.2, 12.3);
        assistance[117] = new Inhalt(118, "Male", 3.2, 13);
        assistance[118] = new Inhalt(119, "Male", 3.2, 13.5);
        assistance[119] = new Inhalt(120, "Male", 3.2, 13.6);
        assistance[120] = new Inhalt(121, "Male", 3.3, 11.5);
        assistance[121] = new Inhalt(122, "Male", 3.3, 12);
        assistance[122] = new Inhalt(123, "Male", 3.3, 14.1);
        assistance[123] = new Inhalt(124, "Male", 3.3, 14.9);
        assistance[124] = new Inhalt(125, "Male", 3.3, 15.4);
        assistance[125] = new Inhalt(126, "Male", 3.4, 11.2);
        assistance[126] = new Inhalt(127, "Male", 3.4, 12.2);
        assistance[127] = new Inhalt(128, "Male", 3.4, 12.4);
        assistance[128] = new Inhalt(129, "Male", 3.4, 12.8);
        assistance[129] = new Inhalt(130, "Male", 3.4, 14.4);
        assistance[130] = new Inhalt(131, "Male", 3.5, 11.7);
        assistance[131] = new Inhalt(132, "Male", 3.5, 12.9);
        assistance[132] = new Inhalt(133, "Male", 3.5, 15.6);
        assistance[133] = new Inhalt(134, "Male", 3.5, 15.7);
        assistance[134] = new Inhalt(135, "Male", 3.5, 17.2);
        assistance[135] = new Inhalt(136, "Male", 3.6, 11.8);
        assistance[136] = new Inhalt(137, "Male", 3.6, 13.3);
        assistance[137] = new Inhalt(138, "Male", 3.6, 14.8);
        assistance[138] = new Inhalt(139, "Male", 3.6, 15);
        assistance[139] = new Inhalt(140, "Male", 3.7, 11);
        assistance[140] = new Inhalt(141, "Male", 3.8, 14.8);
        assistance[141] = new Inhalt(142, "Male", 3.8, 16.8);
        assistance[142] = new Inhalt(143, "Male", 3.9, 14.4);
        assistance[143] = new Inhalt(144, "Male", 3.9, 20.5);
        
        for(int i=0; i<assistance.length; i++ ){
            if (i<30){
                Baum1.sortierteinf(assistance[i+30]);//adding index 30-59
            }
            if (i>=30 && i<60){
                Baum1.sortierteinf(assistance[i-30]);//adding index 0-29
            }
            if (i>=60 && i<90){
                Baum1.sortierteinf(assistance[i+30]);//adding index 90-119
            }
            if (i>=90 && i<120){
                Baum1.sortierteinf(assistance[i-30]);//adding index 60-89
            }
            if (i>=120 && i<144){
                Baum1.sortierteinf(assistance[i]);//adding index 120-143
            }
        }
        Baum1.ausgeben();
        System.out.println("Suche nach 134: ");
        Baum1.suchen(134).ausgabe();
        System.out.println("Ausbalanciert?  "+Baum1.istAusbalanciert());
        System.out.println("Leichtestes Koerpergewicht in kg?  "+Baum1.minB());
    }
}
