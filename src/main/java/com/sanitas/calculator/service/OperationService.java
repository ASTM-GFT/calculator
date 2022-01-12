package com.sanitas.calculator.service;

import java.math.BigDecimal;

public class OperationService {

	public BigDecimal sum(BigDecimal firstNumber, BigDecimal secondNumber) {
		return firstNumber.add(secondNumber);
	}

	public BigDecimal subtract(BigDecimal minuendNumber, BigDecimal subtrahendNumber) {
		return BigDecimal.ZERO;
	}
}
