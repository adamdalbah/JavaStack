public class StartManipulator {
    public String trimAndConcat(String str1, String str2){
	    return str1.trim() + str2.trim();
	}
    public Integer getIndexOrNull(String str, char c){
	    if (str.indexOf(c) == -1){
		return null;
	    }
	    return str.indexOf(c);
	} 
    public Integer getIndexOrNull(String str, String str2){
	    if (str.indexOf(str2) == -1){
		return null;
	    }
	    return str.indexOf(str2);
	
	}
    public String concatSubstring(String str, int first, int last, String str2){
	    return str.substring(first, last) + str2;
	}

}