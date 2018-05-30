package marker.core;

public class Quote implements MarkdownElement{

    private String content;

    public Quote(String content) {
        this.content = content;
    }

    @Override
    public String markdownSerialized() {
        StringBuilder markdown = new StringBuilder();
        String[] lines = content.split("\\n\\r|\\n");
        for (String line : lines) {
            markdown.append("> ").append(line).append(System.lineSeparator());
        }
        return markdown.toString();
    }
}
