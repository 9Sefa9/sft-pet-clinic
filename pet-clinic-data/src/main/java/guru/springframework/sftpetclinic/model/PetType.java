package guru.springframework.sftpetclinic.model;

public class PetType extends BaseEntity{

	private String name;
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
}

