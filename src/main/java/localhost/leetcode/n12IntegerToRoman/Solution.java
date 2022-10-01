package localhost.leetcode.n12IntegerToRoman;

import java.util.HashMap;
import java.util.Map;

class Solution {

  public String intToRoman(int num) {
    Map<Integer, Character> map = new HashMap<>();
    map.put(1000, 'M');
    map.put(500, 'D');
    map.put(100, 'C');
    map.put(50, 'L');
    map.put(10, 'X');
    map.put(5, 'V');
    map.put(1, 'I');
    return "123+";
  }

  public static void main(String[] args) {
    String roman = new Solution().intToRoman(2);
    System.out.println(roman);
  }
}
