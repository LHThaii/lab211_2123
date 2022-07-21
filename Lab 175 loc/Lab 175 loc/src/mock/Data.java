/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mock;

import entity.Candidate;
import entity.Experience;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author trinh
 */
public class Data {
    public static List<Candidate> listCandidate = new ArrayList(){
        {
            add(new Experience(1,"Trinh","Dat",2002,"Hung Yen","0947257842","dattthe161372@fpt.edu.vn",2,5,"chem gio"));
            
        }
    };
}
