package instanceeof;

public class InstanceOf {

    void teste(final Object obj) {
        if (obj instanceof String txt && txt.length() > 3) {
            System.out.println("'" + txt + "' funfou len=" + txt.length());
        }
    }

    public static void main(String[] args) {
        final var instante = new InstanceOf();
        instante.teste("12345");
    }
}
