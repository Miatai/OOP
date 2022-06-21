package com.training.oop.task5;

import com.training.oop.task5.sweets.SweetsType;
import com.training.oop.task5.wrapping.WrappingType;

// 5. —оздать консольное приложение, удовлетвор€ющее следующим требовани€м:
//Х  орректно спроектируйте и реализуйте предметную область задачи.
//Х ƒл€ создани€ объектов из иерархии классов продумайте возможность использовани€ порождающих шаблонов проектировани€.
//Х –еализуйте проверку данных, вводимых пользователем, но не на стороне клиента.
//Х дл€ проверки корректности переданных данных можно применить регул€рные выражени€.
//Х ћеню выбора действи€ пользователем можно не реализовывать, используйте заглушку.
//Х ќсобое условие: переопределите, где необходимо, методы toString(), equals() и hashCode().
//
//¬ариант B. ѕодарки. –еализовать приложение, позвол€ющее создавать подарки (объект, представл€ющий собой
//подарок). —оставл€ющими целого подарка €вл€ютс€ сладости и упаковка.
public class PresentsRunner {

	public static void run() {
		Present present = new Present(WrappingType.COTTON_SACK);
		present.addSweets(SweetsType.BUBBLE_GUM, 10);
		present.addSweets(SweetsType.CHOCOLATE, 2);
		present.addSweets(SweetsType.LOLLIPOPS, 12);
	}

}
