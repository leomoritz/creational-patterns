package br.com.cod3r.abstractfactory.app.service.factory.domain;

import br.com.cod3r.abstractfactory.app.service.services.CarEJBService;
import br.com.cod3r.abstractfactory.app.service.services.CarRestApiService;
import br.com.cod3r.abstractfactory.app.service.services.CarService;

public class CarServiceFactoryImpl implements DomainServicesAbstractFactory {
    @Override
    public CarService createEJBService() {
        return new CarEJBService();
    }

    @Override
    public CarService createRestApiService() {
        return new CarRestApiService();
    }
}
