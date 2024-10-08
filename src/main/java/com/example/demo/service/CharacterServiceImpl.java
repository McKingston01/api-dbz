package com.example.demo.service;

import com.example.demo.entity.CharacterDBZ;
import com.example.demo.repository.CharacterRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class CharacterServiceImpl implements CharacterService {

    private final CharacterRepository characterRepository;

    @Override
    public List<CharacterDBZ> findAll() {
        return characterRepository.findAll();
    }
}