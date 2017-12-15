package dk.kea.examples.Logic;

public class SingleObject
{
    //create an object of SingleObject
    private static SingleObject theSingletonObject = new SingleObject();

    /** make the constructor private
     * so that this class cannot be instantiate
     */
    private SingleObject()
    {
    }

    //Get the only object available
    public static SingleObject getInstance()
    {
        return theSingletonObject;
    }

    public void showMessage()
    {
        System.out.println("Hello World! Im not lazy!\n");
    }
}
