public class LeteralString_Concat {

    public static void main(String[] args) {

        String string1 = "Saya belajar ";
        String string2 = "concat di Java";

        String result = string1.concat(string2);
        System.out.println(result);

        String myWebSite = "saya "
                .concat("akan ")
                .concat("belajar ")
                .concat("sungguh-sungguh");
        System.out.println(myWebSite);

        System.out.println(myMessage(true));
        System.out.println(myMessage(false));
    }

    private static String myMessage(boolean b) {

        return "saya harus"
                .concat(b ? " " : " Belajar ")
                .concat("yang rajin");
    }
}
