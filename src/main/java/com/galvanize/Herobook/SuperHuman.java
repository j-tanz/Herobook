package com.galvanize.Herobook;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.MappedSuperclass;

@Data
@SuperBuilder
@NoArgsConstructor
@MappedSuperclass
public abstract class SuperHuman {
    protected String image;
    protected String realName;
    protected String height;
    protected String weight;
    protected String specialPower;
    protected String intelligence;
    protected String strength;
    protected String power;
    protected String speed;
    protected String agility;
    protected String description;
    protected String story;
}
