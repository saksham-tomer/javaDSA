import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        Map<Character, Integer> freqMap = new HashMap<>();
        String str = "my name is saksham";
        for (char ch : str.toCharArray()) {
            if (ch == ' ')
                continue;
            int count = freqMap.getOrDefault(ch, 0);
            freqMap.put(ch, count + 1);
        }
        for (char ch : str.toCharArray()) {
            if (ch != ' ' && freqMap.get(ch) > 1) {
                System.out.println(ch);
                break;
            }
        }
    }
}
