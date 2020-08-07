package $package;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.test.context.junit.jupiter.web.SpringJUnitWebConfig;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@SpringJUnitWebConfig(locations = { "file:src/main/webapp/WEB-INF/spring/appServlet-context.xml",
        "file:src/main/webapp/WEB-INF/spring/root-context.xml" })
class HomeControllerTest {

    private MockMvc mvc;

    @BeforeEach
    void setUp(WebApplicationContext wac) throws Exception {
        mvc = MockMvcBuilders.webAppContextSetup(wac).build();
    }

    @Test
    void paginaInicioDeberiaDevolverTextoGenerico() throws Exception {
        mvc.perform(get("/")).andDo(print()).andExpect(status().isOk()).andExpect(view().name("home"));
    }

    @Test
    void paginaInicioDeberiaDevolverTextoPersonalizado() throws Exception {
        mvc.perform(get("/{nombre}", "Nombre")).andDo(print()).andExpect(status().isOk())
                .andExpect(view().name("home2"));
    }

}
