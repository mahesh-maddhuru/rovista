package com.vt.rovista.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.Date;

@Data
@Table(name = "AS_SPECIFIC_ROA_RATIO")
@Entity
public class AsSpecificRoaRatio {

    @Id
    @Column(name = "ID")
    private Integer id;

    @Column(name = "ASN")
    private Integer asn;

    @Column(name = "RECORD_DATE")
    private Date recordDate;

    @Column(name = "TOTAL")
    private Integer total;

    @Column(name = "FILTER")
    private Integer filter;

    @Column(name = "REMOVE")
    private Integer remove;

    @Column(name = "RATIO")
    private Float ratio;
}
