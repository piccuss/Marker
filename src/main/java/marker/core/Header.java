package marker.core;

public class Header implements MarkdownElement {

    private String content;

    private int level = 1;

    public Header(String content) {
        this.content = content;
    }

    public Header(String content, int level) {
        this.content = content;
        if (level > 1) {
            this.level = level;
        }
    }


    @Override
    public String markdownSerialized() {
        StringBuilder markdown = new StringBuilder();
        for (int i = 0; i < level; i++) {
            markdown.append("#");
        }
        markdown.append(" ").append(content).append(System.lineSeparator());
        return markdown.toString();
    }
}
