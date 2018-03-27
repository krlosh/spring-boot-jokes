package guru.springframework.springbootjokes.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

public class JokeServiceImpl implements JokeService {

    private ChuckNorrisQuotes quotesProvider;

    public JokeServiceImpl(ChuckNorrisQuotes quotesProvider) {
        this.quotesProvider = quotesProvider;
    }

    @Override
    public String getJoke(){
        return this.quotesProvider.getRandomQuote();
    }
}
