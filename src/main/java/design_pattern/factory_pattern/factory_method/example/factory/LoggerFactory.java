package design_pattern.factory_pattern.factory_method.example.factory;


import design_pattern.factory_pattern.factory_method.example.product.Logger;

public interface LoggerFactory {
    public Logger createLogger();
}
