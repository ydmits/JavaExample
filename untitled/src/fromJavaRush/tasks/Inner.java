package fromJavaRush.tasks;

public class Inner {
    public InnerClass[] innerClasses = new InnerClass[2];

    public class InnerClass {
    }

    public static Inner[] getTwoSolutions() {
        Inner[] result = new Inner[2];

        Inner solution = new Inner();
        solution.innerClasses[0] = solution.new InnerClass();
        solution.innerClasses[1] = solution.new InnerClass();

        Inner solution2 = new Inner();
        solution2.innerClasses[0] = solution.new InnerClass();
        solution2.innerClasses[1] = solution.new InnerClass();

        result[0] = solution;
        result[1] = solution2;

        return result;
    }

    public static void main(String[] args) {

    }
}
