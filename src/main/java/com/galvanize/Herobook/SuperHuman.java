package com.galvanize.Herobook;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
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
