package com.tutorial.onetoone02;

import com.tutorial.onetoone02.entity.Ciudadano;
import com.tutorial.onetoone02.entity.Vacuna;
import com.tutorial.onetoone02.repository.CiudadanoRepository;
import com.tutorial.onetoone02.repository.VacunaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyRunner implements CommandLineRunner {

    @Autowired
    CiudadanoRepository ciudadanoRepository;

    @Autowired
    VacunaRepository vacunaRepository;
    @Override

    public void run(String... args) throws Exception {
        /*Ciudadano pepe = new Ciudadano("pepe");
        Ciudadano juan = new Ciudadano("juan");

        Vacuna vacuna1 = new Vacuna("pf");
        Vacuna vacuna2 = new Vacuna("mod");

        pepe.setVacuna(vacuna1);
        juan.setVacuna(vacuna2);

        ciudadanoRepository.save(pepe);
        ciudadanoRepository.save(juan);*/

        /*Ciudadano pepe = ciudadanoRepository.findById(3).get();
        pepe.deleteVacuna();
        ciudadanoRepository.save(pepe);*/
    }
}
