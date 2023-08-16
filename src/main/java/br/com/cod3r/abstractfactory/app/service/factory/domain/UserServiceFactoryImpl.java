package br.com.cod3r.abstractfactory.app.service.factory.domain;

import br.com.cod3r.abstractfactory.app.service.services.UserEJBService;
import br.com.cod3r.abstractfactory.app.service.services.UserRestApiService;
import br.com.cod3r.abstractfactory.app.service.services.UserService;

public class UserServiceFactoryImpl implements DomainServicesAbstractFactory {
    @Override
    public UserService createEJBService() {
        return new UserEJBService();
    }

    @Override
    public UserService createRestApiService() {
        return new UserRestApiService();
    }
}
