import java.util.ArrayList;

public class removeDupliChar {

	public static void main(String[] args) {
		
		String s ="aabbccsssjjdkksl";
		
		remover(s);
	}
	
	public static void remover(String s){
		
		char[] c = s.toCharArray();
		
		ArrayList<Character> arrayList = new ArrayList<>();
		
		for (char character : c) {
			
			if(!arrayList.contains(character)){
				arrayList.add(character);
			}
			
		}
			
		StringBuffer buffer = new StringBuffer();
		for (Character character : arrayList) {
			
			buffer.append(character);
		}
			
		System.out.println("After removing duplicates : "+buffer.toString());
	}
}
