package marker.builder;

import marker.core.Header;
import marker.core.MarkdownElement;

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

    public String toString() {
        return markdown.toString();
    }
}
