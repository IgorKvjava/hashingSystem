package com.ua.kvelinskyi.hashingSystem.hashing;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashingData {
    private StringBuffer sb;

    public TreeMap<String, String> getHashMap() throws NoSuchAlgorithmException {
        TreeMap<String, String> treeMap = new TreeMap<>();
        int i;
        StringBuilder stringBuilder = new StringBuilder("380");
        for (i = 1; i <= 50_000_000; i++) {
            stringBuilder.append(100_000_000 + i);
            treeMap.put(stringBuilder.toString(), String.valueOf(i));
            stringBuilder.setLength(3);
        }
        return treeMap;
    }

    private String generateHash(String mobileNumber) throws NoSuchAlgorithmException {
        MessageDigest sha1 = MessageDigest.getInstance("SHA-1");
        sha1.update(mobileNumber.getBytes());
        byte[] digest = sha1.digest();
        sb = new StringBuffer();
        for (byte b : digest) {
            sb.append(String.format("%02x", b & 0xff));
        }
        return sb.toString();


    }
}

