package design_pattern.proxy.static_proxy;

public class OrderServiceProxy implements OrderService {

    private OrderService orderService;

    public OrderServiceProxy() {
        this.orderService = new OrderServiceImpl();
    }

    public OrderServiceProxy(OrderService orderService) {
        this.orderService = orderService;
    }

    @Override
    public void order() {
        System.out.println("日志收集开始...");
        orderService.order();
        System.out.println("日志收集结束...");
    }
}
