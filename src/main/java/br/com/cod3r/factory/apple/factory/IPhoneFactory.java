package br.com.cod3r.factory.apple.factory;


import br.com.cod3r.factory.apple.model.IPhone;

public abstract class IPhoneFactory {

    public IPhone orderIphone() {
        IPhone iPhone = createDevice();

        if (iPhone == null) {
            throw new RuntimeException("Não foi possível construir o Iphone informado!");
        }

        iPhone.getHardware();
        iPhone.assemble();
        iPhone.certificates();
        iPhone.pack();

        return iPhone;
    }

    protected abstract IPhone createDevice();
}
