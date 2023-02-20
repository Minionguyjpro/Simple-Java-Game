public class GameObject {
    public int x, y;

    // The constructor declares the class variables
    public GameObject(int x, int y) {              
        this.x = x;
        this.y = y;
    }

    // Return the respective coordinate
    public int getX() {                             
        return x;
    }

    public int getY() {
        return y;
    }

    // Set a new value to x and y
    public void setX(int x) {                      
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Rectangle getBounds(int x, int y){       
        return new Rectangle(x, y, 64, 64);         

    }
}
