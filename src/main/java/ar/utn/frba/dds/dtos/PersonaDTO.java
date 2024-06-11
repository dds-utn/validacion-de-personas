package ar.utn.frba.dds.dtos;

import lombok.Data;

@Data
public class PersonaDTO {
    private String nombre;
    private String apellido;
    private String dni;
    private String sexo;
}
