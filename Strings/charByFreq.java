import java.util.HashMap;
import java.util.HashSet;

public class charByFreq {
    public static void main(String[] args) {
        String str = "kabeer";
        HashMap<Character, Integer> map = new HashMap<>();

        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);

        }

        for (int j = str.length(); j >= 0; j--) {
            HashSet<Character> set = new HashSet<>();
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (!set.contains(ch)) {
                    set.add(ch);
                } else {
                    continue;
                }

                if (map.get(ch) == j) {
                    for (int l = 0; l < map.get(ch); l++) {
                        result = result + ch;
                    }
                }
            }
        }
        System.out.println(result);

    }
}
