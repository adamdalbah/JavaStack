import java.util.HashMap;
import java.util.Set;

public class Hashmatique{
    public static void main(String[] args){
	HashMap<String, String> trackList = new HashMap<String, String>();
	trackList.put("Khatarna ala balak", "Khatarna ya hoa");
	trackList.put("la thalefene blshnb", "la tashmene blatab");
	trackList.put("Dkhlek ol hoa shmale", "wle hoa bklbe shmale");
	System.out.println(trackList.get("la thalefene blshnb"));
	
	Set<String> keys = trackList.keySet();
	for (String key: keys){
	    System.out.println(key + " : " + trackList.get(key));
	}
	
    }
}