/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import constant.IConstant;
import java.util.Calendar;

/**
 *
 * @author trinh
 */
public class Helper {
    
    private Helper(){
        
    }
    public static void menu(){
        System.out.println("\nCANDIDATE MANAGEMENT SYSTEM");
        System.out.println("1. Experience");
        System.out.println("2. Fresher");
        System.out.println("3. Intership");
        System.out.println("4. Searching");
        System.out.println("5. Exit");
    }
    
    public static boolean isContinue(){
        String c = Validate.getString(
         "Do you want to continue(Y/N)",
         "Only choose(Y/N)",
         IConstant.REGEX_YES_NO
        );
        return c.equalsIgnoreCase(IConstant.YES);
    }
    
    public static int getCurrentYear(){
        return Calendar.getInstance().get(Calendar.YEAR);
    }
}
