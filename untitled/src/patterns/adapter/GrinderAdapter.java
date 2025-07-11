package patterns.adapter;

public class GrinderAdapter implements ElectricGrinder{
    private MechanicalGrinder mechanicalGrinder;

    public GrinderAdapter(MechanicalGrinder mechanicalGrinder) {
        this.mechanicalGrinder = mechanicalGrinder;
    }

    @Override
    public void electricGrinderWork() {
        System.out.println("Поставили мотор на механический измельчитель\n" +
                "Теперь он работает как электрический");
    }
}
