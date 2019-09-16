/**
 * Singleton Class created.
 * This restricts the instantiation of a class to one single instance.
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
