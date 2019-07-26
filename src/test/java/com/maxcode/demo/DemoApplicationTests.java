package com.maxcode.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class DemoApplicationTests {

	@Autowired
    private MockMvc mvc;

	@Test
	public void okRequest() throws Exception {
		this.mvc.perform(get("/api/questions?order=desc&sort=activity")).andExpect(status().isOk());
	}

	@Test
	public void noOrderParam() throws Exception {
		this.mvc.perform(get("/api/questions?&sort=activity")).andExpect(status().isBadRequest());
	}

	@Test
	public void noSortParam() throws Exception {
		this.mvc.perform(get("/api/questions?order=desc")).andExpect(status().isBadRequest());
	}

	@Test
	public void withFromDate() throws Exception {
		this.mvc.perform(get("/api/questions?fromdate=1563235200&order=desc&sort=activity")).andExpect(status().isOk());
	}

	@Test
	public void withToDate() throws Exception {
		this.mvc.perform(get("/api/questions?todate=1562544000&order=desc&sort=activity")).andExpect(status().isOk());
	}

	@Test
	public void withBothDates() throws Exception {
		this.mvc.perform(get("/api/questions?fromdate=1562716800&todate=1562544000&order=desc&sort=activity")).andExpect(status().isOk());
	}

	@Test
	public void withAllParametersNonsense() throws Exception {
		this.mvc.perform(get("/api/questions?fromdate=ccc&todate=ddd&order=bababababa&sort=daw")).andExpect(status().isOk());
	}

}
