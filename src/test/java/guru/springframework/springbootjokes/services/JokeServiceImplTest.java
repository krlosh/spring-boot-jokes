package guru.springframework.springbootjokes.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import guru.springframework.springbootjokes.services.JokeService;
import guru.springframework.springbootjokes.services.JokeServiceImpl;
import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class JokeServiceImplTest {

    private JokeService jokeService;
    private JokesRepository quotesProvider;

    @Before
    public void setup(){
        quotesProvider = mock(JokesRepository.class);
        jokeService = new JokeServiceImpl(quotesProvider);
    }

    @Test
    public void getJoke() {
        when(quotesProvider.nexJoke()).thenReturn("Esto es una prueba");
        assertEquals("Esto es una prueba", jokeService.getJoke());
    }
}