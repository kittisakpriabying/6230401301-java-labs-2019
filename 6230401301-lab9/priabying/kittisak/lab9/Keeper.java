package priabying.kittisak.lab9;

import java.awt.geom.*;

/**
 * Keeper
 */
public class Keeper extends Rectangle2D.Double {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    public final static int KEEPER_WIDTH = 20;
    public final static int KEEPER_HEIGHT = 50;
    public final static int KEEPER_SPEED = 10;

    public Keeper(int x, int y) {
        super(x, y, KEEPER_WIDTH, KEEPER_HEIGHT);
    }

    public void moveUp() {
        if (y - KEEPER_SPEED >= 150) {
            this.y = y - KEEPER_SPEED;
        }

    }

    public void moveDown() {
        if (y + KEEPER_HEIGHT + KEEPER_SPEED <= 350) {
            y = y + KEEPER_SPEED;
        }

    }
}