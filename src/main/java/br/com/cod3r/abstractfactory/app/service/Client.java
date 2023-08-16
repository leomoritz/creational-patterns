package br.com.cod3r.abstractfactory.app.service;

import br.com.cod3r.abstractfactory.app.service.factory.domain.CarServiceFactoryImpl;
import br.com.cod3r.abstractfactory.app.service.factory.domain.UserServiceFactoryImpl;
import br.com.cod3r.abstractfactory.app.service.factory.technology.EJBServiceFactoryImpl;
import br.com.cod3r.abstractfactory.app.service.factory.technology.RestApiServiceFactoryImpl;
import br.com.cod3r.abstractfactory.app.service.factory.technology.ServicesAbstractFactory;
import br.com.cod3r.abstractfactory.app.service.services.CarService;
import br.com.cod3r.abstractfactory.app.service.services.UserService;

public class Client {

	public static void main(String[] args) {

		// Testando a implementação dos serviços de acordo com a tecnologia informada
		ServicesAbstractFactory factoryRest = new RestApiServiceFactoryImpl();
		CarService carServiceRest = factoryRest.createCarService();
		UserService userServiceRest = factoryRest.createUserService();

		carServiceRest.save("Clio");
		carServiceRest.update("HB20");

		userServiceRest.save("leonidas");
		userServiceRest.delete(1);

		ServicesAbstractFactory factoryEJB = new EJBServiceFactoryImpl();

		CarService carServiceEJB = factoryEJB.createCarService();
		UserService userServiceEJB = factoryEJB.createUserService();

		carServiceEJB.save("Clio");
		carServiceEJB.update("HB20");

		userServiceEJB.save("leonidas");
		userServiceEJB.delete(1);

		// Testando a implementação das tecnologias de acordo com o serviço de domínio informado
		CarServiceFactoryImpl carFactory = new CarServiceFactoryImpl();
		carServiceEJB = carFactory.createEJBService();
		carServiceEJB.save("Hilux");
		carServiceEJB.update("Ranger");

		carServiceRest = carFactory.createRestApiService();
		carServiceRest.save("Hilux");
		carServiceRest.update("Ranger");

		UserServiceFactoryImpl userFactory = new UserServiceFactoryImpl();
		userServiceEJB = userFactory.createEJBService();
		userServiceEJB.save("bruna");
		userServiceEJB.delete(2);

		userServiceRest = userFactory.createRestApiService();
		userServiceRest.save("bruna");
		userServiceRest.delete(2);
	}
}
