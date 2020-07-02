package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import producer.ProducerFactory;
import producer.ProducerName;
import user.UserCabinet;
import user.UserCabinetFactory;

public class SetUp {
    public App app= new App();
    public UserCabinet cabinet = UserCabinetFactory.getUserInfo();
    public ProducerName producerName = ProducerFactory.getProducerName();


    }

