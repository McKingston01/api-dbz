package com.example.demo.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class CharacterHandler {


    @ExceptionHandler(CharacterNotFound.class)
    public ResponseEntity<Map<String, String>> Animenotfound(CharacterNotFound ex) {
        Map<String, String> resp = new HashMap<>();
        resp.put("Character_ERROR", ex.getMessage());
        return new ResponseEntity<>(resp, HttpStatus.BAD_REQUEST);
    }
}