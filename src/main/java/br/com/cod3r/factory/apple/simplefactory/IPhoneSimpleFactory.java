package br.com.cod3r.factory.apple.simplefactory;

import br.com.cod3r.factory.apple.model.*;

import java.util.HashMap;
import java.util.Map;

public class IPhoneSimpleFactory {

    public IPhone orderIphone(String generation, String level) {
        IPhone device = getDevicesFromGeneration(generation).get(level);

        if (device == null) {
            throw new RuntimeException("Não foi possível construir o Iphone informado!");
        }

        device.getHardware();
        device.assemble();
        device.certificates();
        device.pack();

        return device;
    }

    private Map<String, IPhone> getDevicesFromGeneration(String generation) {
        Map<String, IPhone> deviceLevelMap = new HashMap<>();
        if ("11".equals(generation)) {
            deviceLevelMap.put("standard", new IPhone11());
            deviceLevelMap.put("highend", new IPhone11Pro());
        } else if ("X".equalsIgnoreCase(generation)) {
            deviceLevelMap.put("standard", new IPhoneX());
            deviceLevelMap.put("highend", new IPhoneXSMax());
        }

        return deviceLevelMap;
    }
}
