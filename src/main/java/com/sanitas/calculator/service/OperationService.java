package com.sanitas.calculator.service;

import java.math.BigDecimal;

public interface OperationService {
	
	BigDecimal sum(BigDecimal firstNumber, BigDecimal secondNumber);
	BigDecimal subtract(BigDecimal minuendNumber, BigDecimal subtrahendNumber);
}
