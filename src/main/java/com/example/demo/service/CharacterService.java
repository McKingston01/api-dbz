package com.example.demo.service;

import com.example.demo.entity.CharacterDBZ;
import com.example.demo.exceptions.CharacterNotFound;


import java.util.List;


public interface CharacterService {
    List<CharacterDBZ> findAll()throws CharacterNotFound;


}
