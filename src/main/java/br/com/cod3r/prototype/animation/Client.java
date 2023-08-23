package br.com.cod3r.prototype.animation;

import br.com.cod3r.prototype.animation.model.Person;
import br.com.cod3r.prototype.animation.model.PersonSamples;

import java.util.ArrayList;
import java.util.List;

public class Client {
    private static final List<Person> frames = new ArrayList<>();

    public static void animate() throws InterruptedException {
        System.out.println("*********************************");
        System.out.println("* ");
        System.out.println("* Adjust your screen's height!");
        System.out.println("* ");
        System.out.print("*********************************");
        Thread.sleep(3000);
        for (Person frame : frames) {
            frame.draw();
            Thread.sleep(500);
        }
        System.out.println("**********************");
        System.out.println("* ");
        System.out.println("* The End!");
        System.out.println("* ");
        System.out.print("**********************");
    }

    interface IPerson {
        Person addPosition(Person person);
    }

	public static Person addLeft(Person person) {
		try {
			person = (Person) person.clone();
			person.left();
			frames.add(person);
			return person;
		} catch (Exception e) {
			throw new RuntimeException("Não foi possível adicionar a posição. Causa: " + e.getMessage());
		}
	}

    public static Person addRight(Person person) {
		try {
			person = (Person) person.clone();
			person.right();
			frames.add(person);
			return person;
		} catch (Exception e) {
			throw new RuntimeException("Não foi possível adicionar a posição. Causa: " + e.getMessage());
		}
    }

    public static void addPersonFrames(IPerson function, Person person, int times) {
        for (int i = 0; i < times; i++) {
            person = function.addPosition(person);
        }
    }

    public static void main(String[] args) throws CloneNotSupportedException, InterruptedException {
        PersonSamples personSamples = new PersonSamples();
        Person person = personSamples.get("fatMan");

        addPersonFrames(Client::addLeft, person, 5);
        addPersonFrames(Client::addRight, person, 5);

        animate();
    }
}
