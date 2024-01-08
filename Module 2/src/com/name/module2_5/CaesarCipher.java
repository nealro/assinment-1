package com.name.module2_5;

import java.util.HashMap;
import java.util.Map;

public class CaesarCipher {

    private int shift;
    private Map<Character, Character> encryptionMap;
    private Map<Character, Character> decryptionMap;

    public CaesarCipher(int shift) {

        if (shift < 1 || shift > 25) {
            throw new IllegalArgumentException("Shift must be between 1 and 25");
        }
        this.shift = shift;
        this.encryptionMap = generateEncryptionMap(shift);
        this.decryptionMap = generateDecryptionMap(shift);
    }

    private static Map<Character, Character> generateEncryptionMap(int shift) {
        Map<Character, Character> map = new HashMap<>();
        for (char c = 'a'; c <= 'z'; c++) {
            char encrypted = (char) ((c - 'a' + shift) % 26 + 'a');
            map.put(c, encrypted);
        }
        return map;
    }

    private static Map<Character, Character> generateDecryptionMap(int shift) {
        Map<Character, Character> map = new HashMap<>();
        for (char c = 'a'; c <= 'z'; c++) {
            char decrypted = (char) ((c - 'a' - shift + 26) % 26 + 'a');
            map.put(c, decrypted);
        }
        return map;
    }

    public String encrypt(String message) {
        StringBuilder result = new StringBuilder();
        for (char c : message.toCharArray()) {
            if (Character.isLowerCase(c)) {
                result.append(encryptionMap.get(c));
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }

    public String decrypt(String message) {
        StringBuilder result = new StringBuilder();
        for (char c : message.toCharArray()) {
            if (Character.isLowerCase(c)) {
                result.append(decryptionMap.get(c));
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }
}
