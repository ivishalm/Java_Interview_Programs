
public class palindrome {

	public static void main(String[] args) {
		
		PalindromORNot("madam");
		
	}
	
	private static void PalindromORNot(String s) {

		String rev = "";
		
		for (int i = s.length()-1 ; i>=0; i--) {
			
			rev = rev + s.charAt(i);
			
		}
		if(rev.equals(s)){
			System.out.println("Palindrome");
		}else{
			System.out.println("Not Palindrome");
		}
		
	}
	
	
}
