package com.vt.rovista.repository;

import com.vt.rovista.entity.AsSpecificRoaRatio;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Transactional
public interface AsSpecificRoaRatioRepository extends JpaRepository<AsSpecificRoaRatio, Integer> {
    List<AsSpecificRoaRatio> findAllByAsn(Integer asn);
}
