import java.util.HashMap;
public class Hashmatique {
    public static void main(String[] args) {
        HashMap<String, String> trackMap = new HashMap<>();
        trackMap.put("Brother", "Brother let me be your shelter\nNever leave you all alone");
        trackMap.put("Multiplied", "Your love is like raidant diamonds\nBursting inside us we cannot contain");
        trackMap.put("Something Beautiful", "Hey now, this is my desire\nConsume me like a fire, 'cause I just want something beautiful'");
        trackMap.put("Testify", "Into the wild\nCanyons of youth");
        // System.out.println(trackMap);
        System.out.println(trackMap.get("Brother"));
        trackMap.forEach((k,v)->System.out.println(k + ": " + v));
    }
}