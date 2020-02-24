/**
*
* Author: kittisak Priabying.
* ID: 623040130-1
* Sec: 1
* Date: Feb 15, 2020
*
**/
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
	protected int DOT_CIRCLE_RADIUS = 5;
	protected int CIRCLE_RADIUS = 50;

	public CanvasDrawerV1() {
		super();
		// Set size by setPreferredSize.
		Dimension dimension = new Dimension(this.CANVAS_WIDTH, this.CANVAS_HEIGHT);
		this.setPreferredSize(dimension);
		// Set background is green color.
		this.setBackground(this.CANVAS_BACKGROUND);

	}

	@Override
	public void paintComponent(Graphics g) {
		// Create Line2D.
		Line2D line = new Line2D.Double(CANVAS_WIDTH / 2, 0, CANVAS_WIDTH / 2, CANVAS_HEIGHT);

		// Create Rectangle2D.
		Rectangle2D ractangleLeft1 = new Rectangle2D.Double(0, 150, 60, 200);
		Rectangle2D ractangleLeft2 = new Rectangle2D.Double(0, 80, 150, this.CANVAS_HEIGHT - 80 * 2);
		Rectangle2D ractangleRight1 = new Rectangle2D.Double(this.CANVAS_WIDTH - 60, 150, 60, 200);
		Rectangle2D ractangleRight2 = new Rectangle2D.Double(this.CANVAS_WIDTH - 150, 80, 150,
				this.CANVAS_HEIGHT - 80 * 2);

		// Create circle by Ellipse2D.
		Ellipse2D dotCircleLeft = new Ellipse2D.Double(((150 - 60) / 2) + 60, this.CANVAS_HEIGHT / 2,
				this.DOT_CIRCLE_RADIUS, this.DOT_CIRCLE_RADIUS);
		Ellipse2D dotCircleRight = new Ellipse2D.Double(this.CANVAS_WIDTH - (((150 - 60) / 2) + 60),
				this.CANVAS_HEIGHT / 2, this.DOT_CIRCLE_RADIUS, this.DOT_CIRCLE_RADIUS);

		Ellipse2D dotCircleCenter = new Ellipse2D.Double((this.CANVAS_WIDTH / 2) - 50, (this.CANVAS_HEIGHT / 2) - 50,
				this.CIRCLE_RADIUS * 2, this.CIRCLE_RADIUS * 2);

		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		// Set stroke is 4.
		g2d.setStroke(new BasicStroke(LINE_WIDTH));
		// Set color line is black.
		g2d.setColor(Color.BLACK);
		// Draw line center.
		g2d.draw(line);
		// Draw rectangle left side.
		g2d.draw(ractangleLeft1);
		g2d.draw(ractangleLeft2);
		// Draw rectangle right side.
		g2d.draw(ractangleRight1);
		g2d.draw(ractangleRight2);
		// Draw dot circle left side.
		g2d.draw(dotCircleLeft);
		g2d.fill(dotCircleLeft);
		// Draw dot circle right side.
		g2d.draw(dotCircleRight);
		g2d.fill(dotCircleRight);

		// Set color circle center is white.
		g2d.setColor(Color.WHITE);
		// Draw circle center.
		g2d.draw(dotCircleCenter);

	}

}