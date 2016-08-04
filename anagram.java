import java.util.*;
import java.io.*;

public class anagram {
	public static void main (String[] args) throws IOException {
		File file = new File("sowpods.txt");		
		
		ArrayList<String> WordList = GetWords(file);
		Map<String, String> FinalMap = MapAnagrams(WordList);
		displayMap(FinalMap);
		
	}
	
	public static ArrayList<String> GetWords(File file) throws FileNotFoundException{
		ArrayList<String> WordList = new ArrayList<>();
		Scanner input = new Scanner(file);  
		while(input.hasNext()) {
		   WordList.add(input.next());
		}
		return WordList;
	}
	public static Map<String, String> MapAnagrams(ArrayList<String> WordList){
		Map<String, String> FinalMap = new HashMap<String, String>();
		return FinalMap;
	}

	public static String Sort(String str){
		String SortedString = "";
		return SortedString;
	}
	public static displayMap(Map<String,String> FinalMap){
		
		
	}
}
