package publisher;

import Entity.StockName;
import Entity.StockValue;
import subscriber.StockSubscriber;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class StockUpdatesPublisher implements StockPublisher{

    private final String name ;
    private List<StockSubscriber> subscribers;
    public StockUpdatesPublisher(String name) {
        this.name = name;
        subscribers=new ArrayList<>();
    }


    @Override
    public void subsribe(StockSubscriber subscriber) {

        this.subscribers.add(subscriber);

    }

    @Override
    public void Unsubsribe(StockSubscriber subscriber) {
        this.subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscribers(StockName stockName, StockValue stockValue) {

        for(StockSubscriber subcriber:this.subscribers)
        {
            subcriber.updateStock(stockName,stockValue);
        }

    }
}
