import Entity.Currency;
import Entity.StockName;
import Entity.StockValue;
import publisher.StockPublisher;
import publisher.StockUpdatesPublisher;
import subscriber.StockSubscriber;
import subscriber.StockUpdateSubsriber;

import java.util.Arrays;
import java.util.HashMap;

public class StockSimulator {

    public static void main(String[] args)
    {
        StockPublisher BsePublisher=new StockUpdatesPublisher("Bombayexchange") ;
        StockPublisher NsePublisher=new StockUpdatesPublisher("nseexchange");
        StockSubscriber subscriber1=new StockUpdateSubsriber("subsriber1",new HashMap<>(), Arrays.asList(BsePublisher,NsePublisher));
        StockSubscriber subscriber2=new StockUpdateSubsriber("subsriber2",new HashMap<>(), Arrays.asList(BsePublisher,NsePublisher));
        NsePublisher.subsribe(subscriber1);
        NsePublisher.subsribe(subscriber2);
        BsePublisher.subsribe(subscriber1);
        BsePublisher.subsribe(subscriber2);

        NsePublisher.notifySubscribers(StockName.AMZN,new StockValue(1, Currency.USD,100));
        NsePublisher.notifySubscribers(StockName.AMZN,new StockValue(2,Currency.USD,150));
        BsePublisher.notifySubscribers(StockName.AMZN,new StockValue(1,Currency.USD,100));
        BsePublisher.notifySubscribers(StockName.NETFLIX,new StockValue(1,Currency.USD,100));


    }
}
