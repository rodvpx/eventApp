package com.example.eventapp.controller;

import com.example.eventapp.models.Evento;
import com.example.eventapp.repository.EventoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EventoController {

    @Autowired
    private EventoRepository event;

    @GetMapping("/cadastrar")
    public String form(){
        return "evento/form";
    }

    @PostMapping("/cadastrar")
    public String form(Evento evento){
        event.save(evento);
        return "redirect:/cadastrar";
    }

}
