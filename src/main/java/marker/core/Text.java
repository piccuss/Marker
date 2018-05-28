package marker.core;

public class Text implements MarkdownElement {

    private String content;

    public Text(String content) {
        this.content = content;
    }

    @Override
    public String markdownSerialized() {
        return content + System.lineSeparator();
    }
}
