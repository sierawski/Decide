package pl.rrbs.decide.example;

import pl.rrbs.decide.Decide;

public class Main {
	public static void main(String[] args) {
		drinkTea(Decide.Do(EatCookies.class));
		drinkTea(Decide.DoNot(EatCookies.class));
	}
	
	private static void drinkTea(Decide<EatCookies> eatCookies) {
		StringBuilder msg = new StringBuilder("I'm drinking tea");
		if (eatCookies.asBool()) {
			msg.append(" with cookies :)");
		}
		System.out.println(msg);
	}
}

enum EatCookies {}
