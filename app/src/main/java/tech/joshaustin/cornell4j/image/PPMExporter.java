package tech.joshaustin.cornell4j.image;

import java.nio.file.Path;

public class PPMExporter implements Exporter {

    String header(int width, int height) {
        return String.format("""
                P3
                {} {}
                255
                """, width, height);
    }

    @Override
    public void export(Image image, Path path) {
        // save to path, convert each rgb from double to int
    }
}
