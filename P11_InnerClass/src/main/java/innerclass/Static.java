package innerclass;

// Outer Class / Kelas Luar
public class Static {

    // Class dalam / Inner Class Static
    private static class Programming {

        private String language;

        private void setLanguage(String language) {
            this.language = language;
        }

        private String getLanguage() {
            return language;
        }
    }

    public static void main(String[] args) {
        // Membuat instance dari Kelas Dalam (Programming)
        Static.Programming myLanguage = new Static.Programming();

        // Memasukan Nilai/Value
        myLanguage.setLanguage("Java");

        // Menampilkan Hasil Output
        System.out.println("Saya Sedang Mempelajari: " + myLanguage.getLanguage());
    }
}