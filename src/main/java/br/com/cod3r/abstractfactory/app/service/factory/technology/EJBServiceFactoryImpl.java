package br.com.cod3r.abstractfactory.app.service.factory.technology;

import br.com.cod3r.abstractfactory.app.service.services.CarEJBService;
import br.com.cod3r.abstractfactory.app.service.services.CarService;
import br.com.cod3r.abstractfactory.app.service.services.UserEJBService;
import br.com.cod3r.abstractfactory.app.service.services.UserService;

public class EJBServiceFactoryImpl implements ServicesAbstractFactory {
    @Override
    public CarService createCarService() {
        return new CarEJBService();
    }

    @Override
    public UserService createUserService() {
        return new UserEJBService();
    }
}
