package com.training.oop.task4;

import java.util.Scanner;

import com.training.oop.task4.cave.Cave;

// 4. Создать консольное приложение, удовлетворяющее следующим требованиям:
//• Приложение должно быть объектно-, а не процедурно-ориентированным.
//• Каждый класс должен иметь отражающее смысл название и информативный состав.
//• Наследование должно применяться только тогда, когда это имеет смысл.
//• При кодировании должны быть использованы соглашения об оформлении кода java code convention.
//• Классы должны быть грамотно разложены по пакетам.
//• Консольное меню должно быть минимальным.
//• Для хранения данных можно использовать файлы.
// Дракон и его сокровища. Создать программу, позволяющую обрабатывать сведения о 100 сокровищах в пещере дракона. 
//Реализовать возможность просмотра сокровищ, выбора самого дорогого по стоимости сокровища и выбора сокровищ на заданную сумму.
public class DragonCaveRunner {
	public void run() {
		Cave cave = Cave.generateRandomCave();
		int i;
		do {
			System.out.println("Меню\n" + "1 - Просмотр всех сокровищ.\n" + "2 - Выбор самого дорогого сокровища.\n"
					+ "3 - Выбор сокровищ на заданную сумму.\n" + "0 - Выход.\n"
					+ "Введите номер нужного вам пункта меню:");
			Scanner sc = new Scanner(System.in);
			i = sc.nextInt();
			switch (i) {
			case 1:
				System.out.println(cave.toString());
				break;
			case 2:
				System.out.println(cave.getMostExpensiveTreasure());
				break;
			case 3:
				System.out.println("Введите сумму: ");
				int cost = sc.nextInt();
				System.out.println(cave.getTreasuresOnSpecifiedCost(cost));
				break;
			case 0:
				break;
			default:
				System.out.println("Введенный номер меню не существует.");
				break;
			}
		} while (i != 0);
	}

}
