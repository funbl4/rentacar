package by.academy.it.Test;

import by.academy.it.pojo.BodyStyle;
import by.academy.it.service.IBodyStyleService;
import by.academy.it.service.impl.BodyStyleService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Leonid on 21.06.2015.
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
       IBodyStyleService bodyStyleService= (IBodyStyleService) context.getBean("bodyStyleService");
        BodyStyle bodyStyle = new BodyStyle("Sedan");
        bodyStyleService.addBodyStyle(bodyStyle);
    }
}
