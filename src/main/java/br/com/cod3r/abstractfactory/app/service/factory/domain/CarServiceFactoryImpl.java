package br.com.cod3r.abstractfactory.app.service.factory.domain;

import br.com.cod3r.abstractfactory.app.service.services.CarEJBService;
import br.com.cod3r.abstractfactory.app.service.services.CarRestApiService;
import br.com.cod3r.abstractfactory.app.service.services.Service;

public class CarServiceFactoryImpl implements ServicesAbstractFactory {
    @Override
    public Service createEJBService() {
        return new CarEJBService();
    }

    @Override
    public Service createRestApiService() {
        return new CarRestApiService();
    }
}
