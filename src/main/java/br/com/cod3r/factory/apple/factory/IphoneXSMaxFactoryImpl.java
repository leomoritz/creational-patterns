package br.com.cod3r.factory.apple.factory;

import br.com.cod3r.factory.apple.model.IPhone;
import br.com.cod3r.factory.apple.model.IPhoneXSMax;

public class IphoneXSMaxFactoryImpl extends IPhoneFactory {
    @Override
    protected IPhone createDevice() {
        return new IPhoneXSMax();
    }
}
