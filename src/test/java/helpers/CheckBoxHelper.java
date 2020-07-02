package helpers;

import producer.ProducerName;
import tools.CheckBoxField;

public class CheckBoxHelper extends CheckBoxField {
    public void checkBoxSelect(String producer){
        setSearchField(producer);
        setSelectProducer();

    }
    public void checkBoxSelect (ProducerName producerName){
        checkBoxSelect(producerName.producer);

    }
}
