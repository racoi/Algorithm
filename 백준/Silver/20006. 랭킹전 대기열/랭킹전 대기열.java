import java.util.*;

public class Main {
    static class Player {
        String name;
        int level;

        Player(String name, int level) {
            this.name = name;
            this.level = level;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<Player> players = new ArrayList<>();

        for (int i = 0; i < p; i++) {
            int l = sc.nextInt();
            String n = sc.next();
            players.add(new Player(n, l));
        }

        while (!players.isEmpty()) {
            ArrayList<Player> room = new ArrayList<>();
            Player base = players.remove(0);
            room.add(base);

            Iterator<Player> it = players.iterator();
            while (it.hasNext() && room.size() < m) {
                Player p1 = it.next();
                if (Math.abs(p1.level - base.level) <= 10) {
                    room.add(p1);
                    it.remove();
                }
            }

            Collections.sort(room, Comparator.comparing(p1 -> p1.name));
            if (room.size() < m) System.out.println("Waiting!");
            else System.out.println("Started!");

            for (Player i : room) {
                System.out.println(i.level + " " + i.name);
            }
        }
    }
}