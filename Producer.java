package Producer_Consumer_problem;

public class Producer extends Thread {
	Company comp;
	public Producer(Company comp) {
		this.comp=comp;
	}
	public void run() {
		int i=1;
		while(true) {
			try {
				this.comp.produce_item(i);
			} catch (Exception e1) {

			}
			try{Thread.sleep(1000);}catch(Exception e) {};
			i++;
			
		}
	}

}
