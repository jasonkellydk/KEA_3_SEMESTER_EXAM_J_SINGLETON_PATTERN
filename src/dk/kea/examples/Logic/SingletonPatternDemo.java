package dk.kea.examples.Logic;

public class SingletonPatternDemo
{
    public static void main(String[] args) {
        //illegal construct
        //Compile Time Error: The constructor SingleObject() is not visible
        //SingleObject object = new SingleObject();


        //1. example, not lazy (Singleton Class is created at the time of class loading)
        //Get the only object available
        SingleObject object = SingleObject.getInstance();
        //show the message
        object.showMessage();


        //2. example
        //Tries to get an instance of the ClassicSingletonLazy
        //If it doesn't exist, it will be created(aka lazy) just ones and cant be created again.
        ClassicSingletonLazy.getInstance();
        //The second time, it wont be created and show the instance message.
        ClassicSingletonLazy.getInstance();
        ClassicSingletonLazy.getInstance().showMessage();

    }
}