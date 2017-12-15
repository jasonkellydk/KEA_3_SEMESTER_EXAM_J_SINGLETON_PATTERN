package dk.kea.examples.Logic;

public class ClassicSingletonLazy
{
    private static ClassicSingletonLazy instance = null;

    private ClassicSingletonLazy()
    {}

    public static ClassicSingletonLazy getInstance()
    {
        if (instance == null) {
            System.out.println("Instance doesn't exist, creating instant\n");

            instance = new ClassicSingletonLazy();
        }

        return instance;
    }

    public void showMessage()
    {
        System.out.println("Hello World! Im Lazy!\n");
    }
}
