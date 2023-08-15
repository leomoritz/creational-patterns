package br.com.cod3r.factory.apple.factory;

import br.com.cod3r.factory.apple.model.IPhone;
import br.com.cod3r.factory.apple.model.IPhone11;

public class Iphone11FactoryImpl extends IPhoneFactory {

    @Override
    protected IPhone createDevice() {
        return new IPhone11();
    }
}
