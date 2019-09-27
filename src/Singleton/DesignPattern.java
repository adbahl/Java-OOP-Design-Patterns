package Singleton;

/**
 * Created by arvin on 9/16/2019.
 */
public class DesignPattern {

    public static void main(String[] args){

        Singleton firstinstance = Singleton.getInstance();

        //Singleton secondinstance = Singleton.getInstance();
        // this give as error as we have set the constructor as private to make the class Singleton.
        //Singleton secondinstance = new Singleton();

    }
}
