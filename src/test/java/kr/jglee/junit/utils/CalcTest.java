package kr.jglee.junit.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class CalcTest {
	
	/*
	assertArrayEquals(a, b); 배열 A와 B가 일치함을 확인한다.
	assertEquals(a, b); 객체 A와 B가 일치함을 확인한다.
	assertSame(a, b); 객체 A와 B가 같은 객임을 확인한다. 
	assertEquals 메서드는 두 객체의 값이 같은가를 검사는데 반해 assertSame메서드는 두 객체가 동일한가 즉 하나의 객인 가를 확인한다.(== 연산자)
	assertTrue(a); 조건 A가 참인가를 확인한다.
	assertNotNull(a); 객체 A가 null이 아님을 확인한다.
	*/

	@Test
	public void eq() {
		Calc calc = new Calc();
		assertEquals(calc.sum(1, 2), 4);
	}
	
	@Test
	public void listeq() {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		List<Integer> arr2 = new ArrayList<Integer>();
		for (int i = 1; i <= 10; i++) { arr.add(i); arr2.add(i); }
		assertEquals(arr, arr2);
	}
	
	@Test
	public void same() {
		Calc c1 = new Calc();
		Calc c2 = new Calc();
		assertSame(c1, c2);
	}
	
	@Test
	public void true_() {
		assertTrue(1 == 2);
	}
	
	@Test
	public void nonnull() {
		assertNull("");
	}

}
