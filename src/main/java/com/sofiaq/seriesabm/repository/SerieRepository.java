package com.sofiaq.seriesabm.repository;

import com.sofiaq.seriesabm.models.Serie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface SerieRepository extends JpaRepository<Serie,Integer>{
 //   @Query("from Serie s where s.id = ?1")
 //   Serie findById(int serieId) ;
}
