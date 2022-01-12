package com.sanitas.calculator.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.doNothing;

import java.math.BigDecimal;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import io.corp.calculator.TracerImpl;

@ExtendWith(MockitoExtension.class)
class OperationServiceTest {
	
	@Mock
	private TracerImpl tracerImplMock;
	
	@InjectMocks
	private OperationServiceImpl operationService;
	@ParameterizedTest
	@CsvSource({"0,0,0", "1,1,2", "3.5,2.6,6.1"})
	public void shouldAdd_whenReceivingTwoValues(BigDecimal firstNumber, BigDecimal secondNumber, BigDecimal expectedSum) {
		doNothing().when(tracerImplMock).trace(expectedSum);
		BigDecimal actualSum = operationService.sum(firstNumber, secondNumber);
		
		assertThat(actualSum).isEqualTo(expectedSum);
	}
	
	@ParameterizedTest
	@CsvSource({"0,0,0", "1,2,-1", "3.5,2.6,0.9"})
	public void shouldSubtract_whenReceivingTwoValues(BigDecimal minuendNumber, BigDecimal subtrahendNumber, BigDecimal expectedDifference) {
		doNothing().when(tracerImplMock).trace(expectedDifference);
		BigDecimal actualDifference = operationService.subtract(minuendNumber, subtrahendNumber);
		
		assertThat(actualDifference).isEqualTo(expectedDifference);
	}

}
