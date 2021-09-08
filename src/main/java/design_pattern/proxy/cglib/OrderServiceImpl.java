package design_pattern.proxy.cglib;

public class OrderServiceImpl implements OrderService {
    @Override
    public void order() {
        System.out.println("用户下单操作");
    }
}
