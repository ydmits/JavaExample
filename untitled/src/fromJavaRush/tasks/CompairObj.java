package fromJavaRush.tasks;

import java.util.HashSet;
import java.util.Set;

public class CompairObj {
    private final String first, last;

    public CompairObj(String first, String last) {
        this.first = first;
        this.last = last;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CompairObj)) return false;

        CompairObj solution = (CompairObj) o;

        if (first != null ? !first.equals(solution.first) : solution.first != null) return false;
        return last != null ? last.equals(solution.last) : solution.last == null;
    }

    public int hashCode() {
        int result = first != null ? first.hashCode() : 0;
        result = 31 * result + (last != null ? last.hashCode() : 0);
        return result;
    }

    public static void main(String[] args) {
        Set<CompairObj> s = new HashSet<>();
        s.add(new CompairObj("Mickey", "Mouse"));
        System.out.println(s.contains(new CompairObj("Mickey", "Mouse")));
    }
}
