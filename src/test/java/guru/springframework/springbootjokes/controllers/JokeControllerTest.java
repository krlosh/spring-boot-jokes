package guru.springframework.springbootjokes.controllers;

import guru.springframework.springbootjokes.services.JokeService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import sun.nio.cs.Surrogate;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

@RunWith(SpringRunner.class)
@WebMvcTest(JokeController.class)
public class JokeControllerTest {

    @Autowired
    private MockMvc mockMvcController ;

    @MockBean
    private JokeService jokeService;

    @Before
    public void setup(){
        when(this.jokeService.getJoke()).thenReturn("XXXXXX");
    }

    @Test
    public void testRoot() throws Exception{
        this.mockMvcController.perform(get("/"))
                .andExpect(view().name("chucknorris"))
                .andExpect(model().attribute("joke", "XXXXXX"))
                .andExpect(status().isOk());
    }
}
