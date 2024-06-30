package com.zipper.mavenproject1;

import java.awt.image.BufferedImage;

public class ImageHelper {
    private final Images firstImage;
    private final Images secondImage;

    public ImageHelper(Images firstImage, Images secondImage) {
        this.firstImage = firstImage;
        this.secondImage = secondImage;
    }

    public double similarity() {
        BufferedImage first = firstImage.getImage();
    BufferedImage second = secondImage.getImage();

    int width = first.getWidth();
    int height = first.getHeight();

    double sse = 0;

    for (int y = 0; y < height; y++) {
        for (int x = 0; x < width; x++) {
            int pixel1 = first.getRGB(x, y) & 0xFF;
            int pixel2 = second.getRGB(x, y) & 0xFF;

            double diff = pixel1 - pixel2;
            sse += Math.pow(diff, 2);
        }
    }

    long maxPossibleSSE = 255L * 255L * width * height;
    double similarity = 1 - (sse / maxPossibleSSE);
    double similarityPercentage = similarity * 100;

    return similarityPercentage;
    }
}
