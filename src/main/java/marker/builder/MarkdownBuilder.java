package marker.builder;

import marker.core.*;

import java.util.List;

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

    public MarkdownBuilder addImage(String text, String url, int align) {
        return add(new Image(text, url, align));
    }

    public MarkdownBuilder addQuote(String content) {
        return add(new Quote(content));
    }

    public MarkdownBuilder addList(List<Object> objects) {
        return add(new UnorderedList(objects));
    }

    public MarkdownBuilder addTable(Table table) {
        return add(table);
    }

    public MarkdownBuilder addLink(String text, String url) {
        return add(new Link(text, url));
    }


    @Override
    public String toString() {
        return markdown.toString();
    }
}
