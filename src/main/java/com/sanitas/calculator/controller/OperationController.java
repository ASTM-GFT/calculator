package com.sanitas.calculator.controller;

import java.math.BigDecimal;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sanitas.calculator.model.CalculationResponse;
import com.sanitas.calculator.service.OperationService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("calculator")
@RequiredArgsConstructor
public class OperationController {
	
	private final OperationService operationService;
	
	@GetMapping(value = "/sum")
	public ResponseEntity<CalculationResponse> sum(@RequestParam(value = "firstNumber", required = true) String firstNumber, @RequestParam(value = "secondNumber", required = true) String secondNumber){
		BigDecimal bigDecimal1 = new BigDecimal(firstNumber);
		BigDecimal bigDecimal2 = new BigDecimal(secondNumber);
		
		BigDecimal sum = operationService.sum(bigDecimal1, bigDecimal2);

		return ResponseEntity.ok(CalculationResponse.builder().result(sum.toPlainString()).build());
	}
	
	@GetMapping(value = "/subtract")
	public ResponseEntity<CalculationResponse> subtract(@RequestParam(value = "firstNumber", required = true) String firstNumber, @RequestParam(value = "secondNumber", required = true) String secondNumber){
		BigDecimal bigDecimal1 = new BigDecimal(firstNumber);
		BigDecimal bigDecimal2 = new BigDecimal(secondNumber);
		
		BigDecimal sum = operationService.subtract(bigDecimal1, bigDecimal2);

		return ResponseEntity.ok(CalculationResponse.builder().result(sum.toPlainString()).build());
	}

}
