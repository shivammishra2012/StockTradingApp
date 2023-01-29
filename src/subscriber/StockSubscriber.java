package subscriber;

import Entity.StockName;
import Entity.StockValue;

public interface StockSubscriber {
    void updateStock(StockName stockName, StockValue stockValue);
}
