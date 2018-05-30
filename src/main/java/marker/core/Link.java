package marker.core;

public class Link implements MarkdownElement{

    private String content;

    private String url;

    public Link(String content, String url) {
        this.content = content;
        this.url = url;
    }

    @Override
    public String markdownSerialized() {
        StringBuilder markdown = new StringBuilder();
        markdown.append("[").append(content).append("](").
                append(url).append(")").append(System.lineSeparator());
        return markdown.toString();
    }
}
