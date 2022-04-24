package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;

import com.m3.controller.DollarsController;
import com.m3.domain.Dollars;
import com.m3.repository.DollarsRepository;
import com.m3.service.DollarsService;
import com.m3.utils.CalendarUtils;

@WebMvcTest(CalendarUtils.class)
public class DollarsApiTest {
	@InjectMocks
	private DollarsController dollarsController;

	@Mock
	private DollarsService dollarsService;

	@Mock
	private DollarsRepository repository;

	@Test
	public void dollarsApi_Findtest() {

	}

	@Test
	public void dollarsService_Findtest() {
		System.out.println(CalendarUtils.LocalDateTimeToString("2022-04-22T07:36:00+00:00"));
		when(repository.findAll()).thenReturn(
				Arrays.asList(new Dollars(1, "USD", "美元"), new Dollars(2, "GBP", "英鎊"), new Dollars(3, "EUR", "歐元")));
		when(dollarsService.findAll()).thenReturn(
				Arrays.asList(new Dollars(1, "USD", "美元"), new Dollars(2, "GBP", "英鎊"), new Dollars(3, "EUR", "歐元")));
		List<Dollars> list = dollarsService.findAll();

		assertEquals("USD", list.get(0).getDollar_kind());
	}

	@Test
	public void testUtils() {
		String updatedISO = "2022-04-22T07:36:00+00:00";
		String result = CalendarUtils.LocalDateTimeToString(updatedISO);
		System.out.println(result);
		assertEquals("2022/04/22 07:36:00", result);
	}
}
