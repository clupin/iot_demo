package com.example.demo;

import com.adventurer.springserialport.connector.AbstractSpringSerialPortConnector;
import gnu.io.NoSuchPortException;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.TooManyListenersException;

@Component
public class SpringSerialPortConnector extends AbstractSpringSerialPortConnector {

    @PostConstruct
    public void init() throws NoSuchPortException, TooManyListenersException {
        System.out.println("holo");
        super.connect();
    }

    @Override
    public void processData(String s) {
        System.out.println(s);
    }
}
