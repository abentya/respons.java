# respons.java
import java.util.Scanner;
import java.time.LocalTime;
import java.awt.Toolkit;

public class AlarmClock {
    public static void main(String[] args) throws InterruptedException {
        setAlarm();
    }

    public static void setAlarm() throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Установите время будильника (в формате ЧЧ:ММ): ");
        String alarmTime = scanner.nextLine();
        while (true) {
            LocalTime currentTime = LocalTime.now();
            String current = currentTime.getHour() + ":" + currentTime.getMinute();
            if (current.equals(alarmTime)) {
                playAlarm();
                break;
            }
            Thread.sleep(1000);
        }
    }

    public static void playAlarm() {
        Toolkit.getDefaultToolkit().beep();
        System.out.println("Проснитесь! Уже время!");
    }
}
