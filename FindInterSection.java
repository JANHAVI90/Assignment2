package Classroom;

public class FindInterSection {

	public static void main(String[] args) {
		
		int[] arr1 = {3,4,5,1,6,7};
		int[] arr2 = {6,7,9,3,8,1};
		System.out.println("The missing element");
		for (int i=0;i<arr1.length;i++) {
			for (int j=arr1.length-1;j>=0;j--) {
				if (arr1[i]==arr2[j])
					System.out.println(arr1[i]);
			}
		}
		
		// TODO Auto-generated method stub

	}

}
