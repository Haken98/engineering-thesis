package app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class PlatformApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(PlatformApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder stringApplicationBuilder){
        return stringApplicationBuilder.sources(PlatformApplication.class);
    }
}
