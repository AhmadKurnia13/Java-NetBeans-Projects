package inheritance1;

public class SepedaGunungBeraksi {

    public static void main(String[] args) {
        SepedaGunung sg = new SepedaGunung();

        sg.setGir(4);
        System.out.println(sg.getGir());

        sg.setSadel(1);
        System.out.println(sg.getSadel());
    }
}