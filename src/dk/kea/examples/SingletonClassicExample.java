package dk.kea.examples;

import dk.kea.ExampleInterface;
import dk.kea.examples.Logic.ClassicSingletonLazy;

public class SingletonClassicExample implements ExampleInterface
{
    @Override
    public String getDescription()
    {
        return "This example will show a classic implementation of singleton";
    }

    @Override
    public String getName()
    {
        return "Classic singleton";
    }

    @Override
    public void runExample()
    {
        //Tries to get an instance of the ClassicSingletonLazy
        //If it doesn't exist, it will be created(aka lazy) just ones and cant be created again.
        ClassicSingletonLazy.getInstance();

        //The second time, it wont be created and show the instance message.
        ClassicSingletonLazy.getInstance();
        ClassicSingletonLazy.getInstance().showMessage();
    }
}
