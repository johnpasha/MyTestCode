package HackerRankPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GradeStudents {
	
	
	public static void main(String[] args) {
		List<Integer> grades = new ArrayList<Integer>(Arrays.asList(33)) ;
		System.out.println(gradingStudents(grades));
	}
	
	public static List<Integer> gradingStudents(List<Integer> grades) {
        int nearestMultiple = 0;
        int minBase = 38;
        for(int i=0; i<grades.size();i++){
            if(grades.get(i)<minBase || grades.get(i)%5==0) {
                
            }else{
            nearestMultiple = ((grades.get(i)/5)+1)*5;
            if(nearestMultiple-grades.get(i)<3){
                grades.set(i,nearestMultiple);
            }
            }
        }
        System.out.println();
        return grades;

    }
	
	

}
