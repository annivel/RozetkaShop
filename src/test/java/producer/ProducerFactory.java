package producer;

import java.util.ResourceBundle;

public class ProducerFactory{
    public static ResourceBundle producer = ResourceBundle.getBundle("producer");

    public static ProducerName getProducerName (){
        return new ProducerName(producer.getString("producer"),producer.getString("item"));
    }
}
