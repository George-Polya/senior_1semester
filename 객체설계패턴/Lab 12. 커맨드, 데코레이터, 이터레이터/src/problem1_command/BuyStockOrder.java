package problem1_command;

public class BuyStockOrder implements Order {
    private StockTrade buy;

    public BuyStockOrder(StockTrade buy) {
        this.buy = buy;
    }

    @Override
    public void execute() {
        buy.buy();
    }
}
