package guru.springframework.sftpetclinic.services.map;

import java.util.Set;

import guru.springframework.sftpetclinic.model.Owner;
import guru.springframework.sftpetclinic.services.CrudService;

public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements CrudService<Owner, Long>{

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
		// TODO Auto-generated method stub
		return super.save(object.getId(),object);
	}

}
