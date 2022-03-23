package com.aer.sample.phonedigitwords;

public class MainApplication {
  public static void main(String[] args) {
    String str = "234";

    // Print all the possible words
    System.out.println(PhoneDigitWordsConverter.printKeyWords(str));
  }
}
