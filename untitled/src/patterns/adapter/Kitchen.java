package patterns.adapter;

public class Kitchen {
    public static void main(String[] args) {
        MechanicalGrinder mechanicalGrinder = new MechanicalGrinder();

        ElectricGrinder adapter = new GrinderAdapter(mechanicalGrinder);

        adapter.electricGrinderWork();
    }
}
