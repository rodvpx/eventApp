package com.example.eventapp.repository;

import com.example.eventapp.models.Evento;
import org.springframework.data.repository.CrudRepository;

public interface EventoRepository extends CrudRepository<Evento, String> {
}
