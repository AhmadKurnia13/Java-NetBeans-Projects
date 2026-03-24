package enumerasi;

public class Bulan {

    private String name;
    private int Hari;

    private Bulan(String name, int daysCount) {
        this.name = name;
        this.Hari = daysCount;
    }

    public static Bulan JANUARY = new Bulan("Januari", 31);
    public static Bulan FEBRUARY = new Bulan("februari", 28);
    public static Bulan MARCH = new Bulan("Maret", 31);

    @Override
    public String toString() {
        return "Bulan{"
                + "name=\"" + name + "\""
                + ", Hari=" + Hari
                + "}";
    }
}