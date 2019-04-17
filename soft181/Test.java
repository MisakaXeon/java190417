package soft181;

public class Test {
	public static void  Eat(Animal  animal)

	{

	    animal.Eat();

	}            

	public static void  Sleep(Animal  animal)

	{

	    animal.Sleep();

	}
	
	public static void main(String[] objs){
		Animal animal=new Cat();

		Sleep(animal);

		Eat(animal);

		Animal animal1=new Mouse();

		Sleep(animal1);

		Eat(animal1);

		Animal animal11=new Dog();

		Sleep(animal11);

		Eat(animal11);
	}
}
