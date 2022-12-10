package aula3dez;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Clock {

	private boolean showTime = true;

	public void showTime() throws InterruptedException {
		while (true) {
			while (showTime) {
				Locale locale = new Locale("pt", "PT-BR");
				DateFormat dateFormat = DateFormat.getTimeInstance(DateFormat.DEFAULT, locale);
				String date = dateFormat.format(new Date());
				System.out.print(date + "\n");
				Thread.sleep(1000);
			}
			Thread.sleep(1000);
		}
	}

	public void setAlarm() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int a = sc.nextInt();
			System.out.println("digitou " + a);
			showTime = !showTime;			
			
		}
	}
}