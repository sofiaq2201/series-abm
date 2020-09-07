package com.sofiaq.seriesabm.repository;

import com.sofiaq.seriesabm.models.Estado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer>{
    
}
