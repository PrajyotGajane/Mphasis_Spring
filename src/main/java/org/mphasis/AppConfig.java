package org.mphasis;
//
//import org.springframework.beans.factory.annotation.Lookup;
//import org.springframework.beans.factory.config.ConfigurableBeanFactory;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Scope;
//
//@Configuration
//public class AppConfig {
//
//    @Bean
//    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
//    public PrototypeBean prototypeBean() {
//        return new PrototypeBean();
//    }
//
//    @Bean
//    public SingletonBean singletonBean() {
//        return new SingletonBean();
//    }
//}

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackageClasses = SingletonBean.class)
public class AppConfig {

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public PrototypeBean prototypeBean() {
        return new PrototypeBean();
    }

    public static void main(String[] args) throws InterruptedException {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        SingletonBean bean = context.getBean(SingletonBean.class);
        bean.showMessage();
        Thread.sleep(1000);

        bean = context.getBean(SingletonBean.class);
        bean.showMessage();
    }
}