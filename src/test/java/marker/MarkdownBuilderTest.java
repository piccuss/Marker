package marker;

import marker.builder.MarkdownBuilder;
import org.junit.Test;

public class MarkdownBuilderTest {

    @Test
    public void Test() {
        MarkdownBuilder markdownBuilder = new MarkdownBuilder().addHeader("Total Header")
                .addHeader("Sub Header", 2);
        System.out.print(markdownBuilder.toString());

    }

}
