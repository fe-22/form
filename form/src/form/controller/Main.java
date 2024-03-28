package form.controller;

import form.dao.UserDao;
import form.model.User;
import form.view.UserRegistration;

public class Main {

	public static void main(String[] args) {
		// Crie uma instância da visão
		UserRegistration view = new UserRegistration();

		// Crie uma instância do modelo
		User userModel = new User();

		// Crie uma instância do DAO
		UserDao userDao = new UserDao();

		// Crie uma instância do controlador e passe a visão e o modelo para ele
		UserRegistrationController controller = new UserRegistrationController(view, userModel);

		// Adicione o DAO ao modelo para que o controlador possa usá-lo
		userModel.setUserDao(userDao);
	}

}


