package design_pattern.strategy_pattern.example.strategy;

public class IntermediateMemberStrategy implements MemberStrategy {
    @Override
    public double calcPrice(double bookPrice) {
        return bookPrice * 0.9;
    }
}
