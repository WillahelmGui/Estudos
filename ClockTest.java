package aula3dez;

public class ClockTest {
	public static void main(String[] args) throws InterruptedException {
		Clock c1 = new Clock();

		Runnable p0 = new Runnable() {

			@Override
			public void run() {
				try {
					c1.showTime();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};

		Runnable p1 = new Runnable() {

			@Override
			public void run() {
				c1.setAlarm();
			}
		};

		Thread t0 = new Thread(p0);
		Thread t1 = new Thread(p1);
	
		t0.start();
		t1.start();
		

	}
}
