package subscriber;

import publisher.StockPublisher;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Entity.Currency;
import Entity.StockValue;
import Entity.StockName;


 public class StockUpdateSubsriber implements StockSubscriber{


    public StockUpdateSubsriber(String name) {
        this.name = name;
    }

    private final String name;

    public StockUpdateSubsriber(String name, Map<StockName, StockValue> stockValues, List<StockPublisher> publishers) {
        this.name = name;
        this.stockValues = new HashMap<>();
        this.publishers = new ArrayList<>();
    }

    private Map<StockName,StockValue> stockValues;




    private List<StockPublisher> publishers;

    @Override
    public void updateStock(StockName stockName, StockValue stockValue) {

        System.out.println(name  + " " +stockName +" "+" "+stockValue.getAmount()+"Amount ");
        if(!stockValues.containsKey(stockName)|| stockValues.get(stockName).getVersionNumber()<stockValue.getVersionNumber())
        {
            stockValues.put(stockName,stockValue);
        }



    }
}
