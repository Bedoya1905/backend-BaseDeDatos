package com.basededatos.backend_baseDeDatos;

import com.basededatos.backend_baseDeDatos.model.Habilidad;
import com.basededatos.backend_baseDeDatos.model.Personaje;
import com.basededatos.backend_baseDeDatos.model.Usuario;
import com.basededatos.backend_baseDeDatos.repository.HabilidadRepository;
import com.basededatos.backend_baseDeDatos.repository.PersonajeRepository;
import com.basededatos.backend_baseDeDatos.repository.UsuarioRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BackendBaseDeDatosApplication {

    public static void main(String[] args) {
        org.springframework.boot.SpringApplication.run(BackendBaseDeDatosApplication.class, args);
    }

    @Bean
    public CommandLineRunner initData(
            UsuarioRepository usuarioRepository,
            PersonajeRepository personajeRepository,
            HabilidadRepository habilidadRepository
    ) {
        return args -> {
            // Usuarios
            Usuario usuario1 = new Usuario("John", "abcd");
            Usuario usuario2 = new Usuario("Juan", "1234");
            Usuario usuario3 = new Usuario("Pepe", "qwer");
            usuarioRepository.save(usuario1);
            usuarioRepository.save(usuario2);
            usuarioRepository.save(usuario3);

            // Personajes
            Personaje personaje1 = new Personaje("Gagh-Ar", "Guerrero", "Un valiente luchador con gran fuerza física.", 80, 70, 60);
            Personaje personaje2 = new Personaje("Elyra", "Mago", "Hechicera con gran dominio de la energía mágica.", 65, 40, 90);
            Personaje personaje3 = new Personaje("Santiago-Son", "Samurai", "El golden boy que siempre salva el día", 75, 65, 70);
            Personaje personaje4 = new Personaje("NikoNi", "Mafioso", "Un bueno para nada que se quiere parecer a Kiryu kazuma", 50, 105, 80);
            Personaje personaje5 = new Personaje("Lautiti", "Mago", "Conocido por su increíble pelo rubio y también conocido por el nombre: Ti", 70, 20, 100);
            personajeRepository.saveAll(java.util.List.of(personaje1, personaje2, personaje3, personaje4, personaje5));

            // Habilidades
            Habilidad habilidad1 = new Habilidad("Espadazo", "Un ataque poderoso con la espada.", 10, 0, -5);
            Habilidad habilidad2 = new Habilidad("Escudo de Hierro", "Aumenta la defensa del usuario.", 0, 15, -3);
            Habilidad habilidad3 = new Habilidad("Bendición Mística", "Aumenta el sp del usuario.", 0, 0, 20);
            Habilidad habilidad4 = new Habilidad("Furia del Dragón", "Un ataque devastador que sacrifica defensa por poder.", 20, -10, -10);
            Habilidad habilidad5 = new Habilidad("Bola de huevo", "Tira una bola con mucho huevo.", 12, -1, -7);
            habilidadRepository.saveAll(java.util.List.of(habilidad1, habilidad2, habilidad3, habilidad4, habilidad5));
        };
    }
}