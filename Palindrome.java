package Classroom;

public class Palindrome {

	public static void main(String[] args) {
		String str ="MOM";
		System.out.println("original String is "+str);
		String revstr="";
		for (int i=str.length()-1;i>=0;i--) {
			 revstr=revstr+(str.charAt(i));
			 System.out.println("ReverseString is "+revstr);
			 if (str.equals(revstr)) {
				 System.out.println("Given string is Palindrome");
				 }
			 
				 else {
					 System.out.println("given string is not Palindrome");
			 }
			 
		}
		// TODO Auto-generated method stub

	}

}
