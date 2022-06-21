package com.training.oop.task3;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.MonthDay;
import java.util.HashSet;
import java.util.Set;

// 3. Создать класс Календарь с внутренним классом, с помощью объектов которого можно хранить информацию о выходных и праздничных днях.
public class Calendar {
	private Set<MonthDay> holidays = new HashSet<>();
	private HolidaysChecker holidayChecker = new HolidaysChecker();

	public boolean isHolidayCheck(LocalDate date) {
		return holidayChecker.isHoliday(date);
	}

	public void addHoliday(MonthDay holiday) {
		holidays.add(holiday);
	}

	@Override
	public String toString() {
		return "Calendar [holidays=" + holidays + "]";
	}

	class HolidaysChecker {
		private boolean isWeekend(LocalDate date) {
			DayOfWeek dayOfWeek = date.getDayOfWeek();
			return dayOfWeek.equals(DayOfWeek.SATURDAY) || dayOfWeek.equals(DayOfWeek.SUNDAY) ? true : false;
		}

		private boolean isHoliday(LocalDate date) {
			return isWeekend(date) || holidays.contains(MonthDay.of(date.getMonth(), date.getDayOfMonth()));
		}

	}

}
