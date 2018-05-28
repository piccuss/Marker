package marker.core;

public class Image implements MarkdownElement {

    private String text;
    private String url;

    public Image(String text, String url) {
        this.text = text;
        this.url = url;
    }

    @Override
    public String markdownSerialized() {
        StringBuilder markdown = new StringBuilder();
        markdown.append("![").append(text).append("](")
                .append(url).append(")").append(System.lineSeparator());
        return markdown.toString();
    }
}
