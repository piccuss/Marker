package marker;

import marker.builder.MarkdownBuilder;
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
        System.out.print(markdownBuilder.toString());

    }
}
