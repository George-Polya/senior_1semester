package problem1_command;

public class Client {
    public static void main(String[] args) {
        StockTrade stock = new StockTrade();
        BuyStockOrder buyStockOrder = new BuyStockOrder(stock);
        SellStockOrder sellStockOrder = new SellStockOrder(stock);
        Agent agent = new Agent();
        agent.placeOrder(buyStockOrder);
        agent.placeOrder(sellStockOrder);

    }
}
