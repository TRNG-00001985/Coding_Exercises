package com.telusko;
import com.telusko.Desktop;
import com.telusko.Alien;
import com.telusko.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;


@Configuration
@ComponentScan("com.telusko")
public class AppConfig {

//
//    @Bean
//    public Alien alien(@Autowired @Qualifier("desktop") Computer com){
//        Alien obj = new Alien();
//        obj.setAge(25);
//        obj.setCom(com);
//        return obj;
//    }
//
//    //@Bean(name = {"com3","desktop1","Desktopbeanname"})
//    @Bean
////    @Scope("prototype")
//    public Desktop desktop(){
//        return new Desktop();
//    }
//
//    @Bean
//   // @Primary
//    public Laptop laptop(){
//        return new Laptop();
//    }
//
//}
}