package guru.springframework.sftpetclinic.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import guru.springframework.sftpetclinic.model.Pet;
import guru.springframework.sftpetclinic.services.CrudService;
import guru.springframework.sftpetclinic.services.PetService;

@Service
public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService{

	@Override
	public Pet findById(Long id){
		return super.findById(id);
	}

	@Override
	public Set<Pet> findAll(){
		return super.findAll();
	}

	@Override
	public void deleteById(Long id){
		super.deleteById(id);
	}
	@Override
	public void delete(Pet object){
		super.delete(object);
	}
	@Override
	public Pet save(Pet object) {
		// TODO Auto-generated method stub
		return super.save(object);
	}

}
