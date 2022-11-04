package Producer_Consumer_problem;

public class Consumer extends Thread {
	Company comp;
	public Consumer(Company comp) {
		this.comp=comp;
	}
	public void run() {
		while(true) {
			try {
				this.comp.consume_item();
			} catch (Exception e1) {
			}
			try{Thread.sleep(2000);}catch(Exception e) {};
			
		}
	}

}
