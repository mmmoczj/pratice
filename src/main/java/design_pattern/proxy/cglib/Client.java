package design_pattern.proxy.cglib;


public class Client {
    public static void main(String[] args) {
        CglibMethodInterceptor cglibMethodInterceptor = new CglibMethodInterceptor();
        Enhancer enhancer = new Enhancer();
        // 设置代理类的付类
        enhancer.setSuperclass(OrderServiceImpl.class);
        // 设置回调对象
        enhancer.setCallback(cglibM`ethodInterceptor);
        // 创建代理对象
        OrderServiceImpl orderServiceImpl = (OrderServiceImpl) enhancer.create();
        orderServiceImpl.order();
    }
}
