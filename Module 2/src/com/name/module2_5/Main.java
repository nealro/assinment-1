package com.name.module2_5;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        CaesarCipher cipher = new CaesarCipher(1);
        Scanner OriginalMessage = new Scanner(System.in);
        String originalMessage = OriginalMessage.next();

        String encryptedMessage = cipher.encrypt(originalMessage);
        String decryptedMessage = cipher.decrypt(encryptedMessage);


        System.out.println("Original Message: " + originalMessage);
        System.out.println("Encrypted Message: " + encryptedMessage);
        System.out.println("Decrypted Message: " + decryptedMessage);
    }
}
