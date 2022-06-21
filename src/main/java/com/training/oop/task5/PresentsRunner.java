package com.training.oop.task5;

import com.training.oop.task5.sweets.SweetsType;
import com.training.oop.task5.wrapping.WrappingType;

// 5. ������� ���������� ����������, ��������������� ��������� �����������:
//� ��������� ������������� � ���������� ���������� ������� ������.
//� ��� �������� �������� �� �������� ������� ���������� ����������� ������������� ����������� �������� ��������������.
//� ���������� �������� ������, �������� �������������, �� �� �� ������� �������.
//� ��� �������� ������������ ���������� ������ ����� ��������� ���������� ���������.
//� ���� ������ �������� ������������� ����� �� �������������, ����������� ��������.
//� ������ �������: ��������������, ��� ����������, ������ toString(), equals() � hashCode().
//
//������� B. �������. ����������� ����������, ����������� ��������� ������� (������, �������������� �����
//�������). ������������� ������ ������� �������� �������� � ��������.
public class PresentsRunner {

	public static void run() {
		Present present = new Present(WrappingType.COTTON_SACK);
		present.addSweets(SweetsType.BUBBLE_GUM, 10);
		present.addSweets(SweetsType.CHOCOLATE, 2);
		present.addSweets(SweetsType.LOLLIPOPS, 12);
	}

}
