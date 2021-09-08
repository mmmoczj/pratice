package design_pattern.proxy.static_proxy;

public class Client {
    public static void main(String[] args) {
        new OrderServiceProxy().order();
    }
}
