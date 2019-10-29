package com.Dryft;

import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;

class Hasher {
    static String hashPasswordWithSalt(String password, String salt) {
        byte[] saltBytes = toByte(salt);
        KeySpec spec = new PBEKeySpec(password.toCharArray(), saltBytes, 65536, 256);
        SecretKeyFactory skf = null;
        try {
            skf = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        byte[] hash = new byte[0];
        try {
            assert skf != null;
            hash = skf.generateSecret(spec).getEncoded();
        } catch (InvalidKeySpecException e) {
            e.printStackTrace();
        }
        return toHex(hash);
    }

    static String[] hashPassword(String password) {
        byte[] salt = generateSalt();
        String saltHex = toHex(salt);
        String passwordHash = hashPasswordWithSalt(password, saltHex);
        return new String[]{passwordHash, saltHex};
    }

    private static byte[] generateSalt() {
        byte[] salt = new byte[16];
        SecureRandom sr = new SecureRandom();
        sr.nextBytes(salt);
        return salt;
    }

    private static String byteToHex(byte num) {
        char[] hexDigits = new char[2];
        hexDigits[0] = Character.forDigit((num >> 4) & 0xF, 16);
        hexDigits[1] = Character.forDigit(num & 0xF, 16);
        return new String(hexDigits);
    }

    private static String toHex(byte[] arr) {
        StringBuilder hexCode = new StringBuilder();
        for (byte i : arr) {
            hexCode.append(byteToHex(i));
        }
        return hexCode.toString();
    }

    private static byte hexToByte(String hex) {
        return (byte) ((Character.digit(hex.charAt(0), 16) << 4) + Character.digit(hex.charAt(1), 16));
    }

    private static byte[] toByte(String hex) {
        byte[] bytes = new byte[hex.length() / 2];
        for (int i = 0; i < bytes.length; i++) {
            bytes[i] = hexToByte(hex.substring(2 * i, 2 * i + 2));
        }
        return bytes;
    }
}
