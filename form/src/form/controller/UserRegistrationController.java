package form.controller;

import java.time.LocalDate;


import form.model.User;
import form.view.UserRegistration;

public class UserRegistrationController {
	
	private UserRegistration view;
	private User userModel;
	
	
	public UserRegistrationController(UserRegistration view, User userModel) {
		
		super();
		this.view = view;
		this.userModel = userModel;
		
		view.addSaveButtonListener(e -> saveUser());
	}
	
	private void saveUser() {
		
		String name = view.getName();
		String email = view.getEmail();
		String cpf = view.getCpf();
		LocalDate dateOfBirth = LocalDate.now();
		String address = view.getAddress();
		String phone = view.getPhone();
		
		if (name.isEmpty() || email.isEmpty()) {
			view.displayErrorMessage("Por favor, preencha todos os campos.");
			
			return;
			
		}
		
		userModel.setName(name);
		userModel.setEmail(email);
		userModel.setCpf(cpf);
		userModel.setDateOfBirth(dateOfBirth);
		userModel.setAndress(address);
		userModel.setPhone(phone);
		
		view.displayErrorMessage("Usuário cadastrado com sucesso!");
	}
	
	

}
