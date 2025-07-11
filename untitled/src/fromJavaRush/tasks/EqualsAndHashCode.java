package fromJavaRush.tasks;

import java.util.HashSet;
import java.util.Set;

public class EqualsAndHashCode {
    private final String first, last;

    public EqualsAndHashCode(String first, String last) {
        this.first = first;
        this.last = last;
    }

    public boolean equals(Object obj) {

        if (obj == this) return true;
        if (obj == null || !(obj instanceof EqualsAndHashCode)) return false;
        EqualsAndHashCode solution = (EqualsAndHashCode) obj;
        if (first != null ? !first.equals(solution.first) : solution.first != null) return false;
        return last != null ? last.equals(solution.last) : solution.last == null;
    }

    public int hashCode() {
        int result = first != null ? first.hashCode() : 0;
        result = 31 * (last != null ? last.hashCode() : 0);
        return result;
    }

    public static void main(String[] args) {
        Set<EqualsAndHashCode> s = new HashSet<>();
        s.add(new EqualsAndHashCode("Donald", "Duck"));
        System.out.println(s.contains(new EqualsAndHashCode("Donald", "Duck")));
    }
}
