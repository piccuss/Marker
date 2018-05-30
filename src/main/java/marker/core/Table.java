package marker.core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Table implements MarkdownElement {

    private List<String> rows;
    private List<String> alignments;

    public static final String ALIGN_LEFT = "-";
    public static final String ALIGN_RIGHT = "-:";
    public static final String ALIGN_CENTER = ":-:";

    public Table() {
        rows = new ArrayList<>();
        alignments = new ArrayList<>();
    }

    private String createRow(List<String> datas) {
        StringBuilder rowstring = new StringBuilder();
        for (String o : datas) {
            rowstring.append(o).append("|");
        }
        rowstring.deleteCharAt(rowstring.lastIndexOf("|"));
        return rowstring.toString();
    }

    public Table addRow(String... datas) {
        rows.add(createRow(Arrays.asList(datas)));
        return this;
    }

    public Table setAlignments(String... aligns) {
        alignments.addAll(Arrays.asList(aligns));
        return this;
    }

    @Override
    public String markdownSerialized() {
        StringBuilder markdown = new StringBuilder();
        if (rows.size() < 2) {
            markdown.append("table need at least 2 rows to build.");
            return markdown.toString();
        }

        for (String align : alignments) {
            if (!align.equals(ALIGN_LEFT) && !align.equals(ALIGN_CENTER) && !align.equals(ALIGN_RIGHT)) {
                markdown.append("table has invalid alignment setted.");
                return markdown.toString();
            }
        }

        for (int index = 0; index < rows.size(); index++) {
            markdown.append(rows.get(index)).append(System.lineSeparator());
            if (index == 0) {
                if (alignments.size() > 0) {
                    markdown.append(createRow(alignments)).append(System.lineSeparator());
                } else {
                    int cols = rows.get(0).split("\\|").length;
                    for (int i = 0; i < cols; i++) {
                        alignments.add(ALIGN_LEFT);
                    }
                }
                markdown.append(createRow(alignments)).append(System.lineSeparator());
            }
        }

        return markdown.toString();
    }
}
