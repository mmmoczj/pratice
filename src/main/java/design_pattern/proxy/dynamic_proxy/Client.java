package design_pattern.proxy.dynamic_proxy;

public class Client {
    public static void main(String[] args) {
        JdkInvocationHandler jdkInvocationHandler = new JdkInvocationHandler(new OrderServiceImpl());
        OrderService orderService = jdkInvocationHandler.getProxy();
        orderService.order();
    }
}
