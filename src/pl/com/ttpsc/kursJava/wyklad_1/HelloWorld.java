package pl.com.ttpsc.kursJava.wyklad_1;

class HelloWorld {
  public static void main(String[] args) {
    System.out.println("Hello World!");
	
	float number = 5.123456789f;
	System.out.println(number);
	
	int numberInt = 65278912;
	
	for(int i = 5; i < 20; i++){
		System.out.println(i);
	}
	int carspeed = 90;
	int distance = 2000;
	
	int hoursInt;
	
	hoursInt = (int) (distance/carspeed);
	
	System.out.println("For int" + hoursInt);
  }
}