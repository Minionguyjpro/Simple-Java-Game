public class Player extends GameObject implements Entity {                
    private BufferedImage hero;                                           
    private double velX = 0;                                              
    private double velY = 0;

    public Player(int x, int y) {                                         
        super(x, y);                                                       

        BufferedImageLoader loader = new BufferedImageLoader();           
        try{
            hero = loader.loadImage("/hero.png");                          
        }
        catch (IOException e){                                            
            e.printStackTrace();
        }
    }

    @Override
    public void tick() {
        x+=velX;                                                          
        y+=velY;

        if(x <=0){                                                        
            x=0;
        }
        if(x >=Game.WIDTH-64){                                            
            x=640-64;
        }
        if(y <=0){                                                        
            y=0;
        }
        if(y >=Game.HEIGHT-64){
            y=Game.HEIGHT-64;
        }

    }

    @Override                                                             
    public void render(Graphics g) {
        g.drawImage(hero, x, y, null);                                    
    }

    @Override
    public Rectangle getBounds() {                                        
        return new Rectangle((int)x, (int)y, 64, 64);                     
    }

    public void setVelX(double velX){
        this.velX = velX;
    }

    public void setVelY(double velY){
        this.velY = velY;
    }
}
