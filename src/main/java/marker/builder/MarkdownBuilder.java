package marker.builder;

import marker.core.Header;
import marker.core.Image;
import marker.core.MarkdownElement;
import marker.core.Text;

public class MarkdownBuilder {

    private StringBuilder markdown;

    public MarkdownBuilder() {
        markdown = new StringBuilder();
    }

    public MarkdownBuilder add(MarkdownElement element) {
        markdown.append(element.markdownSerialized()).append(System.lineSeparator());
        return this;
    }

    public MarkdownBuilder addHeader(String content, int level) {
        return add(new Header(content, level));
    }

    public MarkdownBuilder addHeader(String content) {
        return add(new Header(content));
    }

    public MarkdownBuilder addText(String content) {
        return add(new Text(content));
    }

    public MarkdownBuilder addImage(String text, String url) {
        return add(new Image(text, url));
    }

    public String toString() {
        return markdown.toString();
    }
}
