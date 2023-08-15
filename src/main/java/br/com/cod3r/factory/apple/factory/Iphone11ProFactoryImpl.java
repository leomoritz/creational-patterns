package br.com.cod3r.factory.apple.factory;

import br.com.cod3r.factory.apple.model.IPhone;
import br.com.cod3r.factory.apple.model.IPhone11Pro;

public class Iphone11ProFactoryImpl extends IPhoneFactory {
    @Override
    protected IPhone createDevice() {
        return new IPhone11Pro();
    }
}
