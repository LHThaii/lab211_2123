/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import constant.IConstant;
import static java.util.Collections.list;
import java.util.List;
import util.Validate;

/**
 *
 * @author trinh
 */
public class Experience extends Candidate{
    
    private int expInYear;
    private String proSkill;
    
    public Experience(){
        
    }
    public Experience(int id,String firstName,String lastName,int birthDate,String address,
                     String phone,String email,int type,int expIntYear,String proSkill){
        super(id,firstName,lastName,birthDate,address,phone,email,type);
        this.expInYear=expInYear;
        this.proSkill=proSkill;
    }
    
    public void create(List<Candidate> List){
        super.create(List);
        this.expInYear = Validate.getInt(
            "Enter year of experience",
                "Numeric value out of range",
                "Invalid integer numver",
                1,100
                );
        this.proSkill = Validate.getString(
        "Enter pro skill",
                "Invalid skill",
                IConstant.REGEX_TEXT);
        this.setType(IConstant.EXPERIENCE_TYPE);
    }
}
