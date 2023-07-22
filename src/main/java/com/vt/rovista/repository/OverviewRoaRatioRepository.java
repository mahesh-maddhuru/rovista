package com.vt.rovista.repository;

import com.vt.rovista.entity.OverviewRoaRatio;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface OverviewRoaRatioRepository extends JpaRepository<OverviewRoaRatio, Integer> {
}
