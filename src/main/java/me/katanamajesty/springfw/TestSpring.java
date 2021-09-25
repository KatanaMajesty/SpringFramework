package me.katanamajesty.springfw;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext context =
                     new ClassPathXmlApplicationContext("applicationContext.xml")) {
            Computer computer1 = context.getBean("computer", Computer.class);
            System.out.println(computer1);
            Computer computer2 = context.getBean("computer", Computer.class);
            System.out.println(computer2);
            System.out.println(computer2.getCOMPUTER_OS());
        }
    }

}
