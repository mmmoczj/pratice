package design_pattern.factory_pattern.abstract_factory.example1.factory;


import design_pattern.factory_pattern.abstract_factory.example1.product.computer.Computer;
import design_pattern.factory_pattern.abstract_factory.example1.product.computer.Mac;
import design_pattern.factory_pattern.abstract_factory.example1.product.phone.Iphone;
import design_pattern.factory_pattern.abstract_factory.example1.product.phone.Phone;

public class AppleFactory implements AbstractFactory {
    @Override
    public Phone producePhone() {
        return new Iphone();
    }

    @Override
    public Computer produceComputer() {
        return new Mac();
    }
}
