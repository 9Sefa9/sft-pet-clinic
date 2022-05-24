package guru.springframework.sftpetclinic.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import guru.springframework.sftpetclinic.model.Speciality;
import guru.springframework.sftpetclinic.model.Vet;
import guru.springframework.sftpetclinic.services.CrudService;
import guru.springframework.sftpetclinic.services.SpecialitiesService;
import guru.springframework.sftpetclinic.services.VetService;

@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService{
	
	private final SpecialitiesService specialtiesService;
	
	public VetServiceMap(SpecialitiesService specialtiesService) {
		this.specialtiesService = specialtiesService;
	}

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
		if(object.getSpecialities().size() > 0) {
			object.getSpecialities().forEach(speciality ->{
				if(speciality.getId() == null) {
					Speciality savedSpeciality = specialtiesService.save(speciality);
					speciality.setId(savedSpeciality.getId());
				}
			});
		}
		return super.save(object);
	}

}
