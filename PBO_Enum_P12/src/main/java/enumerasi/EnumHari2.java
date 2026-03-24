package enumerasi;

public class EnumHari2 {

    public enum Hari {
        SENIN("Pagi"),
        SELASA("Siang"),
        RABU("Sore"),
        KAMIS("Malam"),
        JUMAT("Pagi"),
        SABTU("Siang"),
        MINGGU("Malam");

        private String waktu;

        Hari(String waktu) {
            this.waktu = waktu;
        }

        public String getWaktu() {
            return waktu;
        }
    }
}