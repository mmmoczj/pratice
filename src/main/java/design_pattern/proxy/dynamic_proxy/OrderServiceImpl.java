package design_pattern.proxy.dynamic_proxy;

public class OrderServiceImpl implements OrderService {
    @Override
    public void order() {
        System.out.println("用户下单操作");
    }
}
