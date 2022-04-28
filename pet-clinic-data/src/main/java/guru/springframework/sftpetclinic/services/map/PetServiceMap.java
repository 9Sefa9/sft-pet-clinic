package guru.springframework.sftpetclinic.services.map;

import java.util.Set;

import guru.springframework.sftpetclinic.model.Pet;
import guru.springframework.sftpetclinic.services.CrudService;

public class PetServiceMap extends AbstractMapService<Pet, Long> implements CrudService<Pet, Long>{

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
		return super.save(object.getId(),object);
	}

}
