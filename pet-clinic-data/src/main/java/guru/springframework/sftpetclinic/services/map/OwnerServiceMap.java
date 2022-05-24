package guru.springframework.sftpetclinic.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import guru.springframework.sftpetclinic.model.Owner;
import guru.springframework.sftpetclinic.model.Pet;
import guru.springframework.sftpetclinic.services.CrudService;
import guru.springframework.sftpetclinic.services.OwnerService;
import guru.springframework.sftpetclinic.services.PetService;
import guru.springframework.sftpetclinic.services.PetTypeService;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService{
	
	private final PetTypeService petTypeService;
	private final PetService petService;
	
	
	public OwnerServiceMap(PetTypeService petTypeService, PetService petService) {
		this.petTypeService = petTypeService;
		this.petService = petService;
	}

	@Override
	public Owner findById(Long id){
		return super.findById(id);
	}

	@Override
	public Set<Owner> findAll(){
		return super.findAll();
	}

	@Override
	public void deleteById(Long id){
		super.deleteById(id);
	}
	@Override
	public void delete(Owner object){
		super.delete(object);
	}
	@Override
	public Owner save(Owner object) {
		Owner savedOwner = null;
		if(object != null) {
			if(object.getPets() != null) {
				object.getPets().forEach(pet -> {
					if(pet.getPetType() != null) {
						if(pet.getPetType().getId() == null) {
							pet.setPetType(petTypeService.save(pet.getPetType()));
						}
						
					}else {
						throw new RuntimeException("Pet Type is required");
					}
					
					if(pet.getId() == null) {
						Pet savedPet = petService.save(pet);
						pet.setId(savedPet.getId());
					}
				});
			}
			return super.save(object);
		}else {
			return null;
		}
		
	}

	@Override
	public Owner findByLastName(String lastName) {
		// TODO Auto-generated method stub
		return null;
	}

}
