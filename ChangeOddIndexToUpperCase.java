package Classroom;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		
		String str ="Welcome";
		char[] CharArray= str.toCharArray();
		for (int i=0;i<CharArray.length;i++) {
			if (i%2==0) {
				System.out.println(Character.toUpperCase(CharArray[i]));
			}
				else
				{
					System.out.println(CharArray[i]);
				}
			}
		}
		
		// TODO Auto-generated method stub

	}


