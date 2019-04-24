package com.ua.kvelinskyi.hashingSystem.controller;

import com.ua.kvelinskyi.hashingSystem.hashing.HashingData;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.NoSuchAlgorithmException;

@RestController
@RequestMapping("/")
public class MainController {

    /*@GetMapping
    public HashMap<String, String> list() throws NoSuchAlgorithmException {
        HashingData hashingData = new HashingData();
        return hashingData.getHashMap();
    }*/

    @GetMapping
    public String main() throws NoSuchAlgorithmException{
        HashingData hashingData = new HashingData();
        return "size map - " + hashingData.getHashMap().size();
    }
}