
import bo.CandidateBo;
import constant.IConstant;
import entity.Candidate;
import mock.Data;
import util.Helper;
import util.Validate;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author trinh
 */
public class CandidateManager {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CandidateBo candidateBo = new CandidateBo(Data.listCandidate);

        boolean flag = true;
        do {
            Helper.menu();
            int choice = Validate.getInt(
                    "Enter your choice",
                    "Numeric value out of range",
                    "Invalid integer number",
                    1, 5
            );
            switch (choice) {
                case 1:
                    candidateBo.add(IConstant.EXPERIENCE_TYPE);
                    break;
                case 2:
                    candidateBo.add(IConstant.FRESHER_TYPE);
                    break;
                case 3:
                    candidateBo.add(IConstant.INTERN_TYPE);
                    break;
                case 4:
                    candidateBo.display();
                    String text = Validate.getString(
                            "Input Candidate name(first name or last name",
                            "Invalid name",
                            IConstant.REGEX_NAME);
                    int type = Validate.getInt(
                            "Input type of candidate [0-1-2]",
                            "Numeric value out of range",
                            "Invalid integer number",
                            0, 2);

                    candidateBo.displayResultSearch(candidateBo.search(text,type));
                    break;
                case 5:
                    flag = false;
                    break;

            }
        } while (flag);
    }
}
