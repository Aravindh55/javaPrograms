package java_programs;

import java.util.ArrayList;
import java.util.List;

public class Intersection {

	public static void main(String[] args) {
		int[] arr1 = {3,2,11,4,6,7};
		int[] arr2 = {1,2,8,4,9,7};
		List<Integer>list1=new ArrayList<Integer>();
for (int i = 0; i < arr2.length; i++) {
	for (int j = 0; j < arr2.length; j++) {
		if (arr1[i]==arr2[j]) {
			list1.add(arr1[i]);
		}
	}
}
System.out.println("the intersecting numbers are ");
for (Integer integer : list1) {
	System.out.print(integer+" ");
	
}
	}

}
