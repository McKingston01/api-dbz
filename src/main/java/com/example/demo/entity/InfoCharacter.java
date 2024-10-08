package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class InfoCharacter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    @Column(name = "description")
    private String description;

    @Column(name = "power")
    private String power;

    @Column(name = "attack")
    private String attack;

    @Column(name = "img_page_url")
    private String imgPageUrl;

    @OneToOne
    @JoinColumn(name = "characterdbz_id")
    @JsonBackReference
    private CharacterDBZ characterDBZ;


}
