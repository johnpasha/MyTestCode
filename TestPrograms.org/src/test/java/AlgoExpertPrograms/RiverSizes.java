package AlgoExpertPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.xml.serializer.utils.Utils;

public class RiverSizes {

	public static void main(String[] args) {
		    int[][] input = {
		      {1, 0, 0, 1, 0},
		      {1, 0, 1, 0, 0},
		      {0, 0, 1, 0, 1},
		      {1, 0, 1, 0, 1},
		      {1, 0, 1, 1, 0},
		      {1, 0, 1, 1, 0},
		    };
//		    int[] expected = {1, 2, 2, 2, 5};
		    List<Integer> output = riverSizes(input);
		    Collections.sort(output);
		    System.out.println(output);
//		    System.out.println(output== expected);
		  }

		  public static boolean compare(List<Integer> arr1, int[] arr2) {
		    if (arr1.size() != arr2.length) {
		      return false;
		    }
		    for (int i = 0; i < arr1.size(); i++) {
		      if (arr1.get(i) != arr2[i]) {
		        return false;
		      }
		    }
		    return true;
		  }

	
public static List<Integer> riverSizes(int[][] matrix) {

	for(int i=0; i<matrix.length;i++) {
		for(int j=0; j<matrix[i].length ;j++) {
			System.out.print(matrix[i][j]);
		}
		System.out.println();
	}
	
    return new ArrayList<Integer>();
  }

}
