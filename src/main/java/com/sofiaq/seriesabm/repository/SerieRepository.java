package com.sofiaq.seriesabm.repository;

import com.sofiaq.seriesabm.models.Serie;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface SerieRepository extends JpaRepository<Serie,Integer>{
 
    public List<Serie> findByOrderByIdAsc();
}
