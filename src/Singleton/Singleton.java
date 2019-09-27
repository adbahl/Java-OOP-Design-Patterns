package Singleton;

/**
 * Singleton Class created.
 * No other instance of this class can be created.
 */
public class Singleton {

    private static Singleton singleInstance = null;
    private Singleton(){};
    public static Singleton getInstance (){
        if (singleInstance == null){
            singleInstance = new Singleton();
            System.out.println("Instance created");
        }

        return singleInstance;

    }

}
