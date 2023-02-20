public class BufferedImageLoader {

    private BufferedImage image;

    public BufferedImage loadImage(String path) throws IOException{

        image = ImageIO.read(getClass().getResource(path));         
        return image;
    }
}
