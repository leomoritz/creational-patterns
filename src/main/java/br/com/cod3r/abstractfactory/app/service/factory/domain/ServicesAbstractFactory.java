package br.com.cod3r.abstractfactory.app.service.factory.domain;

import br.com.cod3r.abstractfactory.app.service.services.Service;

public interface ServicesAbstractFactory {

    Service createEJBService();

    Service createRestApiService();
}
