package fromJavaRush.tasks;

import java.util.LinkedHashMap;
import java.util.Map;

public class CloneMap implements Cloneable {
    public Object clone() throws CloneNotSupportedException {
        CloneMap solution = (CloneMap) super.clone();

        Map<String, User> userMap = new LinkedHashMap<>();
        for (String key: solution.users.keySet()) {
            User user = solution.users.get(key);
            userMap.put(key, (User) user.clone());
        }
        solution.users = userMap;
        return solution;
    }

    public static void main(String[] args) {
        CloneMap solution = new CloneMap();
        solution.users.put("Hubert", new User(172, "Hubert"));
        solution.users.put("Zapp", new User(41, "Zapp"));
        CloneMap clone = null;
        try {
            clone = (CloneMap) solution.clone();
            System.out.println(solution);
            System.out.println(clone);

            System.out.println(solution.users);
            System.out.println(clone.users);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace(System.err);
        }
    }

    protected Map<String, User> users = new LinkedHashMap();

    public static class User implements Cloneable {
        int age;
        String name;

        public User(int age, String name) {
            this.age = age;
            this.name = name;
        }

        public Object clone() throws CloneNotSupportedException {
            return super.clone();
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (!(obj instanceof User)) return false;

            User user = (User) obj;
            if (age != user.age ) return false;
            return name != null ? name.equals(user.name) : user.name == null;
        }

        public int hashCode() {
            int result = age;
            result = 31 * result + (name != null ? name.hashCode() : 0);
            return result;
        }
    }
}
