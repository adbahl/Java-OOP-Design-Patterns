package Factory;

/**
 * This is main class testing Factory Design Pattern.
 * Created by arvin on 9/28/2019.
 */
public class FactoryMain {


    public static void main(String[] args){

        FactoryController first = new FactoryController();
        FactoryPattern printme1 = first.getInstance("Electric");
        printme1.AboutMe();
        FactoryPattern printme2 = first.getInstance("Autonomous");
        printme2.AboutMe();
        FactoryPattern printme3= first.getInstance("German");
        printme3.AboutMe();

        // Array  object created of type FactoryPattern interface and all three objects added to it.
        FactoryPattern [] ArrayofFactory = new FactoryPattern[3];
        ArrayofFactory[0] = printme1;
        ArrayofFactory[1] = printme2;
        ArrayofFactory[2] = printme3;

            for(FactoryPattern obj1 : ArrayofFactory){

                obj1.AboutMe();
            }
    }
}
