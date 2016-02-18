/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package madlibs;

/**
 *
 * @author Kyler
 */
public class MadFill {
    
    public MadFill(String lib) {
        Fill(lib);
    }
    public void Fill(String lib) {
        MaDictionary dict = new MaDictionary();
        String nolib = lib.replace("Noun", dict.getrandomNoun()); 
        String adjlib = nolib.replace("Adjective", dict.getrandomAdj());
        System.out.println(adjlib);
    }
}
