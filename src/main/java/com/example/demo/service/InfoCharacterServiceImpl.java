package com.example.demo.service;

import com.example.demo.entity.InfoCharacter;
import com.example.demo.repository.InfoCharacterRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@RequiredArgsConstructor
@Service
public class InfoCharacterServiceImpl implements InfoCharacterService {
    private final InfoCharacterRepository infoCharacterRepository;

    @Override
    public List<InfoCharacter> findAll() {
        return infoCharacterRepository.findAll();
    }
}