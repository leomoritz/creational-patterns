package br.com.cod3r.factory.apple;

import br.com.cod3r.factory.apple.factory.Iphone11ProFactoryImpl;
import br.com.cod3r.factory.apple.factory.IphoneXFactoryImpl;
import br.com.cod3r.factory.apple.halffactory.Iphone11HalfFactoryImpl;
import br.com.cod3r.factory.apple.halffactory.IphoneXHalfFactoryImpl;
import br.com.cod3r.factory.apple.model.IPhone;
import br.com.cod3r.factory.apple.simplefactory.IPhoneSimpleFactory;

public class Client {
	
	public static void main(String[] args) {

		//FACTORY METHOD
		System.out.println("### Ordering an iPhone X");
		IPhone iphoneX = new IphoneXFactoryImpl().orderIphone();
		
		System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
		IPhone iPhone11Pro = new Iphone11ProFactoryImpl().orderIphone();

		// HALF FACTORY METHOD
		System.out.println("\n\n### Ordering an iPhone X");
		IPhone iphoneXHF = new IphoneXHalfFactoryImpl().orderIphone("standard");

		System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
		IPhone iPhone11ProHF = new Iphone11HalfFactoryImpl().orderIphone("highend");

		// SIMPLE FACTORY METHOD
		System.out.println("\n\n### Ordering an iPhone X");
		IPhone iphoneXSF = new IPhoneSimpleFactory().orderIphone("X", "standard");

		System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
		IPhone iPhone11ProSF = new IPhoneSimpleFactory().orderIphone("11", "highend");

		System.out.println("\n\n### Ordering an iPhone does not exists");
		IPhone iPhone14SF = new IPhoneSimpleFactory().orderIphone("14", "highend");

	}
}
