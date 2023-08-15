package br.com.cod3r.factory.apple.halffactory;

import br.com.cod3r.factory.apple.model.IPhone;

public abstract class IPhoneHalfFactory {
    public IPhone orderIphone(String level) {
        IPhone iPhone = createDevice(level);

        if (iPhone == null) {
            throw new RuntimeException("Não foi possível construir o Iphone informado!");
        }

        iPhone.getHardware();
        iPhone.assemble();
        iPhone.certificates();
        iPhone.pack();

        return iPhone;
    }

    protected abstract IPhone createDevice(String level);

}
