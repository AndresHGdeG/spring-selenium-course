package com.udemy.spring.springseleniumcourse.kelvin.scope;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.SessionId;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.context.support.SimpleThreadScope;

import java.util.Objects;

public class BrowserScope extends SimpleThreadScope {

    /**
     * Check if the session id all ready exist if so, we return that, we return a new object otherwise
     * @param name
     * @param objectFactory
     * @return WebDriver
     */
    @Override
    public Object get(String name, ObjectFactory<?> objectFactory) {
        Object o = super.get(name, objectFactory);
        SessionId sessionId = ((RemoteWebDriver) o).getSessionId();
        if(Objects.isNull(sessionId)){
            super.remove(name);
            o = super.get(name, objectFactory);
        }
        return o;
    }


    @Override
    public void registerDestructionCallback(String name, Runnable callback) {
        // we remove just a log
        //super.registerDestructionCallback(name, callback);
    }
}
