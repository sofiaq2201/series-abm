package com.sofiaq.seriesabm.service;

import com.sofiaq.seriesabm.models.Estado;
import com.sofiaq.seriesabm.repository.EstadoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstadoService {
    @Autowired
    EstadoRepository estadoRepo;
    
    public List<Estado> getAllEstados(){
        return estadoRepo.findAll();
    }
}
