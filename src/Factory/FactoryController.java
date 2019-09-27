package Factory;

/**
 * This class is instantiated by the main class.
 * Created by arvin on 9/28/2019.
 */
public class FactoryController {

    public FactoryPattern getInstance(String message){

        if (message.equals("Electric")){
            return new Tesla();
        }
        else if (message.equals("Autonomous")){
            return new BMW();
        }
        else{
            return new Audi();
        }
    }
}
