package jagrat.springframework.petclinic.services;

import jagrat.springframework.petclinic.model.Pet;

import java.util.Set;

public interface PetService {
     Pet findById(Long Id);

     Pet save(Pet pet);

     Set<Pet> findAll();
}
