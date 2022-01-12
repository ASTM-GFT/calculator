package com.sanitas.calculator.service;

import static org.assertj.core.api.Assertions.assertThat;

import java.math.BigDecimal;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class OperationServiceImplTest {

	private OperationServiceImpl operationService = new OperationServiceImpl();
	
	@ParameterizedTest
	@CsvSource({"0,0,0", "1,1,2", "3.5,2.6,6.1"})
	public void shouldAdd_whenReceivingTwoValues(BigDecimal firstNumber, BigDecimal secondNumber, BigDecimal expectedSum) {
		BigDecimal actualSum = operationService.sum(firstNumber, secondNumber);
		
		assertThat(actualSum).isEqualTo(expectedSum);
	}
	
	@ParameterizedTest
	@CsvSource({"0,0,0", "1,2,-1", "3.5,2.6,0.9"})
	public void shouldSubtract_whenReceivingTwoValues(BigDecimal firstNumber, BigDecimal secondNumber, BigDecimal expectedSum) {
		BigDecimal actualSum = operationService.subtract(firstNumber, secondNumber);
		
		assertThat(actualSum).isEqualTo(expectedSum);
	}

}
