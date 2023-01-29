package publisher;

import Entity.StockName;
import Entity.StockValue;
import subscriber.StockSubscriber;

public interface StockPublisher {
   void  subsribe(StockSubscriber subscriber);
   void  Unsubsribe(StockSubscriber subscriber);
   void notifySubscribers(StockName stockName, StockValue stockValue);
}
