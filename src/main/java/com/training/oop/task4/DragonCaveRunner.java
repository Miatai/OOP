package com.training.oop.task4;

import java.util.Scanner;

import com.training.oop.task4.cave.Cave;

// 4. ������� ���������� ����������, ��������������� ��������� �����������:
//� ���������� ������ ���� ��������-, � �� ����������-���������������.
//� ������ ����� ������ ����� ���������� ����� �������� � ������������� ������.
//� ������������ ������ ����������� ������ �����, ����� ��� ����� �����.
//� ��� ����������� ������ ���� ������������ ���������� �� ���������� ���� java code convention.
//� ������ ������ ���� �������� ��������� �� �������.
//� ���������� ���� ������ ���� �����������.
//� ��� �������� ������ ����� ������������ �����.
// ������ � ��� ���������. ������� ���������, ����������� ������������ �������� � 100 ���������� � ������ �������. 
//����������� ����������� ��������� ��������, ������ ������ �������� �� ��������� ��������� � ������ �������� �� �������� �����.
public class DragonCaveRunner {
	public void run() {
		Cave cave = Cave.generateRandomCave();
		int i;
		do {
			System.out.println("����\n" + "1 - �������� ���� ��������.\n" + "2 - ����� ������ �������� ���������.\n"
					+ "3 - ����� �������� �� �������� �����.\n" + "0 - �����.\n"
					+ "������� ����� ������� ��� ������ ����:");
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
				System.out.println("������� �����: ");
				int cost = sc.nextInt();
				System.out.println(cave.getTreasuresOnSpecifiedCost(cost));
				break;
			case 0:
				break;
			default:
				System.out.println("��������� ����� ���� �� ����������.");
				break;
			}
		} while (i != 0);
	}

}
