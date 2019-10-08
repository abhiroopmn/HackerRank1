import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TestCode {
    public static void main(String args[]) {
        System.out.println(shortestSubstring("aabcce"));
    }

    public static int shortestSubstring(String s) {
        // Write your code here
        Set<Character> uniqueCharacters = getUniqueCharactersFromString(s);
        int minimumStringLength = uniqueCharacters.size();
        boolean found = false;
        int len = -1;
        while(!found) {
            len = getValidSubstringLength(s, minimumStringLength, uniqueCharacters);
            if (len == -1) {
                minimumStringLength++;
            } else {
                found = true;
            }
        }

        return len;
    }

    public static Set<Character> getUniqueCharactersFromString(String s) {
        Set<Character> uniqueCharacters = new HashSet<>();
        for(int i = 0; i < s.length(); i++) {
            uniqueCharacters.add(s.charAt(i));
        }
        return uniqueCharacters;
    }

    public static int getValidSubstringLength(String s, int len, Set uniqueCharacters) {
        for (int i=0; i <= s.length() - len; i++) {
            Set checkSet = getUniqueCharactersFromString(s.substring(i, i + len));
            if (checkSet.size() == uniqueCharacters.size()) {
                checkSet.removeAll(uniqueCharacters);
                if (checkSet.size() == 0) {
                    return len;
                }
            }
        }
        return -1;
    }
}
