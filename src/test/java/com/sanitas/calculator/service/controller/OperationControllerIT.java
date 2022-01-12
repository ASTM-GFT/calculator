package com.sanitas.calculator.service.controller;

import static org.hamcrest.CoreMatchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
class OperationControllerIT {
	
	@Autowired
	private MockMvc mockMvc;
	
	@Test
	public void shouldCorrectlyReturnSum_whenBothRequestParametersArePresent() throws Exception {
		 mockMvc.perform(get("/calculator/sum").param("firstNumber", "1").param("secondNumber", "100"))
		 .andExpect(status().isOk())
         .andExpect(jsonPath("$.result", is("101")));
	}
	
	@Test
	public void shouldCorrectlyReturnDifference_whenBothRequestParametersArePresent() throws Exception {
		 mockMvc.perform(get("/calculator/subtract").param("firstNumber", "1").param("secondNumber", "100"))
		 .andExpect(status().isOk())
         .andExpect(jsonPath("$.result", is("-99")));
	}
	
	@Test
	public void shouldFail_whenTheFirstRequestParameterIsNotPresent() throws Exception {
		 mockMvc.perform(get("/calculator/sum").param("secondNumber", "100"))
		 .andExpect(status().is4xxClientError());
	}
	
	@Test
	public void shouldFail_whenTheSecondRequestParameterIsNotPresent() throws Exception {
		 mockMvc.perform(get("/calculator/subtract").param("firstNumber", "100"))
		 .andExpect(status().is4xxClientError());
	}
}
