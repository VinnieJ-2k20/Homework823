package com.gmail.ptimofejev;

public class Main {

	public static void main(String[] args) {
		BlackList blackList = new BlackList(new Class[0]);
		Stack mainStack = new Stack(new Object[0], blackList);

		addToBlacklist(blackList, Cat.class);
		addToBlacklist(blackList, Dog.class);

		try{ 
			Car car1 = new Car("Audi", "red", 2011, 3200);
			Car car2 = new Car("BMW", "black", 2017, 5000);
			Plane plane1 = new Plane("Gulfstream", 2012, 320000);
			Plane plane2 = new Plane("Cessna", 2010, 620000);
			Cat cat1 = new Cat("Murzik Vasylyovych", 14, 12.5);
			Dog dog1 = new Dog("Topa", 12, 7.3);

			System.out.println(mainStack.checkBlacklist(dog1));
			System.out.println(mainStack.checkBlacklist(plane2));

			addObjectToStack(mainStack, car1);
			addObjectToStack(mainStack, car2);

			addObjectToStack(mainStack, plane2);
			addObjectToStack(mainStack, plane1);
			addObjectToStack(mainStack, cat1);
			addObjectToStack(mainStack, dog1);

			System.out.println(getTop(mainStack));
			System.out.println(getAndDelete(mainStack));
			System.out.println(getTop(mainStack));
		} catch (NullPointerException e) {
			System.out.println("One or more used Objects are nulls");
		}
		
	}

	private static void addToBlacklist(BlackList blacklist, Class addedClass) {
		blacklist.addClassToBlackList(addedClass);
	}

	private static void addObjectToStack(Stack stack, Object entry) {
		stack.addObjectToStack(entry);
	}

	private static Object getTop(Stack stack) {
		return stack.getTopObject();
	}

	private static Object getAndDelete(Stack stack) {
		return stack.getTopAndDelete();
	}

}
