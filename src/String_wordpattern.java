import java.util.HashMap;

public class String_wordpattern {
	  public boolean wordPattern(String pattern, String s) {

	        String[] words = s.trim().split("\\s+");

	        if (words.length != pattern.length()) return false ;
	        
	        HashMap<Character , String> map  =  new HashMap<>(); 
	        for (int i = 0 ; i <  pattern.length() ; i++)
	        {
	            if (map.containsKey(pattern.charAt(i)))
	            {
	                if (!(words[i].equals(map.get(pattern.charAt(i)))))
	                {
	                    return false ;
	                }

	            }
	            else 
	            { 
	                // added for such inputs  String pattern = "abba";
	                 // String s = "dog dog dog dog";
	                if (map.containsValue(words[i])) 
	                {
	                 return false ;
	                }
	                map.put(pattern.charAt(i) , words[i] ); 
	            }
	        }
	     return true ;
	        
	    }
}
