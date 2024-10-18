package com.qriosity.day14.jsoup;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author Queue-ri
 */
public class ImageUtil {
    public static void downloadImage(String imageUrl, String destinationPath, String fileName) throws IOException {
        // 경로 없으면 생성
        Path path = Paths.get(destinationPath);
        if (Files.notExists(path)) {
            Files.createDirectory(path);
        }

        try (InputStream in = new URL(imageUrl).openStream()) {
            Files.copy(in, Paths.get(destinationPath + "/" + fileName));
        }
    }
}
