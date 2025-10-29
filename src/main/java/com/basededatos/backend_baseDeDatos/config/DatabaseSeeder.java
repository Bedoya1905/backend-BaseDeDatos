package com.basededatos.backend_baseDeDatos.config;

import com.basededatos.backend_baseDeDatos.model.Habilidad;
import com.basededatos.backend_baseDeDatos.model.Personaje;
import com.basededatos.backend_baseDeDatos.model.Usuario;
import com.basededatos.backend_baseDeDatos.repository.HabilidadRepository;
import com.basededatos.backend_baseDeDatos.repository.PersonajeRepository;
import com.basededatos.backend_baseDeDatos.repository.UsuarioRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;

@Component
public class DatabaseSeeder implements CommandLineRunner {
    private final UsuarioRepository usuarioRepository;
    private final PersonajeRepository personajeRepository;
    private final HabilidadRepository habilidadRepository;

    @Autowired
    public DatabaseSeeder(UsuarioRepository usuarioRepository, PersonajeRepository personajeRepository, HabilidadRepository habilidadRepository) {
        this.usuarioRepository = usuarioRepository;
        this.personajeRepository = personajeRepository;
        this.habilidadRepository = habilidadRepository;
    }


    @Override
    public void run(String... args) throws Exception {
        // Usuarios
        Usuario usuario1 = new Usuario("John", "abcd");
        Usuario usuario2 = new Usuario("Juan", "1234");
        Usuario usuario3 = new Usuario("Pepe", "qwer");
        usuarioRepository.save(usuario1);
        usuarioRepository.save(usuario2);
        usuarioRepository.save(usuario3);

        // Personajes
        Personaje personaje1 = new Personaje("Gagh-Ar", "Guerrero", "Un valiente luchador con gran fuerza fìsica.", 80, 70, 60);
        Personaje personaje2 = new Personaje("Elyra", "Mago", "Hechicera con gran dominio de la energìa màgica.", 65, 40, 90);
        Personaje personaje3 = new Personaje("Santiago-Son", "Samurai", "El golden boy que siempre salva el dia", 75, 65, 70);
        Personaje personaje4 = new Personaje("NikoNi", "Mafioso", "Un bueno para nada que se quiere parecer a Kiryu kazuma", 50, 105, 80);
        Personaje personaje5 = new Personaje("Lautiti", "Mago", "Conocido por su increible pelo rubio y tambien conocido por el nombre: Tifanny", 70, 20, 100);
        personajeRepository.save(personaje1);
        personajeRepository.save(personaje2);
        personajeRepository.save(personaje3);
        personajeRepository.save(personaje4);
        personajeRepository.save(personaje5);

        // Habilidades
        Habilidad habilidad1 = new Habilidad("Espadazo", "Un Ataque poderoso con la espada.", 10, 0, -5);
        Habilidad habilidad2 = new Habilidad("Escudo de Hierro", "Aumenta la def del usuario.", 0, 15, -3);
        Habilidad habilidad3 = new Habilidad("Bendición Mística", "Aumenta el sp del usuario.", 0, 0, 20);
        Habilidad habilidad4 = new Habilidad("Furia del Dragón", "Un ataque devastador que sacrifica defensa por poder.", 20, -10, -10);
        Habilidad habilidad5 = new Habilidad("Bola de huevo", "tira una bola con mucho huevo.", 12, -1, -7);
        habilidadRepository.save(habilidad1);
        habilidadRepository.save(habilidad2);
        habilidadRepository.save(habilidad3);
        habilidadRepository.save(habilidad4);
        habilidadRepository.save(habilidad5);
    }
}
