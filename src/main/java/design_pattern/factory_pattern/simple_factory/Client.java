package design_pattern.factory_pattern.simple_factory;

public class Client {
    public static void main(String[] args) {
        ProductFactory.makeProduct(Const.PRODUCT_2).show();
    }
}
