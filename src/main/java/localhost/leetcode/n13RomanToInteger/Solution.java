package localhost.leetcode.n13RomanToInteger;

import java.util.HashMap;
import java.util.Map;

public class Solution {

  public int romanToInt(String s) {
    Map<Character, Integer> map = new HashMap<>();
    map.put('M', 1000);
    map.put('D', 500);
    map.put('C', 100);
    map.put('L', 50);
    map.put('X', 10);
    map.put('V', 5);
    map.put('I', 1);
    char[] chars = s.toCharArray();
    int summ = map.get(chars[s.length() - 1]);
    for (int i = 0; i < chars.length - 1; i++) {
      int number = map.get(chars[i]);
      if (number < map.get(chars[i + 1])) {
        summ -= number;
      } else {
        summ += number;
      }
    }
    return summ;
  }

  public static void main(String[] args) {
    int number = new Solution().romanToInt("MCMXCIV");
    System.out.println(number);
  }
}
