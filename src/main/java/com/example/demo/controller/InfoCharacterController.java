package com.example.demo.controller;

import com.example.demo.entity.InfoCharacter;
import com.example.demo.service.InfoCharacterService;
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
@RequestMapping("/api/info")
@CrossOrigin(origins = "*")
public class InfoCharacterController {
    private  final InfoCharacterService infoCharacterService;

    @GetMapping
    public ResponseEntity<List<InfoCharacter>> findAll() {
        return ResponseEntity.status(HttpStatus.OK).body(infoCharacterService.findAll());
    }
}
