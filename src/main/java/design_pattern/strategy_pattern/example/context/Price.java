package design_pattern.strategy_pattern.example.context;


import design_pattern.strategy_pattern.example.strategy.MemberStrategy;

public class Price {
    private MemberStrategy memberStrategy;

    public Price(MemberStrategy memberStrategy) {
        this.memberStrategy = memberStrategy;
    }

    public double quote(double bookPrice) {
        return this.memberStrategy.calcPrice(bookPrice);
    }
}
