package Producer_Consumer_problem;

public class Main {
	public static void main(String[] args) {
		Company comp = new Company();
		Producer pro= new Producer(comp);
		Consumer cons= new Consumer(comp);
		pro.start();
		cons.start();
		
	}

}
