package demo;

import org.junit.Before;
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

public class GreetingControllerTest {

    private GreetingController uut = new GreetingController();

    private MockMvc mockMvc;

    @Before
    public void setup() {
        mockMvc = MockMvcBuilders.standaloneSetup(uut).build();
    }

    @Test
    public void testGreetingGet() throws Exception {
        mockMvc.perform(get("/greeting?name=\"Exeter\"")).andExpect(status().isOk());
    }

    @Test
    public void testGreetingPost() throws Exception {
        mockMvc.perform(post("/greeting?name=\"Exeter\"")).andDo(print());
    }
}