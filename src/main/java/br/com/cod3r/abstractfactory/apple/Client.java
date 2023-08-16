package br.com.cod3r.abstractfactory.apple;

import br.com.cod3r.abstractfactory.apple.factory.IPhone11Factory;
import br.com.cod3r.abstractfactory.apple.factory.IPhoneXFactory;
import br.com.cod3r.abstractfactory.apple.factory.abstractFactory.BrazilRulesFactoryImpl;
import br.com.cod3r.abstractfactory.apple.factory.abstractFactory.CountryRulesAbstractFactory;
import br.com.cod3r.abstractfactory.apple.factory.abstractFactory.USRulesFactoryImpl;
import br.com.cod3r.abstractfactory.apple.model.iphone.IPhone;

public class Client {
	
	public static void main(String[] args) {

		// Intanciando as regras de acordo com cada País.
		CountryRulesAbstractFactory rulesFromUS = new USRulesFactoryImpl();
		CountryRulesAbstractFactory rulesFromBrazil = new BrazilRulesFactoryImpl();

		// Iphone nos Estados Unidos
		IPhone iPhoneXUS = new IPhoneXFactory(rulesFromUS).orderIPhone("standard");
		IPhone iphoneXMaxUS = new IPhoneXFactory(rulesFromUS).orderIPhone("highEnd");
		IPhone iphone11US = new IPhone11Factory(rulesFromUS).orderIPhone("standard");
		IPhone iphone11ProUS = new IPhone11Factory(rulesFromUS).orderIPhone("highEnd");

		// Iphone no Brasil
		IPhone iPhoneXBR = new IPhoneXFactory(rulesFromBrazil).orderIPhone("standard");
		IPhone iphoneXMaxBR = new IPhoneXFactory(rulesFromBrazil).orderIPhone("highEnd");
		IPhone iphone11BR = new IPhone11Factory(rulesFromBrazil).orderIPhone("standard");
		IPhone iphone11ProBR = new IPhone11Factory(rulesFromBrazil).orderIPhone("highEnd");

	}
}
