package guru.springframework.springbootjokes.services;

import guru.springframework.springbootjokes.repository.JokesRepository;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceImpl implements JokeService {

    private JokesRepository quotesRepository;

    public JokeServiceImpl(JokesRepository quotesRepository) {
        this.quotesRepository = quotesRepository;
    }

    @Override
    public String getJoke(){
        return this.quotesRepository.nexJoke();
    }
}
