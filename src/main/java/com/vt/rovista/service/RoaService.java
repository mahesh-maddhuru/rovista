package com.vt.rovista.service;

import com.vt.rovista.entity.AsSpecificRoaRatio;
import com.vt.rovista.entity.OverviewRoaRatio;
import com.vt.rovista.repository.AsSpecificRoaRatioRepository;
import com.vt.rovista.repository.OverviewRoaRatioRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class RoaService {

    @Autowired
    private OverviewRoaRatioRepository overviewRoaRatioRepository;

    @Autowired
    private AsSpecificRoaRatioRepository asSpecificRoaRatioRepository;

    public List<OverviewRoaRatio> findAllOverviewRoaRatio() {
        return overviewRoaRatioRepository.findAll();
    }

    public List<AsSpecificRoaRatio> findAllAsSpecificRoaRatioByAsn(Integer asn) {
        return asSpecificRoaRatioRepository.findAllByAsn(asn);
    }
}
