package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestReporter;
import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.Nested;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootJunit5ApplicationTests {
	@Test	
		void testAddPositive() {
		 assertEquals(2,  MathUnit.add(1, 1), " should return the right sum");
		 }
	}
	
//	MathUnit mathUnit;
//	TestInfo testInfo;
//	TestReporter testReporter;
//	
//	 @BeforeEach
//	 void init(TestInfo testInfo, TestReporter testReposter) {
//		 this.testInfo=testInfo;
//		 this.testReporter=testReposter;
//	 }
//	 
//
//	 @DisplayName("add method")
//	 @Tag("Math")
//	 
//	 class AddTest{
//	 @Test
//	 @DisplayName("when adding two positive numbers")
//	 void testAddPositive() {
//		 assertEquals(2,  mathUnit.add(1, 1), " should return the right sum");
//	 }
//	 @Test
//	 @DisplayName("when adding two positive numbers")
//	 void testAddNegative() {
//		int expected = -2;
//		int actual = mathUnit.add(-1, -1);
//		assertEquals(expected, actual,() -> "should return sum " + expected + " but returnes " + actual);
//	 }
//	 }
//	 
//	@BeforeAll
//	static  void BeforeAllInit() {
//		System.out.println(" this need to run before all");
//
//	}
//	
//	@BeforeEach
//	void init() {
//		mathUnit = new MathUnit();
//	}
//	
//	@AfterEach
//	void cleanup() {
//		System.out.println("Clean up...");
//	}
//	@Test
//	void contextLoads() {
//		MathUnit mathUnit=new MathUnit();
//		int expected = 2;
//		int actual = mathUnit .add(1, 1);
//		assertEquals(expected, actual, " the add method should add two numbers");
//		//System.out.println("this is ran");
//	}
//	@Test
//	void testComputeCircleRadious() {
//		MathUnit mathUnit=new MathUnit();
//		assertEquals(314.1592653589793,mathUnit.computeCircleArea(10),"should retun right circle area ");
//	}
////	@Test void testDivide(){
////		assertThrows(ArithmeticException.class, () -> mathUnit.divide(1,0), " Divide the values");
////		
//	}


