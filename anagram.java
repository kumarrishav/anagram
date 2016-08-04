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
	    		Map<String, String> hMap = new HashMap<String, String>();
	    		for (int i = 0; i < WordList.size(); i++) {
			        String str=WordList.get(i);
			        String sSort=sortWord(str);
			        if(hMap.containsKey(sSort)){
			             check=hMap.get(sSort);
			             check+=" "+str;
			             hMap.put(sSort,check);
			        }
			        else{
			            hMap.put(sSort,str);
			        }
		        }
		        return hMap;
	}

	public static String sortWord(String word) {
        char[] chars = word.toCharArray();
        Arrays.sort(chars);
        String sorted = new String(chars);
        return sorted;
    }
	
	public static void displayMap(Map<String,String> FinalMap){
	    Iterator it = FinalMap.entrySet().iterator();
        int countAnagrams=0;
	    while (it.hasNext()) {
        	Map.Entry pair = (Map.Entry)it.next();
        	String str = pair.getValue().toString();
        	String[] AnagramList = str.split("\\s");
        	int size = AnagramList.length;
        	if(size>1){
        		System.out.println(pair.getValue());
        		countAnagrams++;
        	}
        	it.remove();
	    }
	    System.out.println(countAnagrams);
	}
}
