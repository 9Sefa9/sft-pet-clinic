package guru.springframework.sftpetclinic.bootstrap;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import guru.springframework.sftpetclinic.model.Owner;
import guru.springframework.sftpetclinic.model.Pet;
import guru.springframework.sftpetclinic.model.PetType;
import guru.springframework.sftpetclinic.model.Speciality;
import guru.springframework.sftpetclinic.model.Vet;
import guru.springframework.sftpetclinic.services.OwnerService;
import guru.springframework.sftpetclinic.services.PetTypeService;
import guru.springframework.sftpetclinic.services.SpecialitiesService;
import guru.springframework.sftpetclinic.services.VetService;
import guru.springframework.sftpetclinic.services.map.OwnerServiceMap;
import guru.springframework.sftpetclinic.services.map.VetServiceMap;

@Component
public class DataLoader implements CommandLineRunner{

	private final OwnerService ownerService;
	private final VetService vetService;
	private final PetTypeService petTypeService;
	private final SpecialitiesService specialitiesService; 
	
	@Autowired
	public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService, SpecialitiesService specialitiesService) {
		this.ownerService = ownerService;
		this.vetService = vetService;
		this.petTypeService = petTypeService;
		this.specialitiesService = specialitiesService;
		//ownerService = new OwnerServiceMap();
		//vetService = new VetServiceMap();
	}
	@Override
	public void run(String... args) throws Exception {
		int count = petTypeService.findAll().size();
		if(count == 0) {
			loadData();	
		}
		
		
	}
	private void loadData() {
		PetType dog = new PetType();
		dog.setName("Doggy");
		PetType savedDogType = petTypeService.save(dog);
		

		PetType cat = new PetType();
		cat.setName("Doggy");
		PetType savedCatType = petTypeService.save(cat);
		
		Speciality radiology = new Speciality();
		radiology.setDescription("radiology");
		Speciality  savedRadiology = specialitiesService.save(radiology);
		
		Speciality surgery = new Speciality();
		surgery.setDescription("surgery");
		Speciality  savedSurgery = specialitiesService.save(surgery);
		
		Speciality dentistry = new Speciality();
		dentistry.setDescription("dentistry");
		Speciality  savedDentistry = specialitiesService.save(dentistry);
		
		
		Owner owner1 = new Owner();
		owner1.setFirstName("Michael");
		owner1.setLastName("Weston");
		owner1.setAddress("123 Bäckereistr");
		owner1.setCity("miami");
		owner1.setTelephone("+93724893");
		
		Pet michsPet= new Pet();
		michsPet.setPetType(savedDogType);
		michsPet.setOwner(owner1);
		michsPet.setBirthDate(LocalDate.now());
		michsPet.setName("resho");
		owner1.getPets().add(michsPet);
		ownerService.save(owner1);
		
		Owner owner2 = new Owner();
		owner2.setFirstName("Fiona");
		owner2.setLastName("Ador");
		owner2.setAddress("123 Breistr");
		owner2.setCity("newyork");
		owner2.setTelephone("424983724893");
		
		Pet fionPet= new Pet();
		fionPet.setPetType(savedCatType);
		fionPet.setOwner(owner2);
		fionPet.setBirthDate(LocalDate.now());
		fionPet.setName("fioresho");
		owner2.getPets().add(fionPet);
		
		ownerService.save(owner2);
		
		System.out.println("Owners Loaded.");
		
		Vet vet1= new Vet();
		vet1.setFirstName("Heri");
		vet1.setLastName("Wolleh");
		vet1.getSpecialities().add(savedRadiology);
		vetService.save(vet1);
		
		Vet vet2= new Vet();
		vet2.setFirstName("mezeke");
		vet2.setLastName("ekezem");
		vet2.getSpecialities().add(savedSurgery);
		
		vetService.save(vet2);
		
		System.out.println("Vets Loaded.");
	}

}
