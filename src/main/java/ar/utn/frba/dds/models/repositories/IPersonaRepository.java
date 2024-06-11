package ar.utn.frba.dds.models.repositories;

import ar.utn.frba.dds.models.entities.Persona;

import java.util.List;
import java.util.Optional;

public interface IPersonaRepository {
    Optional<Persona> buscar(int dni);
    List<Persona> buscarTodos();
    void guardar(Persona persona);
    void modificar(Persona persona);
    void eliminar(Persona persona);
}
