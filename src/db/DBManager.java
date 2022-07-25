package db;

import java.util.ArrayList;

public class DBManager {
    private static ArrayList<Footballer> footballers = new ArrayList<>();
    private static Long id = 0L;

    static {
        footballers.add(new Footballer(1L, "Lionel", "Messi", 17000000, "Paris", 15500000));
    }

    public static void addFootballer(Footballer footballer) {

        footballer.setId(id);
        footballers.add(footballer);
        id++;

    }

    public static ArrayList<Footballer> getAllFootballers() {
        return footballers;
    }
}
