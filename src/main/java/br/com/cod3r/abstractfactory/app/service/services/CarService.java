package br.com.cod3r.abstractfactory.app.service.services;

public interface CarService extends Service {
	void save(String model);
	void update(String newModel);
}
