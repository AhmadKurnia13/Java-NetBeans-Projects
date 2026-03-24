public class LiteralString_Equale {

    int dnaCode;

    public boolean equals(LiteralString_Equale literalString_equale) {
        return this.dnaCode == literalString_equale.dnaCode;
    }

    public static void main(String[] args) {

        LiteralString_Equale literalString_equale1 = new LiteralString_Equale();
        literalString_equale1.dnaCode = 1111222233;

        LiteralString_Equale literalString_equale2 = new LiteralString_Equale();
        literalString_equale2.dnaCode = 1111222233;

        System.out.println(literalString_equale1.equals(literalString_equale2));
    }
}
