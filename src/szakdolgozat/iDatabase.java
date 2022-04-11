package szakdolgozat;

import java.time.LocalDateTime;

public interface iDatabase {

    final static String CONNECTION = "com.mysql.cj.jdbc.Driver";
    final static String CONNECT_TO_LOCALHOST = "jdbc:mysql://localhost:3307/c31g202121?ServerTimezone=UTC&useUniCode=yes&characterEncoding=UTF-8";
    final static String USER = "root";
    final static String PASSWORD = "";
    final static LocalDateTime now = LocalDateTime.now();
    final static int year = now.getYear();
    final static int month = now.getMonthValue();
    final static int day = now.getDayOfMonth();
    final static int hour = now.getHour();
    final static int min = now.getMinute();
    final static int sec = now.getSecond();

}
