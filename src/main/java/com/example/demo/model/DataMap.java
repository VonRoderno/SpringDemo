package com.example.demo.model;
import java.util.HashMap;
import java.util.Map;

public class DataMap {
    static Map<String, String> usermap = new HashMap<>();

    public static Map<String, String> createMap() {
        usermap.put("John", "123");
        usermap.put("Von", "456");
        usermap.put("Fred", "789");
        usermap.put("admin", "admin");
        return usermap;
    }
}
