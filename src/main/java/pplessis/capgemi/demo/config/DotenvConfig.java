package pplessis.capgemi.demo.config;

import io.github.cdimascio.dotenv.Dotenv;
import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DotenvConfig {

    @PostConstruct
    public void init() {
        final Dotenv dotenv = Dotenv.load();
        dotenv.entries().forEach(entry ->
                System.setProperty(entry.getKey(), entry.getValue())
        );
    }
}
