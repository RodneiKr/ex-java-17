package textblock;

public class TextBlocks {

    // https://www.youtube.com/watch?v=yRXUQ4zT2uA

    private String textBlock = """
            {
                "id": 0,
                "nome": "teste",
                "email": "teste@gmail.com"
            }
            """;

    public static void main(String[] args) {
        final var textBlocks = new TextBlocks();
        System.out.println(textBlocks.textBlock);
    }
}
