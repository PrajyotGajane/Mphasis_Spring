package org.mphasis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component
public class SingletonBean {

    @Autowired
    private PrototypeBean bean;

    public void showMessage(){
//        PrototypeBean bean = getPrototypeBean();
        System.out.println("The time is "+bean.getDateTime());
    }
//
//    @Lookup
//    public PrototypeBean getPrototypeBean(){
//        return null;
//    }
}