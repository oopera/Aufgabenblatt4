package de.hrw.progra2.assignment4;

import com.sun.source.tree.LabeledStatementTree;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Fruit fruit = new Fruit("Apfel", new Vector3D(2,5,5),true,70);
        System.out.println(fruit);

        AbstractGameElement punisher = new Weapon("punisher", new Vector3D(4,6,5), true, 55.5);
        System.out.println(punisher);

        AbstractGameElement malphite = new Stone("Malphite", new Vector3D(4,5,4), false, 555);
        System.out.println(malphite);

        AbstractGameElement dozent = new Monster("Malte, the Buster", new Vector3D(5,8,1), 420, 187, 666);
        System.out.println(dozent);

        AbstractGameElement ich = new PayingCustomerPlayer("Syphie", new Vector3D(8,4,6),800,420, "gangViolence", 30,  new AbstractGameElement[]{punisher, malphite, fruit});
        System.out.println(ich);

        AbstractGameElement admin = new GameAdmin("Boss", new Vector3D(7.5,8.6,6.5),100,100,false,"Admin");
        System.out.println(admin);

        World World = new World();
        World.addObject(admin);
        World.addObject(malphite);
        World.addObject(dozent);
        System.out.println(World);
        World.removeObject(malphite);
        System.out.println(World);

    }
}
