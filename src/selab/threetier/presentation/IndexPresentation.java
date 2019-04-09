package selab.threetier.presentation;

import java.io.InputStream;

public class IndexPresentation extends HtmlPresentation {

    public IndexPresentation() {
        super("Index");
    }

    @Override
    public String getContents(String method, InputStream body) {
        return "Hello world! - ".concat(method);
    }
}
