package br.com.cod3r.factory.apple.halffactory;

import br.com.cod3r.factory.apple.model.IPhone;
import br.com.cod3r.factory.apple.model.IPhoneX;
import br.com.cod3r.factory.apple.model.IPhoneXSMax;

public class IphoneXHalfFactoryImpl extends IPhoneHalfFactory {

    @Override
    protected IPhone createDevice(String level) {
        if ("standard".equalsIgnoreCase(level)) {
            return new IPhoneX();
        } else if ("highend".equalsIgnoreCase(level)) {
            return new IPhoneXSMax();
        } else return null;
    }
}
