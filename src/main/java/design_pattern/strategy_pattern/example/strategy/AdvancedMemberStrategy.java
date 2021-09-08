package design_pattern.strategy_pattern.example.strategy;

public class AdvancedMemberStrategy implements MemberStrategy {
    @Override
    public double calcPrice(double bookPrice) {
        return bookPrice * 0.8;
    }
}
