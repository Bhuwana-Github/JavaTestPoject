package practiseProgram;

abstract class abstractExamp implements intefaceExamp {
	public static final int id=5;

	abstractExamp(){
		
		System.out.println("this contructor"+ "id="+id);                             
	}
	abstract void run();
	void display1()
	{System.out.println(" hi i am  method in abstract class ");}

}

