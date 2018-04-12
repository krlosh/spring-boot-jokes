package guru.springframework.springbootjokes.repository;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Component;

@Component
public class ChuckNorrisJokesRepositoryImpl implements JokesRepository{


    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public ChuckNorrisJokesRepositoryImpl(ChuckNorrisQuotes chuckNorrisQuotes) {
        this.chuckNorrisQuotes = chuckNorrisQuotes;
    }

    @Override
    public String nexJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
