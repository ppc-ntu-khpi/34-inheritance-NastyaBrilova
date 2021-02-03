package test;

import domain.Bird;

public class TestAnimal {
	
	public static void main(String[] args) {
		Bird bird = new Bird("tangerine", 15, 700);
		
		bird.eat();
		bird.fly();
		bird.hunt();
		bird.sleep();
		bird.speak();
		
		System.out.println("\n" + bird);
	}
}
