package br.com.cod3r.factory.apple.halffactory;

import br.com.cod3r.factory.apple.model.IPhone;
import br.com.cod3r.factory.apple.model.IPhone11;
import br.com.cod3r.factory.apple.model.IPhone11Pro;

public class Iphone11HalfFactoryImpl extends IPhoneHalfFactory {

    @Override
    protected IPhone createDevice(String level) {
        if ("standard".equalsIgnoreCase(level)) {
            return new IPhone11();
        } else if ("highend".equalsIgnoreCase(level)) {
            return new IPhone11Pro();
        } else return null;
    }
}
