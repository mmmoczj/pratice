package design_pattern.factory_pattern.factory_method.example.product;

public class FileLogger implements Logger {
    @Override
    public void writeLog() {
        System.out.println("文件日志记录");
    }
}
