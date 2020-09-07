package com.sofiaq.seriesabm.service;

import com.sofiaq.seriesabm.models.Serie;
import com.sofiaq.seriesabm.repository.SerieRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SerieService {
    
    @Autowired
    SerieRepository serieRepo;
    
    public List<Serie> getAllSeries(){
        return  serieRepo.findByOrderByIdAsc();
    }
    
    public void saveSerie(Serie s){
        serieRepo.save(s);
    }
    
    public Serie getInfoById(int serieId){
        return serieRepo.findById(serieId).get();
    }
    
    public void deleteSerie(Serie s){
        serieRepo.delete(s);
    }
}
