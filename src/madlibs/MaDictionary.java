/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package madlibs;
import java.util.Random;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Kyler
 */
public class MaDictionary {
    
    public ArrayList<String> adj, nou;
    
    public MaDictionary() {
        Loadfiles();
    }
    public void Loadfiles() {

        try {
            File adjectives = new File("Adjectives.txt");
            File nouns = new File("Nouns.txt");

            Scanner input1 = new Scanner(adjectives);
            Scanner input2 = new Scanner(nouns);
            adj = new ArrayList();
            nou = new ArrayList();

            while (input1.hasNextLine()) {
                adj.add(input1.nextLine());
            }
            input1.close();
            while (input2.hasNextLine()) {
            	nou.add(input2.nextLine());
            }
            input2.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    public String getrandomNoun() {
     Random rand = new Random();
     int max = nou.size();
     int randomNum = rand.nextInt(max);
     return nou.get(randomNum);
    }
    public String getrandomAdj() {
     Random rand = new Random();
     int max = adj.size();
     int randomNum = rand.nextInt(max);
     return adj.get(randomNum);
    }
}

