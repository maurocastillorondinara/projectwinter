package com.projectwinter.resortapi.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import static javax.persistence.GenerationType.IDENTITY;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Resort {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private int idResort;
    private String name;
    private int liftCount;
    private int runCount;
    private String officialWebsite;
    private int longestRun;
    private int skiableAcreage;
    private boolean terrainPark;
    private boolean nightSkiing;
    private int latitude;
    private int longitude;
    private String country;
    private String state;
    private String topElevation;
    private String bottomElevation;
    private String point;
    private boolean isOpen;
}
