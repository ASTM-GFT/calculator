package com.sanitas.calculator.service;

import java.math.BigDecimal;

public class OperationServiceImpl implements OperationService {

	public BigDecimal sum(BigDecimal firstNumber, BigDecimal secondNumber) {
		return firstNumber.add(secondNumber);
	}

	public BigDecimal subtract(BigDecimal minuendNumber, BigDecimal subtrahendNumber) {
		return minuendNumber.subtract(subtrahendNumber);
	}
}
