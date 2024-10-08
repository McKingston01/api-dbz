package com.example.demo.repository;

import com.example.demo.entity.CharacterDBZ;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CharacterRepository extends JpaRepository<CharacterDBZ, Integer> {
}