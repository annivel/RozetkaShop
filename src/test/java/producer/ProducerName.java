package producer;

import java.util.Objects;

public class ProducerName {
    public String producer;
    public String item;

    public ProducerName(String producer, String item) {
        this.producer = producer;
        this.item = item;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProducerName)) return false;
        ProducerName that = (ProducerName) o;
        return Objects.equals(producer, that.producer) &&
                Objects.equals(item, that.item);
    }

    @Override
    public int hashCode() {
        return Objects.hash(producer, item);
    }

    @Override
    public String toString() {
        return "ProducerName{" +
                "producer='" + producer + '\'' +
                ", item='" + item + '\'' +
                '}';
    }
}
