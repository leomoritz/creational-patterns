package br.com.cod3r.abstractfactory.app.service.factory.domain;

import br.com.cod3r.abstractfactory.app.service.services.Service;
import br.com.cod3r.abstractfactory.app.service.services.UserEJBService;
import br.com.cod3r.abstractfactory.app.service.services.UserRestApiService;

public class UserServiceFactoryImpl implements ServicesAbstractFactory {
    @Override
    public Service createEJBService() {
        return new UserEJBService();
    }

    @Override
    public Service createRestApiService() {
        return new UserRestApiService();
    }
}
