/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpd4414.assignment1.teamrawr;

/**
 *
 * @author c0640780
 */
public class CPD4414Assignment1TeamRawr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    public static String stringPower(String name, int num) { 
        if (name == "") {
            return name;
        }
        else if (num < 1){
            return null;
        }
        else {
            String str = "";
            for (int x = 1; x <= num; x++) {
                str+= name;
            }
            return str;
        }
    }
       
}
