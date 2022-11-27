package Abstract;

public class FactoryProducer {

    public static AbstractFactory getFactory(String factory) {
        if(factory.equals("cse")) {
            return new CseFactory();
        } else if(factory.equals("mechanical")) {
            return new MechanicalFactory();
        } else if(factory.equals("civil")) {
            return new CivilFactory();
        }

        return null;
    };
}
