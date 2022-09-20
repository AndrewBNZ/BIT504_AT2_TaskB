import java.awt.Color;

public class Ball extends Sprite {

	final static Color BALL_COLOUR = Color.RED;
	final static int BALL_WIDTH = 25, BALL_HEIGHT = 25;

	public Ball(int panelWidth, int panelHeight) {

		setWidth(BALL_WIDTH);
		setHeight(BALL_HEIGHT);
		setColour(BALL_COLOUR);
		setInitialPosition(panelWidth / 2 - (getWidth() / 2), panelHeight / 2 - (getHeight() / 2));
		resetToInitialPosition();

	}

}
