package design_pattern.factory_pattern.factory_method.example.factory;

import com.cynovan.neptune.open.addons.prototype.backend.bean.factory_pattern.factory_method.example.product.FileLogger;
import com.cynovan.neptune.open.addons.prototype.backend.bean.factory_pattern.factory_method.example.product.Logger;

public class FileLoggerFactory implements LoggerFactory {
    @Override
    public Logger createLogger() {
        Logger logger = new FileLogger();
        // 创建文件
        // ......
        return logger;
    }
}
