package Classroom;

public class CharOccurance {

	public static void main(String[] args) {
		String str = "Welcome to Test Leaf";
		char[] arr = str.toCharArray();
		
		for (int i=0;i<arr.length;i++) {
			int count  =1;
			for (int j=1;j<arr.length;j++) {
				
				if (arr[ i]==arr[j])
				{ count ++;
				  arr[j]= 0;
				  
				}
				
			}
			if (arr[i]!=0)
			{
				System.out.println(arr[i]+":"+count);
				
			}
			
		}
		
		
		// TODO Auto-generated method stub

	}

}
