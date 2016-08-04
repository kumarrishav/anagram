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
		String check="";
	    		Map<String, String> WordList = new HasWordList<String, String>();
	    		for (int i = 0; i < s.size(); i++) {
			        String str=s.get(i);
			        String sSort=sortWord(str);
			        if(WordList.containsKey(sSort)){
			             check=WordList.get(sSort);
			             check+=" "+str;
			             WordList.put(sSort,check);
			        }
			        else{
			            WordList.put(sSort,str);
			        }
		        }
		        return WordList;
	}

	public static String Sort(String str){
		String SortedString = "";
		return SortedString;
	}
	public static displayMap(Map<String,String> FinalMap){
	    Iterator it = FinalMap.entrySet().iterator();
        while (it.hasNext()) {
        Map.Entry pair = (Map.Entry)it.next();
        System.out.println(pair.getValue());
        it.remove();
	}
}
