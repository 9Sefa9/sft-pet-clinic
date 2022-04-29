package guru.springframework.sftpetclinic.bootstrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import guru.springframework.sftpetclinic.model.Owner;
import guru.springframework.sftpetclinic.model.Vet;
import guru.springframework.sftpetclinic.services.OwnerService;
import guru.springframework.sftpetclinic.services.VetService;
import guru.springframework.sftpetclinic.services.map.OwnerServiceMap;
import guru.springframework.sftpetclinic.services.map.VetServiceMap;

@Component
public class DataLoader implements CommandLineRunner{

	private final OwnerService ownerService;
	private final VetService vetService;
	
	@Autowired
	public DataLoader(OwnerService ownerService, VetService vetService) {
		
		this.ownerService = ownerService;
		this.vetService = vetService;
		//ownerService = new OwnerServiceMap();
		//vetService = new VetServiceMap();
	}
	@Override
	public void run(String... args) throws Exception {
		
		Owner owner1 = new Owner();
		owner1.setId(1L);
		owner1.setFirstName("Michael");
		owner1.setLastName("Weston");
		
		ownerService.save(owner1);
		
		Owner owner2 = new Owner();
		owner2.setId(2L);
		owner2.setFirstName("Fiona");
		owner2.setLastName("Ador");
		
		ownerService.save(owner2);
		
		System.out.println("Owners Loaded.");
		
		Vet vet1= new Vet();
		vet1.setId(1L);
		vet1.setFirstName("Heri");
		vet1.setLastName("Wolleh");
		
		vetService.save(vet1);
		
		Vet vet2= new Vet();
		vet2.setId(2L);
		vet2.setFirstName("mezeke");
		vet2.setLastName("ekezem");
		
		vetService.save(vet2);
		
		System.out.println("Vets Loaded.");
		
	}

}
