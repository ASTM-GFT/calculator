package com.sanitas.calculator.service;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

import io.corp.calculator.TracerImpl;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class OperationServiceImpl implements OperationService {

	private final TracerImpl tracer;
	
	public BigDecimal sum(BigDecimal firstNumber, BigDecimal secondNumber) {
		BigDecimal totalSum = firstNumber.add(secondNumber);
		tracer.trace(totalSum);
		return totalSum;
	}

	public BigDecimal subtract(BigDecimal minuendNumber, BigDecimal subtrahendNumber) {
		BigDecimal difference = minuendNumber.subtract(subtrahendNumber);
		tracer.trace(difference);
		return difference;	}
}
