package com.sofiaq.seriesabm.controller;

import com.sofiaq.seriesabm.models.Serie;
import com.sofiaq.seriesabm.service.EstadoService;
import com.sofiaq.seriesabm.service.SerieService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SerieController {
    @Autowired
    SerieService serieService;
    @Autowired
    EstadoService estadoService;
    
    @RequestMapping("/")
    public String index(Model model){
        List<Serie> series = serieService.getAllSeries();
        model.addAttribute("series", series);
        return "index";
    }
    @RequestMapping("/addSerieView")
    public String addSerie(Model model){
        model.addAttribute("estados", estadoService.getAllEstados());
        model.addAttribute("serie", new Serie());
        return "addSerieView";
    }
    
    @RequestMapping("/editSerie")
    public String editSerie(int serieId, Model model){
        Serie s = serieService.getInfoById(serieId);
        model.addAttribute("estados", estadoService.getAllEstados());
        model.addAttribute("serie", s);
    return "addSerieView";
    }
    
    //Guardo serie nueva o modificacion
    @PostMapping("/saveSerie")
    public String saveSerie(Serie s){
        serieService.saveSerie(s);
        return "redirect:/";
    }
    
    @RequestMapping("/deleteSerie")
    public String deleteSerie(int serieId){
        Serie s = serieService.getInfoById(serieId);
        serieService.deleteSerie(s);
        return "redirect:/";
    }
    
}
