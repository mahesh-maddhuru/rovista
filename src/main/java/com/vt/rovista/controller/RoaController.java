package com.vt.rovista.controller;

import com.vt.rovista.entity.AsSpecificRoaRatio;
import com.vt.rovista.entity.OverviewRoaRatio;
import com.vt.rovista.service.RoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rovista/api")
public class RoaController {

    @Autowired
    private RoaService roaService;

    @GetMapping("/overview")
    public ResponseEntity<List<OverviewRoaRatio>> fetchAllOverviewRoaRatios() {

        return new ResponseEntity<>(roaService.findAllOverviewRoaRatio(), HttpStatus.OK);
    }

    @GetMapping("/AS-roa-ratios/{asn}")
    public ResponseEntity<List<AsSpecificRoaRatio>> fetchAllAsSpecificRoaRatiosByAsn(@PathVariable("asn") Integer asn) {

        return new ResponseEntity<>(roaService.findAllAsSpecificRoaRatioByAsn(asn), HttpStatus.OK);
    }
}
