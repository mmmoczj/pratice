package design_pattern.strategy_pattern.example.strategy;

public class PrimaryMemberStrategy implements MemberStrategy {
    @Override
    public double calcPrice(double bookPrice) {
        return bookPrice;
    }
}
