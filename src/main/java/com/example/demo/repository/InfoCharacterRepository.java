package com.example.demo.repository;

import com.example.demo.entity.InfoCharacter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InfoCharacterRepository extends JpaRepository<InfoCharacter, Integer>{
}
