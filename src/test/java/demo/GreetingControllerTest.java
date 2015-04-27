package demo;

import org.junit.Before;
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

public class GreetingControllerTest {

    private GreetingController uut = new GreetingController();

    private MockMvc mockMvc;

    @Before
    public void setup() {
        mockMvc = MockMvcBuilders.standaloneSetup(uut).build();
    }

    @Test
    public void testGreeting() throws Exception {
        mockMvc.perform(get("/greeting?name=\"Exeter\"")).andDo(print());
    }
}