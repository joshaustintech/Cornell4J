package tech.joshaustin.cornell4j.image;


import java.io.FileWriter;
import java.nio.file.Path;

public class PPMExporter implements Exporter {

    String header(int width, int height) {
        return String.format("""
                P3
                %s %s
                255
                """, width, height);
    }

    @Override
    public void export(Image image, Path path) {
        try (final var out = new FileWriter(String.valueOf(path.getFileName()))) {
            out.write(this.header(image.getWidth(), image.getHeight()));
            for (int y = 0; y < image.getHeight(); y++) {
                for (int x = 0; x < image.getWidth(); x++) {
                    final var pixel = image.getPixel(x, y);
                    int ir = (int) (pixel.r() * 255.999);
                    int ig = (int) (pixel.g() * 255.999);
                    int ib = (int) (pixel.b() * 255.999);
                    out.write(String.format("%s %s %s ", ir, ig, ib));
                }
                out.write("\n");
            }
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
            e.printStackTrace();
        }
    }
}
