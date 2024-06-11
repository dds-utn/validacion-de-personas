package ar.utn.frba.dds.models.factories;

import ar.utn.frba.dds.dtos.PersonaDTO;
import ar.utn.frba.dds.models.entities.Persona;
import ar.utn.frba.dds.models.entities.Sexo;

public class FactoryPersona {

    public static Persona crearAPartirDe(PersonaDTO personaDTO) {
        Persona nuevaPersona = new Persona();

        nuevaPersona.setNombre(personaDTO.getNombre());
        nuevaPersona.setApellido(personaDTO.getApellido());
        nuevaPersona.setDni(nuevaPersona.getDni());
        nuevaPersona.setSexo(Sexo.valueOf(personaDTO.getSexo()));

        return nuevaPersona;
    }
}
