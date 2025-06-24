package ex_01_Java_Basic;

public class Stringbuffer {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            sb.append(i);
        }
    }
}

