/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo;

import constant.IConstant;
import entity.Candidate;
import entity.Experience;
import entity.Fresher;
import entity.Intern;
import static java.nio.file.Files.list;
import static java.rmi.Naming.list;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;
import util.Helper;

/**
 *
 * @author trinh
 */
public class CandidateBo {
    
    private List<Candidate> list;
    public CandidateBo(List<Candidate> list){
        this.list=list;
    }
    
    public void display(){}
    
    public void add(int type){
        Candidate candidate = null;
        do{
            switch(type){
                case IConstant.EXPERIENCE_TYPE:
                    candidate = new Experience();
                    break;
                case IConstant.FRESHER_TYPE:
                    candidate = new Fresher();
                    break;
                case IConstant.INTERN_TYPE:
                    candidate = new Intern();
                    break;
            }
            if(candidate != null){
                candidate.create(list);
                list.add(candidate);
            }else {
                System.out.println("An error has occuredd.Can't add new candidate");
            }
        }while(Helper.isContinue());
    }
    
    
    public List<Candidate> search(String searchName,int type){
        List<Candidate> list = new ArrayList<>();
        
        for(Candidate c : this.list){
            if(c.getFullName().toLowerCase().contains(searchName.toLowerCase())&& c.getType() == type){
                list.add(c);
            }
        }
        return list;
    }
    
    public void displayResultSearch(List<Candidate> ListResult){
        if(ListResult.isEmpty()){
            System.out.println("\n Not Found");
        } else {
            System.out.println("\n The candidate found ");
            ListResult.forEach(System.out::println);
        }
    }
}
