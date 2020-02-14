package priabying.kittisak.lab7;

import javax.swing.JPanel;
import java.awt.*;
import java.awt.geom.*;

public class CanvasDrawerV1 extends JPanel {
	
	private static final long serialVersionUID = 1L;
	protected int CANVAS_WIDTH = 800;
	protected int CANVAS_HEIGHT = 500;
	protected int LINE_WIDTH = 4;
	protected Color CANVAS_BACKGROUND = Color.GREEN;

	public CanvasDrawerV1() {
		super();
		Dimension dimension = new Dimension(this.CANVAS_WIDTH, this.CANVAS_HEIGHT);
		this.setPreferredSize(dimension);
		this.setBackground(this.CANVAS_BACKGROUND);

	}

	private Line2D line = new Line2D.Double(CANVAS_WIDTH / 2, 0, CANVAS_WIDTH / 2, CANVAS_HEIGHT);
	private Rectangle2D ractang = new Rectangle2D.Double(0,150,60,200);

	@Override
	public void paintComponents(Graphics g) {

		super.paintComponents(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setStroke(new BasicStroke(LINE_WIDTH));
		g2d.setColor(Color.BLACK);
		g2d.draw(line);
		g2d.draw(ractang);


	}

}