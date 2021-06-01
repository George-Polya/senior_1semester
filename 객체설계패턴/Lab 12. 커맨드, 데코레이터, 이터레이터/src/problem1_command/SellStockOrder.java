package problem1_command;

public class SellStockOrder implements Order {
    private StockTrade sell;

    public SellStockOrder(StockTrade sell) {
        this.sell = sell;
    }

    @Override
    public void execute() {
        sell.sell();
    }
}
