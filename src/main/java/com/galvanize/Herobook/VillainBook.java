package com.galvanize.Herobook;

import lombok.AllArgsConstructor;
import lombok.Builder;
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
@Builder

public class VillainBook extends SuperHuman{
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long villainId;
    private String villainName;

}
