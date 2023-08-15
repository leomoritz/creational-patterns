package br.com.cod3r.factory.apple.factory;

import br.com.cod3r.factory.apple.model.IPhone;
import br.com.cod3r.factory.apple.model.IPhoneX;

public class IphoneXFactoryImpl extends IPhoneFactory {
    @Override
    protected IPhone createDevice() {
        return new IPhoneX();
    }
}
