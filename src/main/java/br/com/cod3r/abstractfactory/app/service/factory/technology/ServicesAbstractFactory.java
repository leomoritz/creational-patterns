package br.com.cod3r.abstractfactory.app.service.factory.technology;

import br.com.cod3r.abstractfactory.app.service.services.CarService;
import br.com.cod3r.abstractfactory.app.service.services.UserService;

public interface ServicesAbstractFactory {

    CarService createCarService();

    UserService createUserService();

}
