package design_pattern.factory_pattern.factory_method.example.factory;


import design_pattern.factory_pattern.factory_method.example.product.DatabaseLogger;
import design_pattern.factory_pattern.factory_method.example.product.Logger;

public class DatabaseLoggerFactory implements LoggerFactory {
    @Override
    public Logger createLogger() {
        // 连接数据库
        // .....
        Logger logger = new DatabaseLogger();
        // 初始化
        return logger;
    }
}
