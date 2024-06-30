# Image-Similarity-Computer

## Overview

Image Similarity Checker is a Java-based application designed to compute the similarity between two images. The application reads two images, compares their pixel values, and outputs a similarity percentage indicating how similar the two images are.

## Features

Image Loading: Load images in various formats (e.g., JPEG, PNG).
Pixel-by-Pixel Comparison: Compare images on a pixel-by-pixel basis.
Similarity Calculation: Compute the similarity percentage based on the sum of squared errors (SSE).

## How It Works

Image Initialization: Two images are loaded into the application.
Pixel Comparison: Each pixel's grayscale value is compared between the two images.
SSE Calculation: The sum of squared differences is calculated for all pixel values.
Similarity Percentage: The similarity percentage is computed based on the maximum possible SSE.
Usage

## To use the Image Similarity Checker, follow these steps:

1. Clone the repository:
git clone [find the git here](https://github.com/developer1231/Image-Similarity-Computer)
2. Open the project in your preferred Java IDE (e.g., IntelliJ IDEA, Eclipse, NetBeans).
3. Add your images to the project directory. Make sure that they are within the same project!
4. Modify the main method in Mavenproject1 class to include your image file names:
   
```java
public static void main(String[] args) {
   Images x = new Images("image1.jpg");
   Images y = new Images("image2.jpeg");
   ImageHelper computer = new ImageHelper(x, y);
   double similarity = computer.similarity();
   System.out.println(similarity);
}
```
5. Run the Mavenproject1 class to see the similarity percentage output.

## Classes and Methods

Mavenproject1
Main Class: Entry point of the application.
ImageHelper: Class containing helpful methods for computing the similarity.
Constructor: Initializes the helper with two Images objects.
similarity: Calculates and returns the similarity percentage between the two images.

## Dependencies
Java AWT: Used for image handling and processing.

## License

This project is licensed under the MIT License - see the LICENSE file for details.


