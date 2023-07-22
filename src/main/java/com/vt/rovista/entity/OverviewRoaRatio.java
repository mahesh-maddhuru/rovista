package com.vt.rovista.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Table(name = "OVERVIEW_ROA_RATIO")
@Entity
public class OverviewRoaRatio {

    @Id
    @Column(name = "ASN")
    private Integer asn;

    @Column(name = "TOTAL")
    private Integer total;

    @Column(name = "FILTER")
    private Integer filter;

    @Column(name = "REMOVE")
    private Integer remove;

    @Column(name = "AS_RANK")
    private Integer rank;

    @Column(name = "ORGANIZATION")
    private String organization;

    @Column(name = "COUNTRY")
    private String country;

    @Column(name = "COUNTRY_ISO")
    private String countryIso;

    @Column(name = "RATIO")
    private Float ratio;
}
