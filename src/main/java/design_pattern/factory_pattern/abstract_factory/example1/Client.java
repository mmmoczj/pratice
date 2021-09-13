package design_pattern.factory_pattern.abstract_factory.example1;


import design_pattern.factory_pattern.abstract_factory.example1.factory.AbstractFactory;
import design_pattern.factory_pattern.abstract_factory.example1.factory.AppleFactory;
import design_pattern.factory_pattern.abstract_factory.example1.factory.MiFactory;

public class Client {
    public static void main(String[] args) {
        AbstractFactory factory = new AppleFactory();
        factory.produceComputer().work();

        AbstractFactory factory2 = new MiFactory();
        factory2.producePhone().call();
    }
}
