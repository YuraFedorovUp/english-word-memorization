package ru.vtb.expertconclusions.outletcreateapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import ru.vtb.expertconclusions.outletcreateapi.job.Job;

@SpringBootApplication
public class EnglishWordMemorizationApiApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(EnglishWordMemorizationApiApplication.class, args);
        System.setProperty("java.awt.headless", "false");
        EnglishWordMemorizationApiApplication outletCreateApiApplication = new EnglishWordMemorizationApiApplication();
        outletCreateApiApplication.job(context);
    }

    private void job(ConfigurableApplicationContext context) {
        Job job = context.getBean(Job.class);
        job.job();
    }

}
