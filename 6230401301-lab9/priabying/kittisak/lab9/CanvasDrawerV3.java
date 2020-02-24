package priabying.kittisak.lab9;

/**
 * CanvasDrawerV3
 */
public class CanvasDrawerV3 extends CanvasDrawerV2 implements Runnable{

    protected Thread running ;

    public CanvasDrawerV3(){
        super();
        running = new Thread(this);


        int xv = ;
        int yv= ;
        ball.setXVelocity(xv);
        ball.setYVelocity(yv);
        running.start();
    }

    @Override
    public void run(){
        while(true){
            if (condition) {
                
            }
        }
    }
    
}