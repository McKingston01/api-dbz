package com.example.demo.controller;

import com.example.demo.entity.CharacterDBZ;
import com.example.demo.exceptions.CharacterNotFound;
import com.example.demo.service.CharacterService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/character")
@CrossOrigin(origins = "*")
public class CharacterController {

    private final CharacterService characterService;

    @GetMapping
    public ResponseEntity<List<CharacterDBZ>>  findAll() throws CharacterNotFound {
        return ResponseEntity.status(HttpStatus.OK).body(characterService.findAll());
    }
}
