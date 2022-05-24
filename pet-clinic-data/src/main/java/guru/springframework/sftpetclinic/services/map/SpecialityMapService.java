package guru.springframework.sftpetclinic.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import guru.springframework.sftpetclinic.model.Speciality;
import guru.springframework.sftpetclinic.services.SpecialitiesService;

@Service
public class SpecialityMapService extends AbstractMapService<Speciality, Long> implements SpecialitiesService {

	@Override
	public Set<Speciality> findAll() {
		return super.findAll();
	}

	@Override
	public Speciality findById(Long id) {
		return super.findById(id);
	}

	@Override
	public Speciality save(Speciality object) {

		return super.save(object);
	}

	public void delete(Speciality object) {
		super.delete(object);
	}

	public void deleteById(Long id) {
		super.deleteById(id);
	}
}
