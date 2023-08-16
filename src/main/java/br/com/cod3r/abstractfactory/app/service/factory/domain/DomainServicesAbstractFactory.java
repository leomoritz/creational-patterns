package br.com.cod3r.abstractfactory.app.service.factory.domain;

import br.com.cod3r.abstractfactory.app.service.services.Service;

public interface DomainServicesAbstractFactory {

    Service createEJBService();

    Service createRestApiService();
}
