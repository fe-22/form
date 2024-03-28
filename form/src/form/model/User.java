package form.model;

import java.time.LocalDate;
import java.util.Objects;
import java.util.UUID;



import form.dao.UserDao;

public class User {
	
	private UUID id;
	private String name;
	private String email;
	private String cpf;
	private LocalDate dateOfBirth;
	private String andress;
	private String phone;
	


	public User(UUID id, String name, String email, String cpf, LocalDate dateOfBirth, String andress, String phone) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.cpf = cpf;
		this.dateOfBirth = dateOfBirth;
		this.andress = andress;
		this.phone = phone;
	}

	public User() {
		// TODO Auto-generated constructor stub
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getAndress() {
		return andress;
	}

	public void setAndress(String andress) {
		this.andress = andress;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(id, other.id);
	}

	public void setUserDao(UserDao userDao) {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
