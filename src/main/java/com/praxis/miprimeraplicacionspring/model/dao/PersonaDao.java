package com.praxis.miprimeraplicacionspring.model.dao;

import com.praxis.miprimeraplicacionspring.model.dto.Persona;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PersonaDao {

    private List<Persona> personas = new ArrayList<Persona>();

    public Persona createPersona(Persona persona) {
        if (persona == null) {
            throw new IllegalArgumentException("La persona no puede ser nulo");
        }
        personas.add(persona);
        return persona;
    }

    public List<Persona> listarPersonas() {
        return new ArrayList<>(personas);
    }

    public Persona buscarPersonaPorNombre(String nombre) {
        for (Persona personaTemporal : personas) {
            if (personaTemporal.getNombre().equals(nombre)) {
                System.out.println("Nombre: " + personaTemporal.getNombre());
                System.out.println("Apellido: " + personaTemporal.getApellido());
                System.out.println("Edad: " + personaTemporal.getEdad());
                return personaTemporal;
            }
        }
        return null;
    }

}
