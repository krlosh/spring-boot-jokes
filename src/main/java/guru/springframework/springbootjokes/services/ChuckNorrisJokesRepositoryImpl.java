package guru.springframework.springbootjokes.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Component;

@Component
public class ChuckNorrisJokesRepositoryImpl implements JokesRepository{


    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public ChuckNorrisJokesRepositoryImpl() {
        chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String nexJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
