package com.sanitas.calculator.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.doNothing;

import java.math.BigDecimal;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.InjectMocks;

public class OperationServiceTest {

	private OperationService operationService = new OperationService();
	
	@ParameterizedTest
	@CsvSource({"0,0,0", "1,1,2", "3.5,2.6,6.1"})
	public void shouldAddDoubles_whenReceivingTwoValues(BigDecimal firstNumber, BigDecimal secondNumber, BigDecimal expectedSum) {
		BigDecimal actualSum = operationService.sum(firstNumber, secondNumber);
		
		assertThat(actualSum).isEqualTo(expectedSum);
	}

}
