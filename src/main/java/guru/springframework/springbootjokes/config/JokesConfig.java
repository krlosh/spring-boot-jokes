package guru.springframework.springbootjokes.config;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JokesConfig {

    @Bean
    public ChuckNorrisQuotes getChucknorrisQuotes() {
        return new ChuckNorrisQuotes();
    }
}
