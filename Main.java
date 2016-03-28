import java.util.HashMap;
import java.util.Map.Entry;
public class Main {
    public static void main(String[] args) {
        String txt = " I love to learn java " ;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>(40);
        for (int i = 0; i < txt.length(); ++i) {
            char e = txt.charAt(i);

            if (Character.isLetter(e)) {
                if (map.containsKey(e)) {
                    map.put(e, map.get(e) + 1);
                } else {
                    map.put(e, 1);
                }
            }
        }

        for (Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println("Letter: "+entry.getKey()+" quantity: "+entry.getValue());
        }
    }
}
