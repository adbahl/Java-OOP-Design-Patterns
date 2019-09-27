package Singleton;

/**
 * DesignPattern.java: Main method testing the code.
 * Created by Arvind Bahl
 */
public class DesignPattern {

    public static void main(String[] args){

        Singleton firstinstance = Singleton.getInstance();

        //Singleton secondinstance = Singleton.getInstance();
        // this give as error as we have set the constructor as private to make the class Singleton.
        //Singleton secondinstance = new Singleton();

    }
}
