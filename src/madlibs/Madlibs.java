/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package madlibs;
import java.util.ArrayList;
import java.io.File;
import java.util.Scanner;

/**
 *
 * @author Kyler
 */

public class Madlibs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MaDictionary dict = new MaDictionary();
        System.out.println(dict.getrandomAdj());
        System.out.println(dict.getrandomNoun() + " is very " + dict.getrandomAdj());
        // Insert new sentences here
    }
    
}
