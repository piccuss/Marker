package marker;

import marker.builder.MarkdownBuilder;
import org.junit.Test;

public class MarkdownBuilderTest {

    @Test
    public void Test() {
        MarkdownBuilder markdownBuilder = new MarkdownBuilder().addHeader("Total Header")
                .addHeader("Sub Header", 2)
                .addText("First paragraph")
                .addImage("me", "https://assets.yande.re/data/preview/db/c5/dbc571a28fd3e2f9df99037a131e5a52.jpg");
        System.out.print(markdownBuilder.toString());

    }

}
