package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class CharacterDBZ {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "img_url")
    private String imgUrl;

    @Column(name = "is_hero")
    private Boolean isHero;

    @Column(name = "is_base_character")
    private Boolean isBase;

    @Column(name = "is_other_hero")
    private Boolean isOtherHero;

    @Column(name = "version_de_personaje_base")
    private String versionOf;

    @Column(name = "is_ki_base")
    private Boolean isKiBase;

    @Column(name = "is_ki_saiyan")
    private Boolean isKiSaiyan;

    @Column(name = "is_ray_base")
    private Boolean isRayBase;

    @Column(name = "is_ray_saiyan")
    private Boolean isRaySaiyan;

    @OneToOne(mappedBy = "characterDBZ", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference
    private InfoCharacter infoCharacter;
}
