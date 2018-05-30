package marker.core;

import java.util.List;

public class UnorderedList implements MarkdownElement {

    private List<Object> contents;

    public UnorderedList(List<Object> contents) {
        this.contents = contents;
    }

    @Override
    public String markdownSerialized() {
        StringBuilder markdown = new StringBuilder();
        for (Object content : contents) {
            markdown.append("* ").append(content.toString()).append(System.lineSeparator());
        }
        return markdown.toString();
    }
}
