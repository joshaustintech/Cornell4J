package tech.joshaustin.cornell4j.image;

import java.nio.file.Path;

public interface Exporter {

    void export(Image image, Path path);

}
