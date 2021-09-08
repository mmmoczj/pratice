package design_pattern.factory_pattern.abstract_factory.example1.factory;

import com.cynovan.neptune.open.addons.prototype.backend.bean.factory_pattern.abstract_factory.example1.product.computer.Computer;
import com.cynovan.neptune.open.addons.prototype.backend.bean.factory_pattern.abstract_factory.example1.product.phone.Phone;

public interface AbstractFactory {

    public Phone producePhone();

    public Computer produceComputer();
}
