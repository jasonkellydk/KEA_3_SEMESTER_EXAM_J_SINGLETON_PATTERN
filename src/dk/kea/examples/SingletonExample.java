package dk.kea.examples;

import dk.kea.ExampleInterface;
import dk.kea.examples.Logic.SingleObject;

public class SingletonExample implements ExampleInterface
{
    @Override
    public String getDescription()
    {
        return "This example will show a singleton implementation";
    }

    @Override
    public String getName()
    {
        return "Singleton";
    }

    @Override
    public void runExample()
    {
        //illegal construct
        //Compile Time Error: The constructor SingleObject() is not visible
        //SingleObject object = new SingleObject();

        // example, not lazy (Singleton Class is created at the time of class loading)
        //Get the only object available
        SingleObject object = SingleObject.getInstance();

        //show the message
        object.showMessage();
    }
}
