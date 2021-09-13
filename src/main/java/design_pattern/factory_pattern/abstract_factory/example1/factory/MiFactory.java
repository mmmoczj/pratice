package design_pattern.factory_pattern.abstract_factory.example1.factory;


import design_pattern.factory_pattern.abstract_factory.example1.product.computer.Computer;
import design_pattern.factory_pattern.abstract_factory.example1.product.computer.MiComputer;
import design_pattern.factory_pattern.abstract_factory.example1.product.phone.MiPhone;
import design_pattern.factory_pattern.abstract_factory.example1.product.phone.Phone;

public class MiFactory implements AbstractFactory {
    @Override
    public Phone producePhone() {
        return new MiPhone();
    }

    @Override
    public Computer produceComputer() {
        return new MiComputer();
    }
}
