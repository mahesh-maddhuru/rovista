package com.vt.rovista.controller;

import com.vt.rovista.entity.AsSpecificRoaRatio;
import com.vt.rovista.entity.OverviewRoaRatio;
import com.vt.rovista.service.RoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rovista/api")
@CrossOrigin("*")
public class RoaController {

    @Autowired
    private RoaService roaService;

    @GetMapping(value = "/overview", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<OverviewRoaRatio>> fetchAllOverviewRoaRatios() {

        return new ResponseEntity<>(roaService.findAllOverviewRoaRatio(), HttpStatus.OK);
    }

    @GetMapping(value= "/AS-roa-ratios/{asn}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<AsSpecificRoaRatio>> fetchAllAsSpecificRoaRatiosByAsn(@PathVariable("asn") Integer asn) {

        return new ResponseEntity<>(roaService.findAllAsSpecificRoaRatioByAsn(asn), HttpStatus.OK);
    }
}
