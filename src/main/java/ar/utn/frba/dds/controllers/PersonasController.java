package ar.utn.frba.dds.controllers;

import ar.utn.frba.dds.dtos.PersonaDTO;
import ar.utn.frba.dds.externalservices.renaper.IRenaperService;
import ar.utn.frba.dds.externalservices.renaper.RenaperException;
import ar.utn.frba.dds.models.entities.Persona;
import ar.utn.frba.dds.models.factories.FactoryPersona;
import ar.utn.frba.dds.models.repositories.IPersonaRepository;
import ar.utn.frba.dds.utils.IObserver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PersonasController {
    private List<IObserver> observers;
    private IRenaperService renaperService;
    private IPersonaRepository personaRepository;

    public PersonasController(IRenaperService RenaperService, IPersonaRepository personaRepository) {
        this.renaperService = RenaperService;
        this.personaRepository = personaRepository;
        this.observers = new ArrayList<>();
    }

    public void agregarObservers(IObserver ... observers) {
        Collections.addAll(this.observers, observers);
    }

    public void crearPersona(PersonaDTO personaDTO) {
        try {
            this.renaperService.esValido(Integer.parseInt(personaDTO.getDni()), personaDTO.getSexo());
            Persona nuevaPersona = FactoryPersona.crearAPartirDe(personaDTO);
            this.personaRepository.guardar(nuevaPersona);
        }
        catch (RenaperException e) {
            this.observers.parallelStream().forEach(o -> o.serNotificadoDeError(e));
        }
    }
}
