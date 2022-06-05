package lab_06;

public class Lab_06_01 {
    public static void main(String[] args) {
        String time = "2hrs and 5 minutes";
        String hour = time.substring(0,1);
        String minute =  time.substring(9,10);

        int totalMinute = (Integer.parseInt(hour) * 60) + Integer.parseInt(minute);
        System.out.println(totalMinute);

    }
}
