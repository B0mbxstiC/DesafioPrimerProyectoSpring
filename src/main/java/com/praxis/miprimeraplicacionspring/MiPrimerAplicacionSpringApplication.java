package com.praxis.miprimeraplicacionspring;

import com.praxis.miprimeraplicacionspring.model.dao.PersonaDao;
import com.praxis.miprimeraplicacionspring.model.dto.Persona;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MiPrimerAplicacionSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(MiPrimerAplicacionSpringApplication.class, args);

        PersonaDao personaDao = new PersonaDao();
        Persona persona = new Persona("Joel", "Alarcón", 27);
        personaDao.createPersona(persona);

        personaDao.buscarPersonaPorNombre("Joel");

    }

}
