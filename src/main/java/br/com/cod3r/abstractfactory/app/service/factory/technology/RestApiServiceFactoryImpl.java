package br.com.cod3r.abstractfactory.app.service.factory.technology;

import br.com.cod3r.abstractfactory.app.service.services.CarRestApiService;
import br.com.cod3r.abstractfactory.app.service.services.CarService;
import br.com.cod3r.abstractfactory.app.service.services.UserRestApiService;
import br.com.cod3r.abstractfactory.app.service.services.UserService;

public class RestApiServiceFactoryImpl implements ServicesAbstractFactory {
    @Override
    public CarService createCarService() {
        return new CarRestApiService();
    }

    @Override
    public UserService createUserService() {
        return new UserRestApiService();
    }
}
