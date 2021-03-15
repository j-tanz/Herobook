package com.galvanize.Herobook;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class HeroBook {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long heroId;
    private String image;
    private String realName;
    private String heroName;
    private String height;
    private String weight;
    private String specialPower;
    private String intelligence;
    private String strength;
    private String power;
    private String speed;
    private String agility;
    private String description;
    private String story;

    public HeroBook(String image, String realName, String heroName, String height, String weight, String specialPower, String intelligence, String strength, String power, String speed, String agility, String description, String story) {
        this.image = image;
        this.realName = realName;
        this.heroName = heroName;
        this.height = height;
        this.weight = weight;
        this.specialPower = specialPower;
        this.intelligence = intelligence;
        this.strength = strength;
        this.power = power;
        this.speed = speed;
        this.agility = agility;
        this.description = description;
        this.story = story;
    }
}
