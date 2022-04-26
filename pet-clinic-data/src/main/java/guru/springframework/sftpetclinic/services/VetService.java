package guru.springframework.sftpetclinic.services;

import java.util.Set;

import guru.springframework.sftpetclinic.model.Vet;


public interface VetService {

	Vet findById(Long id);
	
	Vet save(Vet Vet);
	
	Set<Vet> findAll();
}
