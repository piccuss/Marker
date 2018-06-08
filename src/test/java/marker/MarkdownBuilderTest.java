package marker;

import marker.builder.MarkdownBuilder;
import marker.core.Image;
import marker.core.Table;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class MarkdownBuilderTest {

    @Test
    public void Test() {
        MarkdownBuilder markdownBuilder = new MarkdownBuilder().addHeader("Total Header")
                .addHeader("Sub Header", 2)
                .addText("First paragraph")
                .addImage("me", "https://assets.yande.re/data/preview/db/c5/dbc571a28fd3e2f9df99037a131e5a52.jpg")
                .addQuote("this is a test\nwelcome\n\rhello,world")
                .addList(Arrays.asList("bird", "dog", "cat", 45));
        Table table = new Table().setAlignments(Table.ALIGN_LEFT, Table.ALIGN_CENTER, Table.ALIGN_RIGHT)
                .addRow("Title", "date", "name")
                .addRow("hello", "20180502", "piccus")
                .addRow("back to", "20180503", "tella");
        markdownBuilder.addTable(table).addLink("Google", "http://www.google.com.jp")
                .addImage("me", "https://assets.yande.re/data/preview/db/c5/dbc571a28fd3e2f9df99037a131e5a52.jpg", Image.ALIGN_CENTER);
        System.out.print(markdownBuilder.toString());

    }
}
