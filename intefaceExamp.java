package practiseProgram;

public interface intefaceExamp {

	public final String YEAR ="6";
	void run1();
	default void display() {
		System.out.println(" hi i am default function from interface and year=");
		System.out.println("year group is ="+YEAR);
	}

	
}
