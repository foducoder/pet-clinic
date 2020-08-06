package jagrat.springframework.petclinic.services;

import jagrat.springframework.petclinic.model.Vet;

import java.util.Set;

public interface VetService {
     Vet findById(Long Id);

     Vet save(Vet vet);
     Set<Vet> findAll();
}
