package com.projectwinter.resortapi.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Resort {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idResort;
}
