package string1;

import java.util.Arrays;

public class Buffer {

    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer();

        sb.append(new Integer(2));
        sb.append("; ");
        sb.append(false);
        sb.append("; ");
        sb.append(Arrays.asList(1, 2, 3));
        sb.append("; ");

        System.out.println(sb);
    }
}