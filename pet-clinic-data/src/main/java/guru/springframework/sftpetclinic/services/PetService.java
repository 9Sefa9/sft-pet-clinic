package guru.springframework.sftpetclinic.services;

import java.util.Set;

import guru.springframework.sftpetclinic.model.Pet;

public interface PetService {

	Pet findById(Long id);
	
	Pet save(Pet Pet);
	
	Set<Pet> findAll();
}
