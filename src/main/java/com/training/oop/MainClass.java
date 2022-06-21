package com.training.oop;

import java.time.LocalDate;
import java.time.Month;
import java.time.MonthDay;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.training.oop.task1.Directory;
import com.training.oop.task1.TextFile;
import com.training.oop.task2.Payment;
import com.training.oop.task3.Calendar;
import com.training.oop.task4.DragonCaveRunner;
import com.training.oop.task4.treasure.Treasure;
import com.training.oop.task4.treasure.TreasureTypes;
import com.training.oop.task5.Present;
import com.training.oop.task5.PresentsRunner;
import com.training.oop.task5.sweets.BubbleGum;
import com.training.oop.task5.sweets.Chocolate;
import com.training.oop.task5.sweets.Sweets;
import com.training.oop.task5.sweets.SweetsFactory;
import com.training.oop.task5.sweets.SweetsType;
import com.training.oop.task5.wrapping.WrappingType;

public class MainClass {

	public static void main(String[] args) {
//		firstTask();
//		thirdTask();
//		fourthTask();
		fivthTask();

	}
	
	public static void firstTask() {
		Directory dir = new Directory("E:\\");
		TextFile file = new TextFile("testFile.txt", dir, "some content");
		file.createFile();
		System.out.println(file.readFileContent());
		file.saveContentFromFile();
		file.printContent();
	}
	
	public static void secondTask() {
		Payment payment;
	}
	public static void thirdTask() {
		Calendar calendar = new Calendar();
		calendar.addHoliday(MonthDay.of(Month.APRIL, 15));
		calendar.addHoliday(MonthDay.of(Month.AUGUST, 5));
		calendar.addHoliday(MonthDay.of(Month.DECEMBER, 25));
		System.out.println(calendar.isHolidayCheck(LocalDate.of(1543, 4, 20)));
		System.out.println(calendar.isHolidayCheck(LocalDate.of(1543, 4, 15)));
		System.out.println(calendar);
	}
	public static void fourthTask() {
		DragonCaveRunner menu = new DragonCaveRunner();
		menu.run();
	}
	public static void fivthTask() {
//		List<Treasure> list = new ArrayList<>(Collections.nCopies(12, Treasure.generateRandomTreasure()));
//		System.out.println(list.get(4));
//		Sweets sweet = new BubbleGum();
//		System.out.println(sweet.getWeight());
//		List<Sweets> list = new ArrayList<>();
//		SweetsFactory.getSweets(SweetsType.CHOCOLATE);
//		Present present = new Present(WrappingType.COTTON_SACK);
//		present.addSweets(SweetsType.BUBBLE_GUM, 5);
//		present.addSweets(SweetsType.BUBBLE_GUM, 5);
//		present.addSweets(SweetsType.BUBBLE_GUM, 5);
//		System.out.println(present.getSweetsList());
		PresentsRunner.run();
		
	}

}
