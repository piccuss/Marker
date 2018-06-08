package marker.core;

public class Image implements MarkdownElement {

    private String text;
    private String url;
    private int align;
    public static final int ALIGN_LEFT = 0;
    public static final int ALIGN_RIGHT = 1;
    public static final int ALIGN_CENTER = 2;

    public Image(String text, String url) {
        this.text = text;
        this.url = url;
        this.align = ALIGN_LEFT;
    }

    public Image(String text, String url, int align) {
        this.text = text;
        this.url = url;
        this.align = align;
    }

    @Override
    public String markdownSerialized() {
        StringBuilder markdown = new StringBuilder();
        switch (align) {
            case ALIGN_RIGHT :
                markdown.append("<div align=right>").append(System.lineSeparator()).append(System.lineSeparator());
                break;
            case ALIGN_CENTER :
                markdown.append("<div align=center>").append(System.lineSeparator()).append(System.lineSeparator());
                break;
            default:
                break;
        }
        markdown.append("![").append(text).append("](")
                .append(url).append(")").append(System.lineSeparator());
        switch (align) {
            case ALIGN_RIGHT :
                markdown.append(System.lineSeparator()).append("</div>").append(System.lineSeparator());
                break;
            case ALIGN_CENTER :
                markdown.append(System.lineSeparator()).append("</div>").append(System.lineSeparator());
                break;
            default:
                break;
        }

        return markdown.toString();
    }
}
