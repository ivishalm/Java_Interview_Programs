import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class dupliWords {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter String to count the number of duplicate word in String : ");

		String str = scanner.nextLine();

		DuplicateCount(str);
	}

	private static void DuplicateCount(String s) {

		String[] strArray = s.split(" ");

		Map<String, Integer> map = new HashMap<String, Integer>();

		for (String string : strArray) {

			if (map.get(string) != null) {

				map.put(string, map.get(string) + 1);

			} else {
				
				map.put(string, 1);

			}
		}

		Set<String> set = map.keySet();

		for (String string : set) {
			System.out.println(string + " " + map.get(string));
		}

	}

}
