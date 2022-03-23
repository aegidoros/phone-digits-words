package com.aer.sample.phonedigitwords;

import java.util.ArrayList;
import java.util.List;

public class PhoneDigitWordsConverter {
  // String array to store keypad characters
  static final String[] codes
    = {" ", "abc", "def",
    "ghi", "jkl", "mno",
    "pqr", "stu", "vwx",
    "yz"};

  public static List<String> printKeyWords(String str) {

    // If str is empty
    if (str.length() == 0) {
      ArrayList<String> baseRes = new ArrayList<>();
      baseRes.add("");
      // Return an Arraylist containing
      // empty string
      return baseRes;
    }

    // First character of str
    char ch = str.charAt(0);

    // Rest of the characters of str
    String restStr = str.substring(1);

    List<String> previousResult = printKeyWords(restStr);
    ArrayList<String> result = new ArrayList<>();

    String code = codes[ch - '0'];

    for (String val : previousResult) {

      for (int i = 0; i < code.length(); i++) {
        result.add(code.charAt(i) + val);
      }
    }
    return result;
  }
}
