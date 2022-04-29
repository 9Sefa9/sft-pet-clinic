package guru.springframework.sftpetclinic.services.map;

import java.util.Set;

import guru.springframework.sftpetclinic.model.Vet;
import guru.springframework.sftpetclinic.services.CrudService;
import guru.springframework.sftpetclinic.services.VetService;

public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService{

	@Override
	public Vet findById(Long id){
		return super.findById(id);
	}

	@Override
	public Set<Vet> findAll(){
		return super.findAll();
	}

	@Override
	public void deleteById(Long id){
		super.deleteById(id);
	}
	@Override
	public void delete(Vet object){
		super.delete(object);
	}
	@Override
	public Vet save(Vet object) {
		// TODO Auto-generated method stub
		return super.save(object.getId(),object);
	}

}
